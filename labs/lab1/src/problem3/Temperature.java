package problem3;

public class Temperature {
    private double temperature;
    private char scale;

    public Temperature() {
        this.temperature = 0.0;
        this.scale = 'C';
    }

    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.temperature = 0.0;
        this.scale = scale;
    }

    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public double getCelsius() {
        if (scale == 'F') {
            return 5 * (temperature - 32) / 9;
        }
        return temperature;
    }

    public double getFahrenheit() {
        if (scale == 'C') {
            return (9 * temperature / 5) + 32;
        }
        return temperature;
    }

    public char getScale() {
        return scale;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperatureAndScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public static void main(String[] args) {
        Temperature temp1 = new Temperature();
        Temperature temp2 = new Temperature(100);
        Temperature temp3 = new Temperature('F');
        Temperature temp4 = new Temperature(32, 'F');

        System.out.println("Temp1 in Celsius: " + temp1.getCelsius());
        System.out.println("Temp2 in Fahrenheit: " + temp2.getFahrenheit());
        System.out.println("Temp3 in Celsius: " + temp3.getCelsius());
        System.out.println("Temp4 in Fahrenheit: " + temp4.getFahrenheit());

        temp4.setTemperatureAndScale(0, 'C');
        System.out.println("Temp4 new Fahrenheit: " + temp4.getFahrenheit());
    }
}
