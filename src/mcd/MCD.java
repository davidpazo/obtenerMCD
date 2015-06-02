package mcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calcula maximo comun divisor recursivamente
 *      editado por dpazolopez
 */
public class MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int numero1, numero2;
        
        try{
            BufferedReader entradaTeclado = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.print("Introduzca el número 1: ");
            numero1 = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca el número 2: ");
            numero2 = Integer.parseInt(entradaTeclado.readLine());
            
            Modelo mod = new Modelo();
            mod.setNumero1(numero1);
            mod.setNumero2(numero2);
            Calculo cal = new Calculo();
            System.out.println("El MCD de " + mod.getNumero1() + " y " + 
            mod.getNumero2() + " es:\n " + cal.obtenerMCD(mod.getNumero1(),mod.getNumero2()));
        
            System.out.println(mod.getMensajeResultado());
        
        }catch (NumberFormatException e){
            System.out.println("Debe introducir un número válido: " + e.getMessage());
        }catch (IOException e){
            System.out.println("Error al introducir datos: " + e.getMessage());            
        }        
}
}
