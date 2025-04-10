package FGDexamen;
/*
 * Daniel Fernandez Garcia - 77551592P
 * DAM 1
 */
import java.util.Arrays;

public class Servidor extends Host {
    static enum protocol {TCP, UDP}
    // Tu código aquí
    String servicio;
    int puerto;
    protocol prot;
    Servidor(String nombre, String ip, String mac ) throws Exception {
            super(nombre, ip, mac);
            //TODO Auto-generated constructor stub
        }
        
        

        boolean addServicio(String servicio, int puerto, protocol prot) {
            if (puerto<1||puerto>65535) return false;
            
            this.servicio=servicio;
            this.puerto=puerto;
            this.prot=prot;
            return true;
        }
        public static void main(String[] args) {
        System.out.println("\nClase Servidor");
        System.out.println("==============\n");
        Servidor s1 = new Servidor("dam1", "192.168.0.117", "CC-11-22-33-44-AA");
        s1.addServicio("MySQL", 3306, "TCP");
        Servidor s2 = new Servidor("seixo", "192.168.0.11", "BB:11:22:33:44:55");
        s2.addServicio("HTTP", 80, "TCP");
        s2.addServicio("Proxy", 3128, "TCP");
        Servidor s3 = new Servidor("lapaman", "192.168.0.9", "AA:11:22:33:44:55");
        s3.addServicio("HTTP", 80, "TCP");
        s3.addServicio("Web", 80, "TCP");
        s3.addServicio("DNS", 53, "UDP");
        s3.addServicio("FTP", 21, "TCP");
        s3.addServicio("SSH", 22, "TCP");        

        Servidor[] servidores = { s1, s2, s3 };
        for (Servidor s : servidores) {
            System.out.println(s);
        }

        // Tu código aquí

    }
}

Servicio (String servicio, int puerto, protocol prot) {
    this.servicio=servicio;
    this.puerto=puerto;
    this.prot=prot;
}
