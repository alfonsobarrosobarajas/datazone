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
                    list();
                });
        };

        $scope.update = (kit) => {

            const conf = $window.confirm('Modify record ' + kit.description + '?')

            if(conf){

                $http.delete('/kit/update/' + kit.id, kit).then((response) => {
                    list();
                });

            };
        };

        $scope.remove = (kit) => {

            const conf = $window.confirm('Remove record ' + kit.description + '?')

            if(conf){

                $http.delete('/kit/remove/' + kit.id).then((response) => {
                    list();
                });

            };
        };


        function list(){

            $http.get('/kit/list').then(
                (response) => {

                    $scope.kits = response.data;

                },
                (response) => {
                    $window.alert('Not information yet!');
                });

        }

        list();

    })