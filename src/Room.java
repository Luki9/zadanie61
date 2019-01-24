import java.util.Objects;

public class Room {

    private String name;
    private int squareMetre;
    private int temperature;
    private int temperaturCooldown;
    private boolean airConditionOn;


    boolean temperature() {
        if (airConditionOn && temperature > 18) {
            temperature--;
            return true;
        } else
            return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSquareMetre() {
        return squareMetre;
    }

    public void setSquareMetre(int squareMetre) {
        this.squareMetre = squareMetre;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditionOn() {
        return airConditionOn;
    }

    public void setAirConditionOn(boolean airConditionOn) {
        this.airConditionOn = airConditionOn;
    }

    public int getTemperaturCooldown() {
        return temperaturCooldown;
    }

    public void setTemperaturCooldown(int temperaturCooldown) {
        this.temperaturCooldown = temperaturCooldown;
    }

    public Room(String name, int squareMetre, int temperature, boolean airConditionOn) {
        this.name = name;
        this.squareMetre = squareMetre;
        this.temperature = temperature;
        this.airConditionOn = airConditionOn;
    }

}
