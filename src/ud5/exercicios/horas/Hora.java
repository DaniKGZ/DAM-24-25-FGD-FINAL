package ud5.exercicios.horas;

public class Hora {

    int hora, min;

    Hora(int horaIn, int minIn) throws Exception {
        if (horaIn>=0 && horaIn<=23 && minIn>=0 && minIn<=60) {
            hora=horaIn;
            min=minIn;
        } else throw new Exception("La hora debe estar entre 0 y 23 y el minuto entre 0 y 60.");
    }

    void inc() {
        min++;
    }

    boolean setMinuto(int value) {
        if (value>=0 && value<=60) {
            min=value;
            return true;
        } else return false;
    }

    boolean setHora(int value) {
        if (value>=0 && value<=23) {
            hora=value;
            return true;
        } else return false;
    }

    public String toString() {
            return hora+":"+min;
        }
}
