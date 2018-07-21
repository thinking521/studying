'use strict';   //使用严格语法模式

//模块的名字是myApp.view1
//模块会引用ngRoute
//注入了$routeProvider
//如果你请求的是/view1,
//则对应的控制器为View1Ctrl
//最后得到的结果转给view1/view1.html
//控制器的名字是View1Ctrl
angular.module('myApp.view1', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view1', {
    templateUrl: 'view1/view1.html',
    controller: 'View1Ctrl'
  });
}])

.controller('View1Ctrl', ['$scope', '$http',function($scope, $http) {
	
	$scope.btnCalendarUpdate=function(x){
		$scope.calendar=x;
		$scope.calendar.flag=1;
	}
	//selectAll
	function funCalendarSelectall(){
			$http.get('/calendarSelectAll?np=1&size=10')
				.success(function(data) {
					$scope.me = data;
					console.log(data);
					
				}).error(function() {
					alert("有异常");
				});	
	}
	//selectAll
	
		//delete
	$scope.btnCalendarDelete=function(id1){
		if(window.confirm("删除吗?")){
			//http
			$http.get('/calendarDelete?id='+id1)
				.success(function(data) {
					$scope.me = data;
					console.log(data);
					funCalendarSelectall();
				}).error(function() {
					alert("有异常");
				});
			//http
		}
	}
	//delete
	
	//加载
	$scope.$on('$viewContentLoaded', function() {  
		//alert('页面载入后触发的方法'); 
			funCalendarSelectall();
	
	})	
	//insert
	$scope.processForm = function() {

		//增加功能,在控制台上完成打印
		console.log($scope.calendar);
		//发起http请求开始
		//			//建议以下的json数据格式
				//请求结束
		if($scope.calendar.id>0){
			$http({
					method: 'post',
					url: '../calendarUpdate',
					data: $scope.calendar,
					headers: {
						'Content-Type': 'application/x-www-form-urlencoded'
					},
					transformRequest: function(obj) {
						var str = [];
						for(var s in obj) {
							str.push(encodeURIComponent(s) + "=" + encodeURIComponent(obj[s]));
						}
						return str.join("&");
					}
				}).success(function(req) {
					console.log(req);
					funCalendarSelectall();
				});
				//请求结束
		}
		else
		{
			$http({
					method: 'post',
					url: '../calendarInsert',
					data: $scope.calendar,
					headers: {
						'Content-Type': 'application/x-www-form-urlencoded'
					},
					transformRequest: function(obj) {
						var str = [];
						for(var s in obj) {
							str.push(encodeURIComponent(s) + "=" + encodeURIComponent(obj[s]));
						}
						return str.join("&");
					}
				}).success(function(req) {
					console.log(req);
					funCalendarSelectall();
				});
		}

		
	}
}
	//insert

]);