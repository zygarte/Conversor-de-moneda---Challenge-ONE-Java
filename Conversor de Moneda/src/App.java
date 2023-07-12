import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            // Mostrar el menú principal
            String[] options = {
                "Conversor de Divisas",
                "Conversor de Temperatura",
                "Salir"
            };

            String selectedOption = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción:",
                "Menú Principal",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
            );

            if (selectedOption != null) {
                switch (selectedOption) {
                    case "Conversor de Divisas":
                        currencyConverterMenu();
                        break;
                    case "Conversor de Temperatura":
                        temperatureConverterMenu();
                        break;
                    case "Salir":
                        continuar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida");
                        System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operación cancelada");
                continuar = false;
            }
        }
    }

    private static void currencyConverterMenu() {
        boolean continuar = true;

        while (continuar) {
            // Obtener la cantidad de dinero a convertir
            String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero:");

            if (input != null) {
                double amount = Double.parseDouble(input);

                // Mostrar el menú del conversor de divisas
                String[] options = {
                    "De Peso Colombiano a Dólar",
                    "De Peso Colombiano a Euros",
                    "De Peso Colombiano a Libras Esterlinas",
                    "De Peso Colombiano a Yen Japonés",
                    "De Peso Colombiano a Won sul-coreano",
                    "De Dólar a Peso Colombiano",
                    "De Euros a Peso Colombiano",
                    "De Libras Esterlinas a Peso Colombiano",
                    "De Yen Japonés a Peso Colombiano",
                    "De Won sul-coreano a Peso Colombiano",
                    "Volver al menú principal"
                };

                String selectedOption = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione la conversión deseada:",
                    "Conversor de Divisas",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]
                );

                if (selectedOption != null) {
                    if (selectedOption.equals("Volver al menú principal")) {
                        continuar = false;
                    } else {
                        // Realizar la conversión según la opción seleccionada
                        double convertedAmount = 0.0;
                        String currency = "";

                        switch (selectedOption) {
                            case "De Peso Colombiano a Dólar":
                                convertedAmount = CurrencyConverter.convertToDollar(amount);
                                currency = "Dólar";
                                break;
                            case "De Peso Colombiano a Euros":
                                convertedAmount = CurrencyConverter.convertToEuro(amount);
                                currency = "Euro";
                                break;
                            case "De Peso Colombiano a Libras Esterlinas":
                                convertedAmount = CurrencyConverter.convertToPound(amount);
                                currency = "Libra Esterlina";
                                break;
                            case "De Peso Colombiano a Yen Japonés":
                                convertedAmount = CurrencyConverter.convertToYen(amount);
                                currency = "Yen Japonés";
                                break;
                            case "De Peso Colombiano a Won sul-coreano":
                                convertedAmount = CurrencyConverter.convertToWon(amount);
                                currency = "Won sul-coreano";
                                break;
                            case "De Dólar a Peso Colombiano":
                                convertedAmount = CurrencyConverter.convertFromDollar(amount);
                                currency = "Peso colombiano";
                                break;
                            case "De Euros a Peso Colombiano":
                                convertedAmount = CurrencyConverter.convertFromEuro(amount);
                                currency = "Peso colombiano";
                                break;
                            case "De Libras Esterlinas a Peso Colombiano":
                                convertedAmount = CurrencyConverter.convertFromPound(amount);
                                currency = "Peso colombiano";
                                break;
                            case "De Yen Japonés a Peso Colombiano":
                                convertedAmount = CurrencyConverter.convertFromYen(amount);
                                currency = "Peso colombiano";
                                break;
                            case "De Won sul-coreano a Peso Colombiano":
                                convertedAmount = CurrencyConverter.convertFromWon(amount);
                                currency = "Peso colombiano";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                                System.exit(0);
                        }

                        // Mostrar el resultado de la conversión
                        JOptionPane.showMessageDialog(
                           null,
                            "El equivalente de " + amount + " en " + currency + " es: " + convertedAmount
                        );

                        // Preguntar si desea realizar más conversiones
                        int choice = JOptionPane.showConfirmDialog(
                            null,
                            "¿Desea realizar más conversiones?",
                            "Continuar",
                            JOptionPane.YES_NO_OPTION
                        );
                        if (choice == JOptionPane.CLOSED_OPTION) {
                            System.exit(0);
                        }
                        if (choice == JOptionPane.YES_OPTION) {
                            continuar = false;
                        } else{

                            System.exit(0);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                    continuar = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                continuar = false;
            }
        }
    }

    private static void temperatureConverterMenu() {
        boolean continuar = true;

        while (continuar) {
            // Obtener la temperatura a convertir
            String input = JOptionPane.showInputDialog("Ingrese la temperatura:");

            if (input != null) {
                double temperature = Double.parseDouble(input);

                // Mostrar el menú del conversor de temperatura
                String[] options = {
                    "De Celsius a Fahrenheit",
                    "De Celsius a Kelvin",
                    "De Fahrenheit a Celsius",
                    "De Fahrenheit a Kelvin",
                    "De Kelvin a Celsius",
                    "De Kelvin a Fahrenheit",
                    "Volver al menú principal"
                };

                String selectedOption = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione la conversión deseada:",
                    "Conversor de Temperatura",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]
                );

                if (selectedOption != null) {
                    if (selectedOption.equals("Volver al menú principal")) {
                        continuar = false;
                    } else {
                        // Realizar la conversión según la opción seleccionada
                        double convertedTemperature = 0.0;
                        String unit = "";

                        switch (selectedOption) {
                            case "De Celsius a Fahrenheit":
                                convertedTemperature = TemperatureConverter.celsiusToFahrenheit(temperature);
                                unit = "°F";
                                break;
                            case "De Celsius a Kelvin":
                                convertedTemperature = TemperatureConverter.celsiusToKelvin(temperature);
                                unit = "K";
                                break;
                            case "De Fahrenheit a Celsius":
                                convertedTemperature = TemperatureConverter.fahrenheitToCelsius(temperature);
                                unit = "°C";
                                break;
                            case "De Fahrenheit a Kelvin":
                                convertedTemperature = TemperatureConverter.fahrenheitToKelvin(temperature);
                                unit = "K";
                                break;
                            case "De Kelvin a Celsius":
                                convertedTemperature = TemperatureConverter.kelvinToCelsius(temperature);
                                unit = "°C";
                                break;
                            case "De Kelvin a Fahrenheit":
                                convertedTemperature = TemperatureConverter.kelvinToFahrenheit(temperature);
                                unit = "°F";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                                System.exit(0);
                        }

                        // Mostrar el resultado de la conversión
                        JOptionPane.showMessageDialog(
                            null,
                            "La temperatura " + temperature + " " + getUnitName(selectedOption) +
                            " es equivalente a " + convertedTemperature + " " + unit
                        );

                        // Preguntar si desea realizar más conversiones
                        int choice = JOptionPane.showConfirmDialog(
                            null,
                            "¿Desea realizar más conversiones?",
                            "Continuar",
                            JOptionPane.YES_NO_OPTION
                        );
                        if (choice == JOptionPane.CLOSED_OPTION) {
                            System.exit(0);
                        }
                        if (choice == JOptionPane.YES_OPTION) {
                            continuar = false;
                        }else{

                            System.exit(0);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                    continuar = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                continuar = false;
            }
        }
    }

    private static String getUnitName(String option) {
        switch (option) {
            case "De Celsius a Fahrenheit":
            case "De Celsius a Kelvin":
                return "°C";
            case "De Fahrenheit a Celsius":
            case "De Fahrenheit a Kelvin":
                return "°F";
            case "De Kelvin a Celsius":
            case "De Kelvin a Fahrenheit":
                return "K";
            default:
                return "";
        }
    }
}
