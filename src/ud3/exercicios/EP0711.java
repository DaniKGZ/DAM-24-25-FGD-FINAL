package ud3.exercicios;


import java.util.Scanner;

public class EP0711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        String opcion;
        Boolean fin = false;
        
        System.out.println("En que pagina estas");
        input= sc.nextInt();
        MarcaPagina pag = new MarcaPagina(input);
        do {
            System.out.println("Que quieres hacer? [Avanzar = + | Retroceder = - | Fin = 0]");
            sc.nextLine();
            opcion = sc.nextLine();
            
            switch (opcion) {
                case "+":
                    pag.aumentarPag();
                    System.out.println(pag.ultPag());
                    break;
                case "-":
                    pag.disminPag();
                    System.out.println(pag.ultPag());
                    break;
                case "0":
                    fin=true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (fin==false);
        

    }
    
}
