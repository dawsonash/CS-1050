

public class Temperature {

    // Field to store Fahrenheit temperature
    private double ftemp; 

    // Constructor that accepts Fahrenheit temperature
    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }

    // Method to set Fahrenheit temperature
    public void setFahrenheit(double ftemp) {
        this.ftemp = ftemp;
    }

    // Method to get Fahrenheit temperature
    public double getFahrenheit() {
        return ftemp;
    }

    // Method to get Celsius temperature  
    public double getCelsius() {
        return (ftemp - 32) * 5 / 9;
    }

    // Method to get Kelvin temperature  
    public double getKelvin() {
        return (ftemp + 459.67) * 5 / 9;
    }
}

