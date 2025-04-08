package ud5.exercicios.mulleres;

public class Escritora extends MullerTraballadora implements IPionera{
    String obraMestra;
    Escritora(String nome, String apelidos, int anoNac, String obraMestra) {
        super(nome, apelidos, anoNac);
        this.obraMestra=obraMestra;
    }
    
    String descricionContribucion() {
        return nome+" "+apelidos+" foi unha escritora, e a sua obra mestra foi: "+obraMestra;
    }

    @Override
    public String getDescubrimientoOuAporte() {
        return nome+" foi pioneira con: "+obraMestra;
    }
}
