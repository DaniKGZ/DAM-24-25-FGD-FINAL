/* Autor: Daniel Fernandez Garcia // DAM1 */

package ud4.FGDexamen;

public class CodificandoMorse {
    public static void main(String[] args) {
        System.out.println(numPuntosMorse("SI "));
    }

    static int numPuntosMorse(String frase) {
        int longitud=0;
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?";
        char[] letrasArr = letras.toCharArray();
        char[] fraseArr = frase.toCharArray(); 
        String[] letrasMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", 
        "....", "..", ".---", "-.-", ".-..", 
        "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", 
        ".--", "-..-", "-.--", "--..", 
        "-.-.--", "..--.." }; 
        for (int i = 0; i < fraseArr.length; i++) {
            if (fraseArr[i] == ' ') {
                longitud+=5;
            } else {
                longitud+=(letrasMorse[buscar(letrasArr, fraseArr[i])].length()*2);

            }
        }
        return longitud;
    }

    static int buscar(char t[], char clave) { 
        for(int i = 0; i < t.length; i++) 
            if (t[i] == clave) 
                return i; 
        return -1; 
    } 
}
