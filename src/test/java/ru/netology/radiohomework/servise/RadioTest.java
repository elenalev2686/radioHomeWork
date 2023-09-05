package ru.netology.radiohomework.servise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void shouldSetStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationMinTwo() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationMaxTwo() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationMinOne() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevStationMaxTwo() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.prevStation();
        int expected = 7;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberMoreThenTheLast() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberMoreThenTheFirst() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberLessThenTheLast() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFirstStation() {
        Radio radio = new Radio();
        radio.setFirstStation();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastStation() {
        Radio radio = new Radio();
        radio.setLastStation();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMinOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMaxOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMaxTwo() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMinOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMaxOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.decreaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMaxTwo() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}