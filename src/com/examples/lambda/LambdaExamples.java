
package com.examples.lambda;

import java.util.List;
import com.examples.lambda.Operations;

/**
 * @author Alberto Iglesias Gallego
 */
public class LambdaExamples {

    public static void main(String[] args) {
        
        List<Car> oCars = Car.createTestList();   
        OperationsLambdaCar oOLC = new OperationsLambdaCar();
        Operations<Car> bmwCars = o -> "BMW".equals(o.getBrand());
        Operations<Car> mercedesCars = o -> o.getBrand().equals("Mercedes");  
        Operations<Car> subaruCars = o -> o.getBrand().equals("Subaru");
        Operations<Car> cheaperPricesCars = o -> o.getPrice()<30000;
        
        System.out.println("\n==== Coches por Marca ====");
        oOLC.showCars(oCars,bmwCars);
        oOLC.showCars(oCars,mercedesCars);
        oOLC.showCars(oCars,subaruCars);
        System.out.println("\n==== Coches con precio menor a 30.000 ====");
        oOLC.showCars(oCars,cheaperPricesCars);
    
    }

    
}
