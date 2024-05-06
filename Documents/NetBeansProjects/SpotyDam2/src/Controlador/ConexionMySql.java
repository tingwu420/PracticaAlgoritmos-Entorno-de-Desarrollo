/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.util.Calendar;
import java.util.TimeZone;
import java.sql.*;
/**
 *
 * @author wate
 */
public class ConexionMySql {
        private String BD;
        private String USUARIO;
        private String PASS;
        private String HOST;
        private Connection connection;
        private TimeZone zonaHoraria;
        
        
        public ConexionMySql(String usuario, String contraseña, String bd) throws ClassNotFoundException{
            HOST = "localHost";
            USUARIO = usuario;
            PASS = contraseña;
            BD = bd;
            connection = null;
           
        }
           private void registrarDriver() throws SQLException {
            
            try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
            }catch(ClassNotFoundException e){
                throw new SQLException("Error");
            }
           
        }
        
        
        
        
        public void conectar() throws SQLException{
            if((connection == null) || connection.isClosed()){
                registrarDriver();
                Calendar now = Calendar.getInstance();
                zonaHoraria = now.getTimeZone();
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BD+"?user =" + USUARIO+"&password="+PASS+"&userLegacyDateTimeCode=false&ServerTimeZone=" + zonaHoraria.getID());
            }
        }
        
        public void desconectar() throws SQLException{
             if((connection != null) && !connection.isClosed()){
                 connection.close();
            }
        }
        
        public ResultSet ejecutarSelect(String consulta) throws SQLException {
            Statement stmt = connection.createStatement();
            return stmt.executeQuery(consulta);
        }
    
        public int ejecutarInsertDeleteUpdate(String consulta) throws SQLException{
            Statement stmt = connection.createStatement();
            return stmt.executeUpdate(consulta);
        }

}
