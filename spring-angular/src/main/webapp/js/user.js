;
(function (angular) {
    "use strict";
    angular.module("user", [])
        .controller("userCtrl", ["$scope", "userService"
            , function ($scope, userService) {
                userService.list().success(function (json) {
                    if (json && json.ok) {
                        $scope.users = json.users;
                    }
                })
            }])
        .service("userService", ["$http"
            , function ($http) {
                this.list = function () {
                    return $http.get("/ajax/execute.do", {params: {
                        command: "user",
                        group: "list"}
                    });
                }
            }]);
})(angular);