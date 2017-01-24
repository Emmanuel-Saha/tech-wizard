/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acc;

/**
 *
 * @author MANUEL
 */
import java.util.Scanner;
public class AccTest {
    public static void main (String [] args){
        Acc acc1 = new Acc (50.00);
        Acc acc2 = new Acc (-7.53);
        
        System.out.printf("Acc1 balance:\n"+acc1.getBal());
        System.out.printf("Acc2 balance:\n"+acc2.getBal());
        
        Scanner input = new Scanner (System.in);
        double depositAmount;
        
        System.out.print("Enter deposit amount Acc1\n");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2 to Acc1 bal\n\n"+depositAmount);
        acc1.credit(depositAmount);
        
        System.out.printf("Acc1 balance:\n+"+acc1.getBal());
        System.out.printf("Acc2 balance:\n+"+acc2.getBal());
        
        System.out.print("Enter deposit amount Acc2");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2 to Acc2 bal\n\n"+depositAmount);
        acc2.credit(depositAmount);
        
        System.out.printf("Acc1 balance:\n+"+acc1.getBal());
        System.out.printf("Acc2 balance:\n+"+acc2.getBal());
    }
}
