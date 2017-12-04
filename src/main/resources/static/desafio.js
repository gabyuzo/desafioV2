var app = angular.module('myApp', []);
	
	app.service('MyService', function ($http){
		return {
			extrato: extrato
		}
		
		function extrato(){
			return $http.get("extrato/lancamentos");
		}
	});
	
	app.controller('MyController', function($scope, MyService) {
		
		init();
		
		function init(){
			conectaExtrato();
		}
		
		function conectaExtrato(){
			MyService.extrato().then(function(res){
				$scope.extratos = res.data;
			}).catch(function(err){
				console.log(err)
			});
		}
	});