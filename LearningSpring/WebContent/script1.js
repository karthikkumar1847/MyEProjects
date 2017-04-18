

var myApp = angular.module("myModule",[]);
/*var myController = function($scope){
	
	$scope.message = "Welcome to Angular JS World"
};*/
myApp.controller("myController",function($scope){
	var cmpny = {firstName:'Green',
			     lastName:'Spark',
			     year:'2017'
	};
	$scope.company = cmpny;
	$scope.message = "Welcome to Angular JS World!!";
});