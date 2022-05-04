package ru.netology.SmartHouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void pickStation() {
        Radio service = new Radio();

        service.setCurrentStation(5);

        int expected = 5;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void pickStationCustomRadio() {
        Radio service = new Radio(30);

        service.setCurrentStation(18);

        int expected = 18;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void pickStationUnderLimit() {
        Radio service = new Radio();

        service.setCurrentStation(-1);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void pickStationOverLimit() {
        Radio service = new Radio();

        service.setCurrentStation(10);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void pickVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(10);

        int expected = 10;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void pickVolumeUnderLimit() {
        Radio service = new Radio();

        service.setCurrentVolume(-1);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void pickVolumeOverLimit() {
        Radio service = new Radio();

        service.setCurrentVolume(101);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio service = new Radio();

        service.setCurrentStation(3);

        service.nextStation();

        int expected = 4;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void changeStationFromMaxToMin() {
        Radio service = new Radio();

        service.setCurrentStation(9);

        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio service = new Radio();

        service.setCurrentStation(5);

        service.prevStation();

        int expected = 4;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void changeStationFromMinToMax() {
        Radio service = new Radio();

        service.setCurrentStation(0);

        service.prevStation();

        int expected = 9;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(55);

        service.increaseVolume();

        int expected = 56;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(3);

        service.decreaseVolume();

        int expected = 2;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTopBorder() {
        Radio service = new Radio();

        service.setCurrentVolume(100);

        service.increaseVolume();

        int expected = 100;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBottomBorder() {
        Radio service = new Radio();

        service.setCurrentVolume(0);

        service.decreaseVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void nextStationWithCustomNumberOfStations() {
        Radio service = new Radio(30);

        service.setCurrentStation(25);
        service.nextStation();

        int expected = 26;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void fromMaxStationToMinStationCustomRadio() {
        Radio service = new Radio(30);

        service.setCurrentStation(29);
        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStationWithCustomNumberOfStations() {
        Radio service = new Radio(30);

        service.setCurrentStation(15);
        service.prevStation();

        int expected = 14;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void fromMinStationToMaxStationCustomRadio() {
        Radio service = new Radio(30);

        service.setCurrentStation(0);
        service.prevStation();

        int expected = 29;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }
}