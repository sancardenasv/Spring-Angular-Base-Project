var app = angular.module('application', []);
app.controller('mainController', function($scope, $http) {
	$http.get("/api/contactList")
		.then(function(success) {
			$scope.contactList = success.data;
		}, function(error) {
			
		});
});