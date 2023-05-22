package org.example.homework6.hw1;

import java.util.Scanner;

public class Laptop
{
    String _name;
    String _serialNumber;
    int _ram;
    String _color;
    String _operationalSystem;

    public Laptop(String name, String serialNumber, int ram, String color, String operationalSystem)
    {
        _name = name;
        _serialNumber = serialNumber;
        _ram = ram;
        _color = color;
        _operationalSystem = operationalSystem;
    }

    public void showInfo()
    {
        System.out.println("Name: " + _name + "\nSerial Number: " + _serialNumber + "\nRAM: " + _ram +
                           " gb\nColor: " + _color + "\nOperational System: " + _operationalSystem + "\n");
    }
}
