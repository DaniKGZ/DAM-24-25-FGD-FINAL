package ud3.exercicios;

public class CuentaCorriente {
    String nombreT;
    String apellidosT;
    String DNI;
    double saldo;
    CuentaCorriente(String DNIn, String nombre) {
        DNI = DNIn;
        nombreT = nombre;
    }
    CuentaCorriente(String DNIn, String nombre, String apellidoIn) {
        DNI = DNIn;
        nombreT = nombre;
        apellidosT = apellidoIn;
    }

    void extracto(double cantidad) {
        if (saldo >= cantidad) {
            saldo =- cantidad;
        }
    }
    
    void ingreso(double cantidad) {
        saldo =+ cantidad;
    }

    void mostrarInfo() {
        System.out.println("Nombre: "+nombreT+" "+apellidosT+"\nDNI: "+DNI+"\nSaldo: "+saldo+" €");
    }

}
