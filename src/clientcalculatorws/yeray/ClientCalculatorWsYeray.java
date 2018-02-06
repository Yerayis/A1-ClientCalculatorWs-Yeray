/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientcalculatorws.yeray;

/**
 *
 * @author entrar
 */
public class ClientCalculatorWsYeray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Suma = " + suma(2,2));
        System.out.println("Resta = " +resta(2,4));
    }

    private static int suma(int n1, int n2) {
        calcpack.Calc_Service service = new calcpack.Calc_Service();
        calcpack.Calc port = service.getCalcPort();
        return port.suma(n1, n2);
    }

    private static int resta(int n1, int n2) {
        calcpack.Calc_Service service = new calcpack.Calc_Service();
        calcpack.Calc port = service.getCalcPort();
        return port.resta(n1, n2);
    }


    
}
