var myApp = angular
				.module("myModule1", [])
				.controller("myCtrl1",function($scope){
				$scope.movie	= {
						name:'Bahubali2',
						director:'Rajamouli',
						year:'2017',
						posterType:'Elephant Bridge',
						image:'Images/bahubali.png'				
				};
				$scope.msg = "type here";
				});

