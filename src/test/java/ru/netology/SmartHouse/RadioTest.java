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

        service.setCurrentVolume(11);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio service = new Radio();

        service.setCurrentStation(3);

        service.next();

        int expected = 4;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void changeStationFromMaxToMin() {
        Radio service = new Radio();

        service.setCurrentStation(9);

        service.next();

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio service = new Radio();

        service.setCurrentStation(5);

        service.prev();

        int expected = 4;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void changeStationFromMinToMax() {
        Radio service = new Radio();

        service.setCurrentStation(0);

        service.prev();

        int expected = 9;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(8);

        service.increaseVolume();

        int expected = 9;
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

        service.setCurrentVolume(10);

        service.increaseVolume();

        int expected = 10;
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
}