package org.example;

import org.example.types.PeripheryType;
import org.example.types.Orientation;
import org.example.types.PrinterType;

public class Printer extends ComputerPeriphery {

    private PrinterType printerType;
    private int cartridgeRemaining;

    public Printer(String name, PrinterType type, int cartridgeRemaining) {
        super();
        this.printerType = type;
        this.cartridgeRemaining = cartridgeRemaining;
    }

    public Printer(
        String peripheryName,
        String brand,
        PrinterType type,
        PeripheryType peripheryType,
        int cartridgeRemaining
    ) {
        super(peripheryName, brand, peripheryType);
        this.printerType = type;
        this.cartridgeRemaining = cartridgeRemaining;
    }

    @Override
    public void connect() {
        System.out.println("Printer " + getBrand() + " connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Printer " + getBrand() + " disconnected");
    }

    public PrinterType getType() {
        return printerType;
    }

    public void setType(PrinterType type) {
        this.printerType = type;
    }

    public int getCartridgeRemaining() {
        return cartridgeRemaining;
    }

    public void setCartridgeRemaining(int cartridgeRemaining) {
        this.cartridgeRemaining = cartridgeRemaining;
    }

    public void print(int pages, int copies, Orientation orientation) {
        System.out.println("Printing " + pages + " pages " + copies + " copies " + orientation.name().toLowerCase());
    }

    public void print(int pages, Orientation orientation) {
        System.out.println("Printing " + pages + " pages " + orientation.name().toLowerCase());
    }

    public void print(int pages) {
        System.out.println("Printing " + pages + " pages");
    }

}
