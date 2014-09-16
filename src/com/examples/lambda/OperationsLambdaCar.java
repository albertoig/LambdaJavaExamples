
package com.examples.lambda;

import java.util.List;

/**
 *
 * @author Alberto
 */
public class OperationsLambdaCar {
    public void showCars(List<Car> oC, Operations<Car> oO){
        /**for(Car c:oC){
            if (oO.operate(c)){
                System.out.println(c.toString());
            }
        }**/
        oC.forEach(c -> { if (oO.operate(c)) System.out.println(c.toString()); });
    }    
}
