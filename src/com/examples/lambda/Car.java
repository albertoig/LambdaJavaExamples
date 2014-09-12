package com.examples.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alberto Iglesias Gallego
 */
public class Car {

    private String brand;
    private String name;
    private Integer price;
    private Integer kilometers;

    private Car() {
        super();
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @return the kilometers
     */
    public Integer getKilometers() {
        return kilometers;
    }

    /**
     * @param kilometers the kilometers to set
     */
    public void setKilometers(Integer kilometers) {
        this.kilometers = kilometers;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    public static class Builder {

        private String brand;
        private String name;
        private Integer price;
        private Integer kilometers;

        public Car.Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Car.Builder name(String name) {
            this.name = name;
            return this;
        }

        public Car.Builder price(Integer price) {
            this.price = price;
            return this;
        }

        public Car.Builder kilometers(Integer kilometers) {
            this.kilometers = kilometers;
            return this;
        }

        public Car build() {

            return new Car(this);
        }
    }
  
    private Car(Car.Builder builder) {
        brand = builder.brand;
        name = builder.name;
        kilometers = builder.kilometers;
        price = builder.price;
    }

    public static List<Car> createTestList() {

        List<Car> oCar = new ArrayList<>();

        oCar.add(
                new Car.Builder()
                .brand("BMW")
                .name("Z4")
                .price(39100)
                .kilometers(0)
                .build()
        );
        oCar.add(
                new Car.Builder()
                .brand("BMW")
                .name("Serie 7 Berlina")
                .price(92000)
                .kilometers(0)
                .build()
        );
        oCar.add(
                new Car.Builder()
                .brand("Mercedes")
                .name("Clase A")
                .price(21000)
                .kilometers(10200)
                .build()
        );
        oCar.add(
                new Car.Builder()
                .brand("Mercedes")
                .name("CLS")
                .price(60000)
                .kilometers(30000)
                .build()
        );
        oCar.add(
                new Car.Builder()
                .brand("Subaru")
                .name("XV")
                .price(16000)
                .kilometers(60000)
                .build()
        );
        oCar.add(
                new Car.Builder()
                .brand("Subaru")
                .name("WRX STI")
                .price(40000)
                .kilometers(89)
                .build()
        );
        return oCar;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + " name" + getName() + "\n" + "price: " + price + "  kilometers: " + kilometers + "\n";
    }
}
