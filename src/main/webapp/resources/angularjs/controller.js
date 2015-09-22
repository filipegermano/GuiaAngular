/* global diretivaFormValidation */
(function(){ 
    
app.controller("ctrlDiretiva", function($scope,
        serviceForm) {
 
    $scope.listaDiretivas = {};
    $scope.diretiva = {};
     
    //registra o id de uma diretiva na tabela
    $scope.checkboxIdDiretiva = {
            id : -1,
     };
     
    //seleciona uma diretiva na tabela
    $scope.selectDiretiva = function(diretiva) {
         
        $scope.diretiva = diretiva;     
         
    };    
     
    //getAllDiretivas lista todos os dados
    var listarDiretivas = function() {
        serviceForm.getAllDiretivas().success(
                function(data, status, headers, config) {
 
                    $scope.listaDiretivas = data;
 
                }).error(function(data, status, headers, config) {
 
            switch (status) {
            case 401: {
                $scope.message = "Você precisa ser autenticado!"
                break;
            }
            case 500: {
                $scope.message = "Erro!";
                break;
            }
            }
            console.log(data, status);
        });
    };
    listarDiretivas();
     
    //getByIdDiretiva
    //saveDiretiva salva um novo registro de uma diretiva
    $scope.saveDiretiva = function(diretiva) {
        serviceForm.saveDiretiva(diretiva).success(
                function(data, status, headers, config) {
                    listarDiretivas();
                    $scope.message = "registro Diretiva salvo com sucesso!";
                }).error(function(data, status, headers, config) {
            switch (status) {
            case 401: {
                $scope.message = "Você precisa ser autenticado!"
                break;
            }
            case 500: {
                $scope.message = "Erro!";
                break;
            }
            }
            console.log(data, status);
        });
    };
     
    //updateDiretiva atualiza registro de uma diretiva quando selecionado na tabela
    $scope.updateDiretiva = function(diretiva) {
        serviceForm.updateDiretiva(diretiva).success(
                function(data, status, headers, config) {
                    listarDiretivas();
                    $scope.message = "registro Diretiva salvo com sucesso!";
                }).error(function(data, status, headers, config) {
            switch (status) {
            case 401: {
                $scope.message = "Você precisa ser autenticado!"
                break;
            }
            case 500: {
                $scope.message = "Erro!";
                break;
            }
            }
            console.log(data, status);
        });
    };

    //deleteDiretiva remove um registro de uma diretiva quando selecionado na tabela
    $scope.deleteDiretiva = function(diretiva) {
        serviceForm.deleteDiretiva(diretiva.id).success(
                function(data, status, headers, config) {
                    listarDiretivas();
                    $scope.message = "registro Diretiva savo com sucesso!";
                }).error(function(data, status, headers, config) {
            switch (status) {
            case 401: {
                $scope.message = "Você precisa ser autenticado!"
                break;
            }
            case 500: {
                $scope.message = "Erro!";
                break;
            }
            }
            console.log(data, status);
        });
    };
 
});

})();