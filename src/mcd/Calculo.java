package mcd;

/**
 *
 * @author damian editado por dpazolopez
 */
public class Calculo {

    public static int numero1;
    public static int numero2;
    public static String mensajeResultado = "";

    public Calculo() {
    }

    //método para calcular el MCD
    public static int obtenerMCD(int num1, int num2) {
        int resto;
        int numDiv1 = num1;
        int numDiv2 = num2;
        
        if (num1 <0 || num2 < 0) return 0;
       
        try {
            do {
                resto = numDiv1 % numDiv2;
                numDiv1 = numDiv2;
                if (resto != 0) {
                    numDiv2 = resto;
                }
            } while (resto != 0);

            mensajeResultado = "Cálculo correcto";
            return numDiv2;
        } catch (Exception e) {
            mensajeResultado = "Error en cálculo de MCD: " + e.getMessage();
            return 0;
        }
    }
}