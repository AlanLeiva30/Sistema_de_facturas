
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Alan Leiva
 */
public class Conexion {
  
//conexion local

    /**
     *
     * @return
     */
public static Connection conectar() {
    try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_factura", "root", "");
        return cn;
    } catch (SQLException e) {
        System.out.println("Error en la conexion local " + e);
    }
    return null;
}

    
}
