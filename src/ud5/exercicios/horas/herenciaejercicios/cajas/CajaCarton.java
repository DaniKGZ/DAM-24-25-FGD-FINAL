package ud5.exercicios.horas.herenciaejercicios.cajas;


public class CajaCarton extends Caja {
    CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
        super(ancho, alto, fondo); 
    }

    CajaCarton(int ancho, int alto, int fondo, String etiqueta) throws Exception {
        super(ancho, alto, fondo, etiqueta);
    }

    @Override
    double getVolumen() {
        return (ancho*alto*fondo)*0.8;
    }

    double superficieTotal() {
        return 2*ancho*alto+2*fondo*alto+2*ancho*fondo;
    }
}
