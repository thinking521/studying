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

.controller('View1Ctrl', ['$scope', '$http', '$location', function($scope, $http, $location) {
    var user_name = "";

	$scope.btnResultinfoUpdate=function(x){
		$scope.resultinfo=x;
		$scope.resultinfo.flag=1;
	}

	//selectAll
	function funResultinfoSelectall(){
        var create_date = "";
        // var user_name = "";

        if (isEmpty($scope.resultinfo)) {
            var myDate = new Date();
            var year = myDate.getFullYear();
            var month = myDate.getMonth() + 1;
            if (month < 10) {
                month = "0" + month;
			}
            var day = myDate.getDate();
            if (day < 10) {
                day = "0" + month;
            }
            create_date = year + "-" + month + "-" + day;
            //create_date = year + "-" + month + "-" + day + " 00:00:00";
            // user_name = "test";
        } else {
        	create_date = $scope.resultinfo.create_date;
        	// user_name = $scope.resultinfo.user_name;
		}

        $http.get('/resultinfoSelect?create_date='+ create_date + '&user_name='+ user_name)
				.success(function(data) {
					$scope.me = data;
					console.log(data);
					
				}).error(function() {
					alert("funResultinfoSelectall有异常");
				});	
	}
	//selectAll

    function funCaseInfoSelect(){
        $http.get('/typeinfoSelect?type=1')
            .success(function(data) {
                $scope.caseInfo = data;
                console.log(data);
            }).error(function() {
            	alert("funCaseInfoSelect有异常");
        });
    }

    function funPojectPeriodInfoSelect(){
        $http.get('/typeinfoSelect?type=2')
            .success(function(data) {
                $scope.projectPeriodInfo = data;
                console.log(data);
            }).error(function() {
            	alert("funPojectPeriodInfoSelect有异常");
        });
    }

    function funJobPeriodInfoSelect(){
        $http.get('/typeinfoSelect?type=3')
            .success(function(data) {
                $scope.jobPeriodInfo = data;
                console.log(data);
            }).error(function() {
            	alert("funJobPeriodInfoSelect有异常");
        });
    }
	
	//加载
	$scope.$on('$viewContentLoaded', function() {
		user_name = sessionStorage.getItem("userId");

		if (isEmpty(user_name)) {
			$location.path('/login');
		}

		//alert('页面载入后触发的方法');
		funResultinfoSelectall();

        funCaseInfoSelect();
        funPojectPeriodInfoSelect();
        funJobPeriodInfoSelect();
	})

    //delete
    $scope.btnResultinfoDelete=function(id){
        if(window.confirm("删除吗?")){
            //http
            $http.get('/resultinfoDelete?result_id='+ id)
                .success(function(data) {
                    $scope.me = data;
                    console.log(data);
                    funResultinfoSelectall();
                }).error(function() {
                	alert("btnResultinfoDelete有异常");
            });
            //http
        }
    }
    //delete

	//insert
	$scope.processForm = function() {

		//增加功能,在控制台上完成打印
		console.log($scope.resultinfo);
		//发起http请求开始
		//			//建议以下的json数据格式
				//请求结束

        // $scope.resultinfo.user_name="test";
        $scope.resultinfo.user_name = user_name;

		if($scope.resultinfo.flag == 1){
			$http({
					method: 'post',
					url: '../resultinfoUpdate',
					data: $scope.resultinfo,
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
					funResultinfoSelectall();
				});
				//请求结束
		}
		else
		{
			$http({
					method: 'post',
					url: '../resultinfoInsert',
					data: $scope.resultinfo,
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
					funResultinfoSelectall();
				});
		}

		
	}
}
	//insert

]);