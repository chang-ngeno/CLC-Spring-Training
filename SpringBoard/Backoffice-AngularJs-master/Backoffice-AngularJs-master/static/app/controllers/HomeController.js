app.controller('HomeController',function($scope, $location, $route, $routeParams,$rootScope){
    $scope.$route = $route;
    $scope.$location = $location;
    $scope.$routeParams = $routeParams;
    $rootScope.pageName = "Dashboard";
    $rootScope.applicationName = "Back Office";
		/*var modalInstance = '';
		$scope.openModal = function(task){
			modalInstance = $modal.open({
				animation: false,
				templateUrl: 'views/modal_window.html',
				controller: 'modalOpenCtrl',
				scope: $scope,
				size: 'md',
				backdrop: 'static',
				resolve: {
				 payload: function () {
				     return {
				     	msg_body : 'Hello! I am payload msg',
				     	title : 'Hello! Title',
				     	body_title : 'UiBootstrap.net'
				     };
				 }
				}
			});
		}

		$scope.cancelModal = function(){
         	modalInstance.dismiss('cancel');
      	}*/
    $scope.isActive = function(route){
    	return route === '/';
    }
});
