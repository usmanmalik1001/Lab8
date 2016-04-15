/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;

/**
 *
 * @author test1
 */
public class JavaApplication1 {
    public static int [] denominations = {1, 10, 25};
    public static int number = 3;
    
    public static int greedy(int amount)
    {
        int numOfCoins = 0;
        while (amount != 0)
        {
            for (int i = number - 1; i >= 0 ; i--)
            {
                if (denominations[i]<=amount)
                {
                    amount = amount-denominations[i];
                    numOfCoins++;
                    break;
                }
            }
        }
        return numOfCoins;
    }
    
    public static int dynamic(int amount)
    {
        int []C = new int[amount+1];
        C[0] = 0;
        int numOfCoins = 0;
        for (int i = 1; i < amount + 1; i++  )
        {
            C[i] = 999999;
            for (int j = 0; j < number; j++)
            {
                if (i >= denominations[j] && (1 + C[i - denominations[j]] < C[i]))
                {
                    C[i] = 1 + C[i - denominations[j]];
                }
            }
        }
        return C[amount];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arrays.sort(denominations);
        int counter = 0;
        for (int i = 1; i < 9999; i++)
        {
            int input = i;
            if (greedy(input) != dynamic(input))
            {
                System.out.println("Input: " + input);
                System.out.println("Greedy: " + greedy(input));
                System.out.println("Dynamic: " + dynamic(input));
                counter++;
            }
            if (counter == 10)
                return;
        }
    }
}
