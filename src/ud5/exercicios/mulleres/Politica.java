package ud5.exercicios.mulleres;

public class Politica extends MullerTraballadora implements IActivista {
    String causa;
    Politica(String nome, String apelidos, int anoNac, String causa) {
        super(nome, apelidos, anoNac);
        this.causa=causa;
    }
    @Override
    public String getCausaDefendida() {
        return nome+" defendeu a causa: "+causa;
    }

    String descricionContribucion() {
        return nome+" "+apelidos+" foi unha politica e activista destacada por: "+causa;
    }
}
