package ud5.exercicios.mulleres;

public class Cientifica extends MullerTraballadora implements IPionera {
    String descubrimento;
    Cientifica(String nome, String apelidos, int anoNac, String descubrimento) {
        super(nome, apelidos, anoNac);
        this.descubrimento=descubrimento;
    }

    String descricionContribucion() {
        return nome+" "+apelidos+" foi unha cientifica pioneira que descubriu: "+descubrimento;
    }

    @Override
    public String getDescubrimientoOuAporte() {
        return nome+" foi pioneira en: "+descubrimento;
    }
}
