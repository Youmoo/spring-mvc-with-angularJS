<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="user">
<head>
    <title></title>
    <script src="/js/vendor/angular.min-1.2.js"></script>
    <script src="/js/user.js"></script>
</head>
<body ng-controller="userCtrl">
<ul>
    <li ng-repeat="user in users" ng-bind="user.username"></li>
</ul>
</body>
</html>
