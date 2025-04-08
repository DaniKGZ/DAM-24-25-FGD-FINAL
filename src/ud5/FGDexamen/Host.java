package FGDexamen;
/*
 * Daniel Fernandez Garcia - 77551592P
 * DAM 1
 */
import java.util.Arrays;
import java.util.Scanner;

public class Host implements Comparable {
    String mask, dns, puerta, ip, mac, nombre;
    // Tu código aquí
    Host(String nombre, String ip, String mac) throws Exception {
        if (ip!=null) {
            if (validarIP(ip)) {
                this.ip=ip;
            } else throw new IllegalArgumentException("La IP no es valida. Asegurate de introducir el formato adecuado.");
        }

        if (validarMAC(mac)) {
            this.mac=mac;
        } else throw new IllegalArgumentException("La MAC no es valida. Asegurate de introducir el formato adecuado.");

        if (nombre!=(null)) {
            this.nombre=nombre;
        } else throw new IllegalArgumentException("Por favor, introduce un nombre.");

        mask="255.255.0.0";
        dns="192.168.0.11";
        puerta="192.168.0.9";
    }
    
    @Override
    public boolean equals(Object obj) {
        String[] parts1 = mac.split("[:]");
        String[] parts2 = ((Host)obj).mac.split("[:-]");
        for (int i = 0; i < parts2.length; i++) {
            if (!parts1[i].equals(parts2[i])) {
                return false;
            }
        } return true;        
    }

    // toString(): Devuelve una representación en cadena del host con el siguiente formato: 
    //nombre (ip / mac). 

    @Override
    public String toString() {
        return nombre+" ("+ip+" / "+mac+").";
    }



    boolean validarIP(String ip) {
        return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    boolean validarMAC(String mac) {
        return mac.matches("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
    }

    public int compareTo(Object o) {        
        int res = nombre.compareTo(((Host) o).nombre); 
        return res; 
    } 

    public static void main(String[] args) throws Exception {
        System.out.println("\nClase Host");
        System.out.println("==========\n");
        Host h100 = new Host("host100", "192.168.117.100", "00:11:22:33:44:55");
        Host h101 = new Host("equipo101", "192.168.117.101", "00:11:22:33:44:55");
        Host h102 = new Host("nodo100", "192.168.117.100", "00-11-22-33-44-AA");
        Host h103 = new Host("host103", "192.168.117.103", "00-11-22-33-44-55");

        Host[] hosts = { h100, h101, h102, h103};
        Arrays.sort(hosts);
        for (Host h : hosts) {
            System.out.println(h);
        }
        System.out.println(h100.nombre + " = " + h101.nombre + "? " + h100.equals(h101)); // true
        System.out.println(h100.nombre + " = " + h102.nombre + "? " + h100.equals(h102)); // false
        System.out.println(h100.nombre + " = " + h103.nombre + "? " + h100.equals(h103)); // true
    }
}