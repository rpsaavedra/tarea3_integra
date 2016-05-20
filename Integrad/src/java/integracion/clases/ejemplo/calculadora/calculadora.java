/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion.clases.ejemplo.calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jr
 */
@WebService(serviceName = "calculadora")
public class calculadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "sumar")
    public double sumar(@WebParam(name = "operador1") double operador1, @WebParam(name = "operador2") double operador2) {
        return operador1 + operador2 ;
    }
}
