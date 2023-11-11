/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author XPC
 */
public class Partida {
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Jugador host;
    private int size;
    private String name;

    public Partida(Jugador host, String name, int size) {
        this.name = name;
        this.host = host;
        this.size = size;
        jugadores.add(host);
    }
    
    public void addJugador(Jugador newPlayer){
        jugadores.add(newPlayer);
    }
    public void removeJugador(String eliminar){
        for (int i = 0; i < jugadores.size(); i++) {
            if(jugadores.get(i).getName().equals(eliminar)){
                jugadores.remove(i);
            }
            
        }
    }
    
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Jugador getHost() {
        return host;
    }

    public void setHost(Jugador host) {
        this.host = host;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
