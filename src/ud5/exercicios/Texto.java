package ud5.exercicios;

public class Texto {
    private final int MAX = 30;
    private String text;
    private String fecha, hora;
    public Texto(String input) {
        if (input.length()<=MAX) {
            text=input;
        } else System.out.println("TEXTO DEMASIADO LARGO. EL MAXIMO QUE MANEJA ESTA CLASE SON "+MAX+" CARACTERES.");
    }

    public String addChar(char input) {
        if (text.length()+1<=MAX) {
            text = text+input;
            return text;            
        } else {
            System.out.println("Se excede la longitud maxima de "+MAX+" caracteres.");
            return null;
        }
    }
 while(skibidi)
    sout toilter
    public String addPrefixString(String input) {
        if (text.length()+input.length()<=MAX) {
            text = text+input;
            return text;            
        } else {
            System.out.println("Se excede la longitud maxima de "+MAX+" caracteres.");
            return null;
        }
    }

    public String addSufixString(String input) {
        if (text.length()+input.length()<=MAX) {
            text = input+text;
            return text;            
        } else {
            System.out.println("Se excede la longitud maxima de "+MAX+" caracteres.");
            return null;
        }
    }

    public int vocales() {
        int count=0;
        char[] textArr = text.toLowerCase().toCharArray();
        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i]=='a'||textArr[i]=='e'||textArr[i]=='i'||textArr[i]=='o'|textArr[i]=='u') {
                count++;
            }
        }
        return count;
    }
}
