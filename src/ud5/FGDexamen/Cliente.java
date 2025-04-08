package FGDexamen;
/*
 * Daniel Fernandez Garcia - 77551592P
 * DAM 1
 */
import java.util.Arrays;

public class Cliente extends Host {

    // Tu código aquí
    static enum SO{
        WINDOWS, LINUX, MAC, ANDROID, IOS;
    }
    SO sisOp;
    String res;

    Cliente(String nombre, String ip, String mac, SO sisOp, String res) throws Exception {
            super(nombre, ip, mac);
            this.sisOp=sisOp;
            this.res=res;
            //TODO Auto-generated constructor stub
        }

        @Override
        public String toString() {
            String sistema= null;
            switch (sisOp) {
                case WINDOWS:
                    sistema="Windows";
                    break;
                case LINUX:
                    sistema="Linux";
                    break;
                case MAC:
                    sistema="Mac";
                    break;
                case ANDROID:
                    sistema="Android"; 
                    break;
                case IOS:
                    sistema="iOS";
                    break;
                default:
                    break;
            }
            return nombre+" ("+sistema+" "+res+")";
        }
    
        public static void main(String[] args) throws Exception {
        System.out.println("\nClase Cliente");
        System.out.println("=============\n");        
        Cliente cWin1 = new Cliente("Cliente1", "192.168.1.2", "02:1A:2B:3C:4D:5E", SO.WINDOWS, "1920x1080");
        Cliente cLin2 = new Cliente("Cliente2", "192.168.1.3", "01:1A:2B:3C:4D:5F", SO.LINUX, "1366x768");
        Cliente cMac3 = new Cliente("Cliente3", "192.168.1.4", "04:1A:2B:3C:4D:60", SO.MAC, "2560x1440");
        Cliente cAnd4 = new Cliente("Cliente4", "192.168.1.5", "03:1A:2B:3C:4D:61", SO.ANDROID, "1080x2340");
        Cliente cIos5 = new Cliente("Cliente5", "192.168.1.6", "05:1A:2B:3C:4D:62", SO.IOS, "1170x2532");

        Cliente[] clientes = { cWin1, cLin2, cMac3, cAnd4, cIos5 };
        Arrays.sort(clientes);
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        CompSO comparaSO = new CompSO();
        CompRes comparaRes = new CompRes();
        Arrays.sort(clientes, comparaSO);
        System.out.println("\nClientes ordenados por SO");
        System.out.println("\n==============================\n");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        System.out.println("\nClientes ordenados por Resolucion");
        System.out.println("\n==============================\n");
        Arrays.sort(clientes, comparaRes);
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        // Tu código aquí



    }
    
}
