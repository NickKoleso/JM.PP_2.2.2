package web.model;

import java.util.Objects;

public class Car {
    private int yearOfCarProd;
    private String model;
    private String countryOfCarProd;

    public Car() {

    }

    public Car(int yearOfCarProd, String model, String countryOfCarProd) {
        this.yearOfCarProd = yearOfCarProd;
        this.model = model;
        this.countryOfCarProd = countryOfCarProd;
    }

    public int getYearOfCarProd() {
        return yearOfCarProd;
    }

    public void setYearOfCarProd(int yearOfCarProd) {
        this.yearOfCarProd = yearOfCarProd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountryOfCarProd() {
        return countryOfCarProd;
    }

    public void setCountryOfCarProd(String countryOfCarProd) {
        this.countryOfCarProd = countryOfCarProd;
    }

    @Override
    public String toString() {
        return "Car: " +
                "yearOfCarProd=" + yearOfCarProd +
                ", model='" + model + '\'' +
                ", countryOfCarProd='" + countryOfCarProd + '\'';
    }

}
