/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracon.clases.ejemplo.paises;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;

/**
 *
 * @author Jr
 */
@WebService(serviceName = "Paises")
public class Paises {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "obtenerDatos")
    public String[] obtenerDatos(@WebParam(name = "pais") String pais) {
        String[] result = new String[2];
        
        GlobalWeather gw  = new GlobalWeather();
        GlobalWeatherSoap gwsoap = gw.getGlobalWeatherSoap();
        
        Airport aer = new Airport();
        AirportSoap aersoap = aer.getAirportSoap();
        
        result[0]=gwsoap.getCitiesByCountry(pais);
        result[1] = aersoap.getAirportInformationByCountry(pais);
                
        return result;
    }
}
