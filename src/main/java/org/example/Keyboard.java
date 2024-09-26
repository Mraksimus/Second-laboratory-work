package org.example;

import org.example.types.PeripheryType;

public class Keyboard extends ComputerPeriphery {

    private boolean hasBacklight;
    private int numberOfKeys;
    private static int keyboardsCount = 0;

    public Keyboard() {
        super();
        this.hasBacklight = false;
        this.numberOfKeys = 0;
    }

    public Keyboard(String peripheryName, String brand, PeripheryType peripheryType) {
        super(peripheryName, brand, peripheryType);
        this.hasBacklight = isHasBacklight();
        this.numberOfKeys = getNumberOfKeys();
        keyboardsCount++;
    }

    @Override
    public void connect() {
        System.out.println("Keyboard " + getBrand() + " connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Keyboard " + getBrand() + " disconnected");
    }

    public boolean isHasBacklight() {
        return hasBacklight;
    }

    public void setHasBacklight(boolean hasBacklight) {
        this.hasBacklight = hasBacklight;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public void pressKey(String text) {
        System.out.print(text);
    }

    public static int getKeyboardsCount() {
        return keyboardsCount;
    }

}
