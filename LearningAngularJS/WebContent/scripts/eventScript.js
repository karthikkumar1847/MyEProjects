var myApp = angular.module("myModuleEvent", []);

	myApp.controller("myCtrlEvent",function($scope){
		var technologies = [
	 		
			{name:"Java",likes:0,dislikes:0},
			{name:"C#",likes:0,dislikes:0},
			{name:"Angular JS",likes:0,dislikes:0},
			{name:"Hadoop",likes:0,dislikes:0},
			{name:"AWS",likes:0,dislikes:0}
			];
	$scope.technologies = technologies;
	$scope.incrementLikes = function(technology){
		technology.likes++;
	};
	$scope.incrementDisLikes = function(technology){
		technology.dislikes++;
	};
	});
	