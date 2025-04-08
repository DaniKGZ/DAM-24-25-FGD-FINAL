package ud4.exercicios.practicas;

import java.util.Arrays;

public class Matriculas {
    public static void main(String[] args) {
        String prueba ="1233Wpc";
        System.out.println(incrementarLetras(prueba));
        System.out.println(esMatriculaValida(prueba));
        
    }

    static boolean esMatriculaValida(String matricula){
        boolean valida = true;
        char arrMat[] = matricula.toCharArray();
        for (int i = 0; i < 4; i++) {
            if (Character.isDigit(arrMat[i])) {
                valida = true;
            } else {
                valida=false;
                return valida;
            }
        }
        for (int i = 4; i < 7; i++) {
            if (esLetraValida(arrMat[i])==true) {
                valida = true;
            } else {
                valida=false;
                return valida;
            }
        }
        return valida;
    }

    static boolean esLetraValida(char chIn){
        boolean result;
        char ch=Character.toLowerCase(chIn);
        if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='ñ' && ch!='q' && Character.isLetter(ch)==true) {
            result=true;
        } else result=false;
        return result;
    }

    String siguienteMtricula(String matricula) {
        String nuevaMat;
        char[] arrMat = matricula.toCharArray();
        if (matricula.substring(0, 3)=="9999") {
            matricula.substring(0, 3).equals("0000");
            incrementarLetras(matricula);
        } else incrementarDigitos(matricula);
        Return nuevaMat;
    }

   String incrementarDigitos(String matricula) {
        
    }

    static String incrementarLetras(String matricula) {
        char[] arrMat = matricula.toLowerCase().toCharArray();
        System.out.println(Arrays.toString(arrMat));
        if (arrMat[6]=='z') {
            
        }
        System.out.println((arrMat[6]));
        return Arrays.toString(arrMat);
    }
    
    int comparaMatriculas(String m1, String m2) {

    }

}
