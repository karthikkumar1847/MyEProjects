var myApp = angular.module("myModule", []);

	myApp.controller("myCtrl",function($scope){
	
		$scope.employee = {
		
				fname:'Jack',
				lname:'Sparrow',
				role:'ceo'
			};
		var employees = [
 		
					{fName:"jack",lName:"sparrow",age:25,role:"pirate",salary:55000},
					{fName:"peter",lName:"parker",age:20,role:"spider",salary:65000},
					{fName:"lenardo",lName:"dCaprio",age:24,role:"hero",salary:10000},
					{fName:"will",lName:"smith",age:25,role:"artist",salary:95000},
					{fName:"sachin",lName:"tendulkar",age:25,role:"batsman",salary:55000}
					];
 		$scope.employees = employees;
	});
	
	myApp.controller("myCtrl2", function($scope) {
 	 	
 		$scope.countries = [
			
			{
				name:"UK",
				cities:[{name:"London"},
						{name:"Manchester"},
						{name:"Birmingham"}]
			},
			{
				name:"USA",
				cities:[{name:"New York"},
						{name:"San Francisco"},
						{name:"Detroit"}]
			},
			{
				name:"Germany",
				cities:[{name:"Munich"},{name:"Berlin"},{name:"Frankfurt"}]
			}
		];

 	 });


