/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcFechas;

/**
 *
 * @author Zaidc
 */
public class probarContrasenia {
    public static void main(String[] args) {
        String texto = "jadskdaASDJLADSL";
        System.out.println(probarTieneMayusculas(texto));
    }
    public static boolean probarLongitudMinima(String texto, int Lminima){
        return texto.length() >= Lminima;
    }
    
    public static boolean probarLongitudMaxima(String texto, int Lmaxima){
        return texto.length()<= Lmaxima;
    }
    
    public static boolean probarTieneMayusculas(String texto){
        return !texto.equals(texto.toLowerCase());
    }
    
    public static boolean probarTieneNumeros(String texto){
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean probarCaracteresEspeciales(String texto){
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (!Character.isLetterOrDigit(caracter)) {
                return true;
            }
        }
        return false;
    }
    
    
}
