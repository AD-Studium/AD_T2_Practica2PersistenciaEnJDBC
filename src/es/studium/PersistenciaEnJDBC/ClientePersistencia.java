/**
 * 
 */
package es.studium.PersistenciaEnJDBC;

/**
 * @author Alvca
 *
 */
public class ClientePersistencia {
	public static int createCliente(String nombre, String apellidos, String email, String dni, String clave) {
		return 0;
		/* Devuelve el id del nuevo cliente */
	}
	
	public static String readCliente(int idCliente, String campo) {
		return campo;
		/* Devuelve el valor de la columna "campo" del cliente identificado por "idCliente" */
	}
 
	public static boolean updateCliente(int idCliente, String campo, String nuevoValor) {
		return false;
		/* Actualiza el valor de la columna "campo" del cliente identificado por "idCliente". Devuelve true si se ha logrado actualizar. */
	}
 
	public static boolean deleteCliente(int idCliente) {
		return false;
		/* Elimina el cliente identificado por "idCliente". Devuelve true si se ha logrado eliminar. */
	}
}
