package simplestatcalc;

import java.io.*;
import static java.lang.Double.max;
 
/** An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers.  Numbers are entered into the dataset using
 * the enter(double) method.  Methods are provided to return the following
 * statistics for the set of numbers that have been entered: The number
 * of items, the sum of the items, the average, and the standard deviation
 */
public class StatCalc {
     
        private int count;   // Number of numbers that have been entered.
        private double sum;  // The sum of all the items that have been entered.
        private double squareSum;  // The sum of the squares of all the items.
        private double max = Double.NEGATIVE_INFINITY;  // Largest item seen.
        private double min = Double.POSITIVE_INFINITY;  // Smallest item seen.
     
        /**
         * Add a number to the dataset.The statistics will be computed for all
 the numbers that haved been added to the dataset using this method.
     * @param num
         */
        public void enter(double num) {
           count++;
           sum += num;
           squareSum += num*num;
           if (num > max)
              max = num;
           if (num < min)
              min = num;
        }
     
        /**
         * @return the number of items that have been entered into the dataset. 
         */
        public int getCount() {
           return count;
        }
     
        /**
         * @return the sum of all the numbers that have been entered.
         */
        public double getSum() {
           return sum;
        }
     
        /**
         * Return the average of all the items that have been entered.The returnvalue is Double.NaN if no numbers have been entered.
     * @return
         */
        public double getMean() {
           return sum / count;  
        }
     
        /**
         * @return the standard deviation of all the items that have been entered.The returnvalue is Double.NaN if no numbers have been entered.
         */
        public double getStandardDeviation() {  
           double mean = getMean();
           return Math.sqrt( squareSum/count - mean*mean );
        }
        
        /**
         * @return the smallest item that has been entered.The return value will be infinity if no numbers have been entered. 
         */
        public double getMin() {
           return min;
        }
        
        /**
         * @return the largest item that has been entered.The return value will be -infinity if no numbers have been entered.  
         */
        public double getMax() {
           return max;
        }
            
   public static void main(String a[]) throws Exception  
   {
        StatCalc calc;  // Computes stats for numbers entered by user.
        calc = new StatCalc();
 
        // Enter all of the values to perform statistics on.
        calc.enter(5);
        calc.enter(7);
        calc.enter(12);
        calc.enter(23);
        calc.enter(3);
        calc.enter(2);
        calc.enter(8);
        calc.enter(14);
        calc.enter(10);
        calc.enter(5);
        calc.enter(9);
        calc.enter(13);
    System.out.println("\nHere is your Statistics Calc result :\n");
    System.out.println("   Count:              " + calc.getCount());
    System.out.println("   Sum:                " + calc.getSum());
    System.out.println("   Minimum:            " + calc.getMin());
    System.out.println("   Maximum:            " + calc.getMax());
    System.out.println("   Average:            " + calc.getMean());
    System.out.println("   Standard Deviation: " + calc.getStandardDeviation());
 // we can use TextIO.putln or System.out.println to print out result          
   }
}  
