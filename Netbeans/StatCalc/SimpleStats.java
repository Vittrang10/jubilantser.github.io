/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statcalc;

/* 
         Computes and display several statistics for a set of non-zero
         numbers entered by the user.  (Input ends when user enters 0.)
         This program uses StatCalc.java.0
     */
     
     public class SimpleStats {
     
        public static void main(String[] args) {
           
           StatCalc calc;  // Computes stats for numbers entered by user.
           calc = new StatCalc();
           
           double item;    // One number entered by the user.
           
           TextIO.putln("Enter your numbers.  Enter 0 to end.");
           TextIO.putln();
           
           do {
              TextIO.put("? ");
              item = TextIO.getlnDouble();
              if (item != 0)
                 calc.enter(item);
           } while ( item != 0 );
           
           TextIO.putln("\nStatistics about your calc:\n");
           TextIO.putln("   Count:              " + calc.getCount());
           TextIO.putln("   Sum:                " + calc.getSum());
           TextIO.putln("   Minimum:            " + calc.getMin());
           TextIO.putln("   Maximum:            " + calc.getMax());
           TextIO.putln("   Average:            " + calc.getMean());
           TextIO.putln("   Standard Deviation: " + calc.getStandardDeviation());
           
        }  // end main()
        
     } // end SimpleStats
