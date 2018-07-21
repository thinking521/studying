'use strict';

angular.module('myApp.view2', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view2', {
    templateUrl: 'view2/view2.html',
    controller: 'View2Ctrl'
  });
}])

.controller('View2Ctrl', ['$scope', '$http', '$location', function($scope, $http, $location) {
    var user_id = "";

    //selectAll
    $scope.funResultinfoSelectall = function(){
        if (isEmpty($scope.resultinfo) ||
               (isEmpty($scope.resultinfo.create_date) &&
                isEmpty($scope.resultinfo.case_id) &&
                isEmpty($scope.resultinfo.user_name))) {
            alert("请输入检索条件!");
            return;
        }

        var create_date = !isEmpty($scope.resultinfo.create_date) ? $scope.resultinfo.create_date : "";
        var case_id = !isEmpty($scope.resultinfo.case_id) ? $scope.resultinfo.case_id : "";
        var user_name = !isEmpty($scope.resultinfo.user_name) ? $scope.resultinfo.user_name : "";

        $http.get('/resultinfoSelectAll?create_date='+ create_date + '&case_id='+ case_id + '&user_name='+ user_name)
            .success(function(data) {
                $scope.me = data;
                console.log(data);

            }).error(function() {
            alert("funResultinfoSelectall有异常");
        });
    }
    //selectAll

    $scope.resultExport = function () {
        alert("开发中。。。");
    }

    function funCaseInfoSelect(){
        $http.get('/typeinfoSelect?type=1')
            .success(function(data) {
                $scope.caseInfo = data;
                console.log(data);
            }).error(function() {
            alert("funCaseInfoSelect有异常");
        });
    }

    function funUserInfoSelect(){
        $http.get('/userSelect')
            .success(function(data) {
                $scope.userInfo = data;
                console.log(data);
            }).error(function() {
             alert("funUserInfoSelect有异常");
        });
    }

    //加载
    $scope.$on('$viewContentLoaded', function() {
        user_id = sessionStorage.getItem("userId");

        if (isEmpty(user_id)) {
            $location.path('/login');
        }
        //alert('页面载入后触发的方法');
        funCaseInfoSelect();
        funUserInfoSelect();
    })
}]);