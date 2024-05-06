/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cancion;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author wate
 */
public class ControladorCanciones {
    private ConexionMySql conexion;
    public ControladorCanciones(ConexionMySql conexion){
        this.conexion = conexion;
    }
    
    public ArrayList<Cancion> obtenerCanciones() throws SQLException {
        
        ArrayList<Cancion> lista = new ArrayList<>();
        String consulta = "SELECT * FROM canciones";
        ResultSet rset =  conexion.ejecutarSelect(consulta);

        while(rset.next()){
            String titulo = rset.getString("titulo");
            String album = rset.getString("album");
            String artista = rset.getString("artista");
            String duracion = rset.getString("duracion");
            
            lista.add(new Cancion(titulo,album,artista,duracion));
        }
        
        return lista;
    }
}
