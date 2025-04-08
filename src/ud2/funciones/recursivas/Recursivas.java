package ud2.funciones.recursivas;

public class Recursivas {

    public static void main(String[] args) {
        System.out.println("Tribonacci: "+tribonacci(15));
        System.out.println("Suma: "+suma(5));
        System.out.println("nNumbers: "+nNumbers(12345));
        System.out.println("powerTo: "+powerTo(2,4));
        System.out.println("factorial: "+factorial(5));
        System.out.println("nLetterInString: "+nLetterInString("abracadadadabra",'a',0));
        System.out.println("palindrome: "+palindrome("madam",0));
        
            
        System.out.println("Reverse: "+reverse("hello"));
    }


    static int tribonacci(int n){
        
        if (n == 0){
            return 0;
        }
        else if (n <= 2){
            return 1;
        }

        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }


    //Suma. Escribe un programa que sume los números enteros desde 1 hasta n utilizando recursividad.
    static int suma(int n){
        
        if (n == 1){
            return 1;
        }
        return n + suma(n-1);
    }


    // NumDigitos. Escribe un programa que cuente la cantidad de dígitos en un número entero utilizando recursividad.
    static int nNumbers(int n){

        if (n== 0)
            return 0;

        return 1 + nNumbers(n/10);
    }


    // Potencia. Escribe un programa que calcule la potencia de un número elevado a otro utilizando recursividad.
    static int powerTo(int n, int p){

        if (p == 0)
            return 1;

        return n * powerTo(n, p-1);
    }


    static String reverse(String str) {
        
        if (str.isEmpty()) {
            return str;
        }
        
        return reverse(str.substring(1)) + str.charAt(0);
    }


    static int factorial(int n){

        if ( n== 0)
            return 1;

        return n * factorial(n-1);
    }


    static int nLetterInString(String word,char letter,int index){

        if (index == word.length()) {
            return 0;
        }

        if (word.charAt(index) == letter){
            return 1 + nLetterInString(word, letter, index+1);
        }
        else{
            return nLetterInString(word, letter, index+1);
        }
    }


    static boolean palindrome(String text, int index){
        
        if (index >= text.length()/2){
            return true;
        }

        else if (text.charAt(index) == text.charAt(text.length()-1-index) ){
            return palindrome(text,index+1);
        }
        else{
            return false;
        }
    }

}