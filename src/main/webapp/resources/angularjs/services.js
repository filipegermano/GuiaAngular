app.factory("serviceForm", function(config, $http) {

    var _saveDiretiva = function(diretiva) {
        return $http.post("GuiaAngular/services/diretiva", angular.toJson(diretiva));
    };
 
    return {
        saveDiretiva : _saveDiretiva
    };
 
});