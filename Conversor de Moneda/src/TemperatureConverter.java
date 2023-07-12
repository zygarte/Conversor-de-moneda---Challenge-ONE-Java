import javax.swing.JOptionPane;

public class TemperatureConverter {
    
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

     static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

     static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

     static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
