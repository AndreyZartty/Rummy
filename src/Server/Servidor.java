/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class Servidor {
    
    JFrameServidor ventana;
    Socket cliente;
    //Socket cliente2;
    ArrayList<threadServidor> threads = new ArrayList<>(); 
    //public ArrayList<threadServidor> hilosserver;
    
    public Servidor(JFrameServidor padre)
    {
        // asigna la ventana
        this.ventana = padre;
    }
    
    public void runServer()
    {
        try {
            //crea el socket servidor para aceptar dos conexiones
            ServerSocket serv = new ServerSocket(8081);
            ventana.mostrar(".::Servidor Activo");
            ventana.mostrar(".::Esperando usuarios");
            
            // espera primer cliente
            while (true)
            {
                cliente = serv.accept();
                ventana.mostrar(".::Cliente Aceptado");
                threadServidor user = new threadServidor(cliente, this,1);
                threads.add(user);
                user.start();
            
            /*
            // espera segundo cliente
            cliente2 = serv.accept();
            ventana.mostrar(".::Segundo Cliente Aceptado");
            threadServidor user2 = new threadServidor(cliente2, this,2);
            user2.start();
            
            // 
            user1.enemigo = user2;
            user2.enemigo = user1;
            */
            
            
            
            
            
            }
            
        } catch (IOException ex) {
            ventana.mostrar("ERROR ... en el servidor");
        }
    }

}
