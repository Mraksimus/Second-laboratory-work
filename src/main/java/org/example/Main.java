package org.example;

import org.example.types.Orientation;
import org.example.types.PeripheryType;
import org.example.types.PrinterType;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Keyboard appleKeyboard = new Keyboard("Keyboard", "Apple", PeripheryType.INPUT);
        Keyboard microsoftKeyboard = new Keyboard("Keyboard", "Microsoft", PeripheryType.INPUT);
        Keyboard hpKeyboard = new Keyboard("Keyboard", "HP", PeripheryType.INPUT);

        Printer hpPrinter = new Printer("Printer", "HP", PrinterType.LASER, PeripheryType.OUTPUT, 100);
        Printer epsonPrinter = new Printer("Printer", "Epson", PrinterType.LASER, PeripheryType.OUTPUT, 100);
        Printer applePrinter = new Printer("Printer", "Apple", PrinterType.LASER, PeripheryType.OUTPUT, 100);

        Headphones appleHeadphones = new Headphones(Color.RED, "Headphones", "Apple", PeripheryType.INPUT, true, 101);
        Headphones microsoftHeadphones = new Headphones(Color.BLUE, "Headphones", "Microsoft", PeripheryType.INPUT, true, 100);
        Headphones hpHeadphones = new Headphones(Color.GREEN, "Headphones", "HP", PeripheryType.INPUT, true, 100);

        System.out.println("Всего клавиатур: " + Keyboard.getKeyboardsCount());

        appleKeyboard.connect();

        microsoftKeyboard.connect();
        hpKeyboard.connect();

        hpPrinter.connect();
        epsonPrinter.connect();
        applePrinter.connect();

        appleHeadphones.connect();
        microsoftHeadphones.connect();
        hpHeadphones.connect();

        appleKeyboard.pressKey("A");
        appleKeyboard.pressKey("B");
        appleKeyboard.pressKey("C");

        appleKeyboard.disconnect();
        microsoftKeyboard.disconnect();
        hpKeyboard.disconnect();

        hpPrinter.disconnect();
        epsonPrinter.disconnect();
        applePrinter.disconnect();

        appleHeadphones.disconnect();
        microsoftHeadphones.disconnect();
        hpHeadphones.disconnect();

        applePrinter.print(1, Orientation.LANDSCAPE);
        applePrinter.print(1);
        applePrinter.print(1, 2, Orientation.LANDSCAPE);

    }
}