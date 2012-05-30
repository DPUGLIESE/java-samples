package pe.joedayz.ejemplos.cxf;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


/** La interfaz del servicio web se anota con @WebService y el resto de las
 * anotaciones estandar de JWS. Con esta unica anotacion es suficiente para
 * tener un web service funcionando con Apache CXF.
 */
@WebService
public interface HolaMundo {

	
	  /** Cada m�todo sera una operaci�n del web service. Puede ser tan simple
     * como este ejemplo, sin niguna anotaci�n extra. En este caso, el nombre
     * del par�metro y del mensaje de resultado ser�n generados por defecto.
     */
    String decirHola(String nombre);

    /** Los m�todos pueden tambi�n devolver objetos complejos. Adem�s, es
     * posible utilizar las anotaciones @WebResult y @WebParam para darle
     * nombres espec�ficos a los mensajes del web service.
     */
    @WebResult(name="persona")
    Persona buscarPersona(@WebParam(name="legajo") long legajo);
}
