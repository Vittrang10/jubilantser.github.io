/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statcalc;

class StatCalcWithMinMax extends StatCalc {
     
        private double max = Double.NEGATIVE_INFINITY;  // Largest item seen.
        private double min = Double.POSITIVE_INFINITY;  // Smallest item seen.
     
        public void enter(double num) {
              // Add the number to the dataset.
           super.enter(num);  // Call the enter method from the StatCalc class.
           if (num > max)  // Then do the extra processing for min and max.
              max = num;
           if (num < min)
              min = num;
        }

        public double getMin() {
             // Return the smallest item that has been entered.
             // Value will be infinity if no items have been entered.
           return min;
        }
        
        public double getMax() {
             // Return the largest item that has been entered.
             // Value will be -infinity if no items have been entered.
           return max;
        }
     
     }  // end class StatCalcWithMinMax