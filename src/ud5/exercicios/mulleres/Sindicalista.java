package ud5.exercicios.mulleres;

public class Sindicalista extends MullerTraballadora implements IActivista {
    String movementoDefendido;
    Sindicalista(String nome, String apelidos, int anoNac, String movementoDefendido) {
        super(nome, apelidos, anoNac);
        this.movementoDefendido=movementoDefendido;
    }

    public String getCausaDefendida() {
        return nome+" defendeu a causa: "+ movementoDefendido;
    }

    String descricionContribucion() {
        return nome+" "+apelidos+" foi unha sindicalista destacada por: "+movementoDefendido;
    }
    
}
