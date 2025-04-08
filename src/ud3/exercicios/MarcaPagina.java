package ud3.exercicios;

public class MarcaPagina {
    int pagina;
    
    MarcaPagina(int paginaIn) {
        pagina=paginaIn;
    }

    public void aumentarPag() {
        pagina++;
    }

    public void disminPag() {
        pagina--;
    }

    public int ultPag() {
        return pagina;
    }
}
