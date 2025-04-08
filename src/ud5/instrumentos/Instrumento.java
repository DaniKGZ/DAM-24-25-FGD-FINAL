package ud5.instrumentos;

import java.util.Scanner;

abstract class Instrumento {
    int[] melodia;
    
    Instrumento(int[] melodiaIn) {
        melodia = melodiaIn;
    }

    void add(int nota) {
        
    }

    abstract void interpretar();
}
