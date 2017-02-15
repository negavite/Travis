package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature cel = new Celsius(((getValue()-32)*5)/9);
        return cel;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature fah = new Fahrenheit(getValue());
        return fah;
    }

    public String toString()
    {
        return "" + getValue() + " F";
    }
}
