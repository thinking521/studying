'use strict';

angular.module('myApp.view0', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/login', {
    templateUrl: 'view0/view0.html',
    controller: 'View0Ctrl'
  });
}])

.controller('View0Ctrl', ['$scope', '$http', '$location', function($scope, $http, $location) {

    //selectAll
    $scope.funLogin = function(){
        if (isEmpty($scope.user) || isEmpty($scope.user.id)) {
            alert("请输入用户名!");
            return;
        }

        if (isEmpty($scope.user.password)) {
            alert("请输入密码!");
            return;
        }

        $http.get('/login?id='+ $scope.user.id + '&password='+ $scope.user.password)
            .success(function(data) {
                console.log(data);

                if(data == -1) {
                    alert("用户不存在!");
                    return;
                } else if(data == -2) {
                    alert("密码错误!");
                    return;
                }

                sessionStorage.setItem("userId", $scope.user.id);
                $location.path('/view1');

            }).error(function() {
                alert("funLogin有异常");
        });
    }
}]);