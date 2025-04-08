package ud5.exercicios.horas.herenciaejercicios.cajas;

public class Caja {
    int ancho, alto, fondo;
    String etiqueta;
    Caja(int ancho, int alto, int fondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo= fondo;
    }

    Caja(int ancho, int alto, int fondo, String etiqueta) throws Exception {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo= fondo;
        if (etiqueta.length()<=30) {
            this.etiqueta = etiqueta;
        } else throw new Exception("La etiqueta no debe contener mas de 30 caracteres.");
    }

    double getVolumen() {
        return ancho*alto*fondo;
    }

    void setEtiqueta(String etiqueta) {
        if (etiqueta.length()<=30) {
            this.etiqueta=etiqueta;
        } else System.out.println("Etiqueta muy larga. maximo 30 caracteres.");

    }
    public String toString() {
            String cajaStr;
            cajaStr="Alto = "+alto+"\nAncho = "+ancho+"\nFondo = "+fondo+"\nEtiqueta: "+etiqueta;
            return cajaStr;
        }
}
