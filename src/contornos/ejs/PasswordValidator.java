package contornos.ejs;

public class PasswordValidator { 
    public static boolean isValid(String password) { 
        if (password.length() < 8) {  //CAmbio el <= 8 por un < 8 ya que el codigo aceptaba contraseñas de 8 caracteres.
            return false;
        } 
        boolean hasUpperCase = false; 
        boolean hasDigit = false; 
        for (char c : password.toCharArray()) { 
            if (Character.isUpperCase(c)) {  //cambio isLowerCase por isUpperCas ya que buscamos mayusculas, no minusculas
                hasUpperCase = true; 
            } 
            if (Character.isDigit(c)) { 
                hasDigit = true; //Cambio true por false, y aque el codigo tiene que dar true cuando detecte un digito 
            } 
        } 
        return hasUpperCase && hasDigit;  //cambio el || por && ya que euiero que las dos condiciones se cumplan, no solo una de ellas.
    } 
} 