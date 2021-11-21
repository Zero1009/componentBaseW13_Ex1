/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Theerakan
 */
@WebService(serviceName = "calRoundCircle")
public class calRoundCircle {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calRound")
    public double calRound(@WebParam(name = "radius") double radius) {
        //TODO write your implementation code here:
        return 2 * 3.14 * radius;
    }

    /**
     * This is a sample web service operation
     */
    
}
