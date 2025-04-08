package ud5.exercicios.mulleres;

public class Artista extends MullerTraballadora {
    String estilo;
    Artista(String nome, String apelidos, int anoNac, String estilo) {
        super(nome, apelidos, anoNac);
        this.estilo=estilo;
    }

    String descricionContribucion() {
        return nome+" "+apelidos+" destacou no arte co estilo: "+estilo;
    }
}
