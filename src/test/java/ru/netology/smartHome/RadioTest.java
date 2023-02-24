package ru.netology.smartHome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;


public class RadioTest {

    @Test
    public void getNumberStation() {
        Radio radio = new Radio();
        radio.getNumberStation();
        int expected = 0;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBelowMinSetNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(-1);
        int expected = 0;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUpMaxSetNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(10);
        int expected = 0;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSetNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(1);
        int expected = 1;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSetNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(9);
        int expected = 9;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextNumberStation() {
        Radio radio = new Radio();
        radio.nextNumberStation();
        int expected = 1;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxToMinNextNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(9);
        radio.nextNumberStation();
        int expected = 0;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxNextNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(8);
        radio.nextNumberStation();
        int expected = 9;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinToMaxPrevNumberStation() {
        Radio radio = new Radio();
        radio.prevNumberStation();
        int expected = 9;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxPrevNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(9);
        radio.prevNumberStation();
        int expected = 8;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinPrevNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(1);
        radio.prevNumberStation();
        int expected = 0;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeMaxVolume() {
        Radio radio = new Radio();
        radio.volume = 10;
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume9Volume() {
        Radio radio = new Radio();
        radio.volume = 9;
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeMinVolume() {
        Radio radio = new Radio();
        radio.volume = 0;
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinDecreaseVolume() {
        Radio radio = new Radio();
        radio.volume = 0;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.volume = 1;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxDecreaseVolume() {
        Radio radio = new Radio();
        radio.volume = 10;
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}
