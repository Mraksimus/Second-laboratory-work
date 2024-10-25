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
        this.setHasMicrophone(hasMicrophone);
        this.setVolume(volume);
        this.setColor(color);
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
        if (volume < 0 || volume > 100) {
            throw new IllegalArgumentException("Volume must be between 0 and 100");
        } else {
            this.volume = volume;
        }
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
