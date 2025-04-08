package ud4.exercicios.practicas;

import java.util.Scanner;

public class conjugarVerbos {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dame un verbo en infinitivo");
            input= sc.nextLine();
            if (input.toLowerCase()=="a") {
                System.out.println("Fin del programa");
            } else mostrarVerbos(conjugarPresente(input));
        } while (input.toLowerCase()!="a");
        sc.close();
    }

    static void mostrarVerbos(String[] in) {
        if (in!=null) {
            System.out.println(in[0]+"\n"+in[1]+"\n"+in[2]+"\n"+in[3]+"\n"+in[4]+"\n"+in[5]+"\n");
        } else System.out.println("Input no valido.");
    }

    static String[] conjugarPresente(String in) {
        String[] conjugado = new String[6];
        if (in.endsWith("ar")) {
            conjugado[0]= in.substring(0, (in.length()-2))+'o';
            conjugado[1]= in.substring(0, (in.length()-2))+"as";
            conjugado[2]= in.substring(0, (in.length()-2))+'a';
            conjugado[3]= in.substring(0, (in.length()-2))+"amos";
            conjugado[4]= in.substring(0, (in.length()-2))+"ais";
            conjugado[5]= in.substring(0, (in.length()-2))+"an";
        } else if(in.endsWith("er")) {
            conjugado[0]= in.substring(0, (in.length()-2))+'o';
            conjugado[1]= in.substring(0, (in.length()-2))+"es";
            conjugado[2]= in.substring(0, (in.length()-2))+'e';
            conjugado[3]= in.substring(0, (in.length()-2))+"emos";
            conjugado[4]= in.substring(0, (in.length()-2))+"eis";
            conjugado[5]= in.substring(0, (in.length()-2))+"en";
        } else if(in.endsWith("ir")) {
            conjugado[0]= in.substring(0, (in.length()-2))+'o';
            conjugado[1]= in.substring(0, (in.length()-2))+"es";
            conjugado[2]= in.substring(0, (in.length()-2))+'e';
            conjugado[3]= in.substring(0, (in.length()-2))+"imos";
            conjugado[4]= in.substring(0, (in.length()-2))+"is";
            conjugado[5]= in.substring(0, (in.length()-2))+"en";
        } else conjugado=null;
        return conjugado;
    }

    String[] conjugarTiempoVerbal (String verb, String tense) {
        String[] conjugado = new String[6];
        if (tense.toLowerCase()=="presente") {
            if (verb.endsWith("ar")) {
                conjugado[0]= verb.substring(0, (verb.length()-2))+'o';
                conjugado[1]= verb.substring(0, (verb.length()-2))+"as";
                conjugado[2]= verb.substring(0, (verb.length()-2))+'a';
                conjugado[3]= verb.substring(0, (verb.length()-2))+"amos";
                conjugado[4]= verb.substring(0, (verb.length()-2))+"ais";
                conjugado[5]= verb.substring(0, (verb.length()-2))+"an";
            } else if(verb.endsWith("er")) {
                conjugado[0]= verb.substring(0, (verb.length()-2))+'o';
                conjugado[1]= verb.substring(0, (verb.length()-2))+"es";
                conjugado[2]= verb.substring(0, (verb.length()-2))+'e';
                conjugado[3]= verb.substring(0, (verb.length()-2))+"emos";
                conjugado[4]= verb.substring(0, (verb.length()-2))+"eis";
                conjugado[5]= verb.substring(0, (verb.length()-2))+"en";
            } else if(verb.endsWith("ir")) {
                conjugado[0]= verb.substring(0, (verb.length()-2))+'o';
                conjugado[1]= verb.substring(0, (verb.length()-2))+"es";
                conjugado[2]= verb.substring(0, (verb.length()-2))+'e';
                conjugado[3]= verb.substring(0, (verb.length()-2))+"imos";
                conjugado[4]= verb.substring(0, (verb.length()-2))+"is";
                conjugado[5]= verb.substring(0, (verb.length()-2))+"en";
            } else conjugado=null;
        } else if(tense.toLowerCase()=="preterito perfecto simple") {
            if (verb.endsWith("ar")) {
                conjugado[0]= verb.substring(0, (verb.length()-2))+'o';
                conjugado[1]= verb.substring(0, (verb.length()-2))+"as";
                conjugado[2]= verb.substring(0, (verb.length()-2))+'a';
                conjugado[3]= verb.substring(0, (verb.length()-2))+"amos";
                conjugado[4]= verb.substring(0, (verb.length()-2))+"ais";
                conjugado[5]= verb.substring(0, (verb.length()-2))+"an";
            } else if(verb.endsWith("er")) {
                conjugado[0]= verb.substring(0, (verb.length()-2))+'o';
                conjugado[1]= verb.substring(0, (verb.length()-2))+"es";
                conjugado[2]= verb.substring(0, (verb.length()-2))+'e';
                conjugado[3]= verb.substring(0, (verb.length()-2))+"emos";
                conjugado[4]= verb.substring(0, (verb.length()-2))+"eis";
                conjugado[5]= verb.substring(0, (verb.length()-2))+"en";
            } else if(verb.endsWith("ir")) {
                conjugado[0]= verb.substring(0, (verb.length()-2))+'o';
                conjugado[1]= verb.substring(0, (verb.length()-2))+"es";
                conjugado[2]= verb.substring(0, (verb.length()-2))+'e';
                conjugado[3]= verb.substring(0, (verb.length()-2))+"imos";
                conjugado[4]= verb.substring(0, (verb.length()-2))+"is";
                conjugado[5]= verb.substring(0, (verb.length()-2))+"en";
            } else conjugado=null;
        } else if(tense.toLowerCase()=="futuro") {
            if (verb.endsWith("ar")) {
                conjugado[0]= verb.substring(0, (verb.length()-2))+'o';
                conjugado[1]= verb.substring(0, (verb.length()-2))+"as";
                conjugado[2]= verb.substring(0, (verb.length()-2))+'a';
                conjugado[3]= verb.substring(0, (verb.length()-2))+"amos";
                conjugado[4]= verb.substring(0, (verb.length()-2))+"ais";
                conjugado[5]= verb.substring(0, (verb.length()-2))+"an";
            } else if(verb.endsWith("er")) {
                conjugado[0]= verb.substring(0, (verb.length()-2))+'o';
                conjugado[1]= verb.substring(0, (verb.length()-2))+"es";
                conjugado[2]= verb.substring(0, (verb.length()-2))+'e';
                conjugado[3]= verb.substring(0, (verb.length()-2))+"emos";
                conjugado[4]= verb.substring(0, (verb.length()-2))+"eis";
                conjugado[5]= verb.substring(0, (verb.length()-2))+"en";
            } else if(verb.endsWith("ir")) {
                conjugado[0]= verb.substring(0, (verb.length()-2))+'o';
                conjugado[1]= verb.substring(0, (verb.length()-2))+"es";
                conjugado[2]= verb.substring(0, (verb.length()-2))+'e';
                conjugado[3]= verb.substring(0, (verb.length()-2))+"imos";
                conjugado[4]= verb.substring(0, (verb.length()-2))+"is";
                conjugado[5]= verb.substring(0, (verb.length()-2))+"en";
            } else conjugado=null;
        } else (conjugado=null;)
        return conjugado;
    }
}
