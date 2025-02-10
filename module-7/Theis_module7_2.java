/*
Rachel Theis
Module 7.2 Assignment
CSD 402
2.9.25
*/

import java.util.ArrayList;
import java.util.List;

public class Fan {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private int radius;
    private String color;

    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan is on with the speed " + fan.getSpeed() + ", the radius is " + fan.getRadius() + ", and the color is " + fan.getColor() + ".");
        } else {
            System.out.println("Fan is off, the radius is " + fan.getRadius() + ", the color is " + fan.getColor() + ".");
        }
    }

    public static void displayFans(List<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void testFanClass() {
        Fan fan1 = new Fan();
        System.out.println("Fan 1 [DEFAULT CONSTRUCTOR]:");
        displayFan(fan1);

        Fan fan2 = new Fan(MEDIUM, true, 8, "blue");
        System.out.println("\nFan 2 [ARGUEMENT CONSTRUCTOR]:");
        displayFan(fan2);

        fan1.setSpeed(FAST);
        fan1.setOn(true);
        fan1.setColor("red");
        System.out.println("\nFan 1 [AFTER UPDATES]:");
        displayFan(fan1);

        System.out.println("\nFan 2 [NO CHANGES]:");
        displayFan(fan2);

        List<Fan> fanCollection = new ArrayList<>();
        fanCollection.add(fan1);
        fanCollection.add(fan2);

        System.out.println("\nDisplaying collection:");
        displayFans(fanCollection);
    }

    public static void main(String[] args) {
        testFanClass();
    }
}

