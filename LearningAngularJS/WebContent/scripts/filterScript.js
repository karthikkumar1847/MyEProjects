var app = angular
			.module("myModuleFilter", [])
			.controller("myCtrlFilter",function($scope){
			
		var employees = [
			
			{name:"jack",dateOfBirth: new Date("November 23,1985"),gender:"Male",salary:55000.88},
			{name:"parker",dateOfBirth: new Date("August 02,1983"),gender:"Male",salary:35000.843},
			{name:"peter",dateOfBirth: new Date("May 12,1945"),gender:"Male",salary:54000.83},
			{name:"stella",dateOfBirth: new Date("June 13,1970"),gender:"FeMale",salary:15000.23},
			{name:"dravid",dateOfBirth: new Date("January 11,1973"),gender:"Male",salary:95000}
		];
		$scope.employees = employees;
		$scope.rowLimit = 3;
		$scope.sortColumn = "name";
	});