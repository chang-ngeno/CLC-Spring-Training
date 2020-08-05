var app = angular.module('adminApp', [ 'ngRoute' ,'ngAnimate', 'ngSanitize','ngTouch', 'ui.bootstrap' ]);
app.config(['$routeProvider','$locationProvider',function($routeProvider, $locationProvider) {
    	var applicationName = 'Site Administration';
	$routeProvider
        .when('/', {
            controller : 'HomeController',
            templateUrl : 'static/app/partials/dashboard.html'
        })
        /*
         * .when('/login', { controller: 'homeController', templateUrl:
         * 'modalContainer' })
         */
        .when('/user', {
            controller : 'UserController',
            templateUrl : 'static/app/partials/user.html'
        })
        .when('/users', {
            controller : 'UserListController',
            templateUrl : 'static/app/partials/users.html'
        })
        .when('/images', {
            controller : 'UserListController',
            templateUrl : 'static/app/partials/pictures.html'
        })
        .when('/error', {
            controller : 'ErrorController',
            templateUrl : 'error/error.html'
        })    
        /*
         * .when('/register',{ controller:'RegisterController',
         * templateUrl:'static/partials/viewLoginRegister#register' })
         */
        .otherwise({
            redirectTo : '/'
        });

	$locationProvider.html5Mode(true);
	//$locationProvider.hashPrefix('');
}]);
app.controller('DropdownCtrl', function ($scope, $log) {
  $scope.items = [
    'The first choice!',
    'And another choice for you.',
    'but wait! A third!'
  ];

  $scope.status = {
    isopen: false
  };

  $scope.toggled = function(open) {
    $log.log('Dropdown is now: ', open);
  };

  $scope.toggleDropdown = function($event) {
    $event.preventDefault();
    $event.stopPropagation();
    $scope.status.isopen = !$scope.status.isopen;
  };

  $scope.appendToEl = angular.element(document.querySelector('#dropdown-long-content'));
});
app.directive('ngFiles', ['$parse', function ($parse) {

    function fn_link(scope, element, attrs) {
        var onChange = $parse(attrs.ngFiles);
        element.on('change', function (event) {
            onChange(scope, { $files: event.target.files });
        });
    };

    return {
        link: fn_link
    }
} ])