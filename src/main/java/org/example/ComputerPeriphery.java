package org.example;

import org.example.types.PeripheryType;

public abstract class ComputerPeriphery {

    private String peripheryName;
    private String brand;
    private PeripheryType peripheryType;

    public ComputerPeriphery() {
        this.peripheryName = "UNKNOWN";
        this.brand = "UNKNOWN";
        this.peripheryType = PeripheryType.UNKNOWN;
    }

    public ComputerPeriphery(String peripheryName, String brand, PeripheryType peripheryType) {
        this.setPeripheryName(peripheryName);
        this.setBrand(brand);
        this.setConnectionType(peripheryType);
    }

    public abstract void connect();
    public abstract void disconnect();

    public void setPeripheryName(String peripheryName) {
        this.peripheryName = peripheryName;
    }

    public String getPeripheryName() {
        return peripheryName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setConnectionType(PeripheryType peripheryType) {
        this.peripheryType = peripheryType;
    }

    public PeripheryType getConnectionType() {
        return peripheryType;
    }

}
