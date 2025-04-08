package ud5.exercicios.mulleres;

public abstract class MullerTraballadora {
    String nome, apelidos;
    int anoNac;

    MullerTraballadora(String nome, String apelidos, int anoNac) {
        this.nome=nome;
        this.apelidos=apelidos;
        this.anoNac=anoNac;
    }

    int getIdade(int anoAct) {
        return anoAct-anoNac;
    }

    abstract String descricionContribucion();

    
}
