var app = angular.module('kitModule', [])
    .controller('kitController', function($scope, $http, $window){

        $scope.kit = {
            id : null,
            code : null,
            description : null
        };

        $scope.kits = [];

        $scope.add = (kit) => {

            $http.post('/kit/add', kit).then(
                (response) => {
                    $window.alert('Record added');
                },
                (response) => {});

        };

        function list(){

            $http.get('/kit/list').then(
                (response) => {

                    $scope.kits = response.data;

                },
                (response) => {

                });

        }

        list();

    })