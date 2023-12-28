package database;

import java.sql.*;


public class BaseDeDatos {
	public static void main(String[] args) {
	    Connection conexion = null;
	    int dni;
		try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Se obtiene una conexión con la base de datos.
            // En este caso nos conectamos a la base de datos prueba
            // con el usuario root y contraseña 1daw
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/concesionario", "root", "");              

            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el ResultSet resultado
          // ResultSet cursor = s.executeQuery("select * from clientes");
            
            //RESULT SET SE LE DA UN NOMBRE Y SE IGUALA A LA CONSULTE QUE QUERAMOS HACER, SIMEPRE CON LA VAR DE CONEXION A LANTE
            
            //MODIFICAR EL NOMBRE DE ALGUIEN 
            //primero hacer un select del dni para despues en el update ponerlo en el where
            ResultSet resultado = s.executeQuery("SELECT DNI FROM clientes WHERE nombre='pablo'");
            
            if(resultado.next()){   //Si rs.next() devuelve true significa que al menos hay un registro
                dni = resultado.getInt("DNI");  //se obtienen su id SEGUN LO QUE DEVUELVA SE PONE UN GET Y OTRO
                //se actualiza el registro
                s.executeUpdate("UPDATE clientes SET NOMBRE='Pedro' WHERE DNI='"+dni+"'");    //RECORDAR SIMPRE PONER LAS COMILLAS                      
             }
        

            // Se recorre el ResultSet, mostrando por pantalla los resultados.
          //  while (cursor.next()) {
         //       System.out.println(resultado.getString("DNI") + " " + resultado.getString("NOMBRE") + " " + resultado.getString("APELLIDO")+" " + resultado.getString("CIUDAD"));                
        //    }

		
		
		} catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally { // Se cierra la conexión con la base de datos.
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
	}

}
