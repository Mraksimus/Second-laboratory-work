package org.example;

import org.example.types.PeripheryType;

import java.awt.*;

public class Headphones extends ComputerPeriphery {

    private boolean hasMicrophone;
    private int volume;
    private Color color;

    public Headphones() {
        super();
        this.hasMicrophone = false;
        this.volume = 0;
        this.color = Color.BLACK;
    }

    public Headphones(
        Color color,
        String peripheryName,
        String brand,
        PeripheryType peripheryType,
        boolean hasMicrophone,
        int volume
    ) {
        super(peripheryName, brand, peripheryType);
        this.hasMicrophone = hasMicrophone;
        this.volume = volume;
        this.color = color;
    }

    @Override
    public void connect() {
        System.out.println("Headphones " + getBrand() + " connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Headphones " + getBrand() + " disconnected");
    }

    public boolean isHasMicrophone() {
        return hasMicrophone;
    }

    public void setHasMicrophone(boolean hasMicrophone) {
        this.hasMicrophone = hasMicrophone;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String play() {
        return "Headphones playing";
    }

}
