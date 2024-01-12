package ru.gb.tests.taxi;

public class Friend implements Drivable{
    @Override
    public void drive(String address) {
        System.out.println("ok");
    }
}
