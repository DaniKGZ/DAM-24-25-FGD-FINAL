package ud5.exercicios.mulleres;

public class Deportista extends MullerTraballadora implements IPionera {
    String fitoHistorico;
    Deportista(String nome, String apelidos, int anoNac, String fitoHistorico) {
        super(nome, apelidos, anoNac);
        this.fitoHistorico=fitoHistorico;
    }
    
    String descricionContribucion() {
        return nome+" "+apelidos+" foi unha deportista, o seu logro mais destacado foi: "+fitoHistorico;
    }

    @Override
    public String getDescubrimientoOuAporte() {
        return nome+" foi pioneira en: "+fitoHistorico;
    }
}
