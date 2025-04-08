/*
 * 
 * Daniel Fernandez Garcia
 * 
 */

package ud2.fgdexamen;

public class DuraciónDeBombillas {

    public static String causaFinBombilla(int horasTot, int encendidos, int horas) {

        String causa;
        int horasPorEncendidos;
        horasPorEncendidos = horas * encendidos;

        if (horasTot > 0 && horas > 0 && encendidos > 0 && horas <= 10) {
            if (horasPorEncendidos > horasTot) {
                causa = "HORAS";
            } else if (horasPorEncendidos == horasTot) {
                causa = "HORAS + ENCENDIDOS";
            } else
                causa = "ENCENDIDOS";
        } else {
            causa = "ERROR";
        }

        return causa;
    }

    public static void main(String[] args) {
        int horasEncendida, horasTotal, encendidos; // Respectivamente, las horas que pasa encendida, las horas que
                                                    // AGUANTA encendida, y las veces que se enciende.
        String output;

        horasTotal = 1000;
        encendidos = 100;
        horasEncendida = 10;

        output = causaFinBombilla(horasTotal, encendidos, horasEncendida);
        System.out.println(output);
    }

}
