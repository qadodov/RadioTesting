package ru.netology.SmartHouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void stationOverLimit() {
        Radio service = new Radio();

        service.setCurrentStation(10);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void stationUnderLimit() {
        Radio service = new Radio();

        service.setCurrentStation(-1);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStation() {
        Radio service = new Radio();

        service.setCurrentStation(5);

        int expected = 5;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToNextStation() {
        Radio service = new Radio();

        service.nextStation(8);

        int expected = 9;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToStationZero() {
        Radio service = new Radio();

        service.nextStation(9);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeInvalidCurrentStation() {
        Radio service = new Radio();

        service.nextStation(-1);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToPreviousStation() {
        Radio service = new Radio();

        service.previousStation(9);

        int expected = 8;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToStationNine() {
        Radio service = new Radio();

        service.previousStation(0);

        int expected = 9;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void invalidCurrentStation() {
        Radio service = new Radio();

        service.previousStation(10);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(9);

        int expected = 9;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeOverBorder() {
        Radio service = new Radio();

        service.setCurrentVolume(11);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeUnderBorder() {
        Radio service = new Radio();

        service.setCurrentVolume(-1);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio service = new Radio();

        service.increaseVolume(8);

        int expected = 9;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio service = new Radio();

        service.increaseVolume(10);

        int expected = 10;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeInvalidUnderBorder() {
        Radio service = new Radio();

        service.increaseVolume(-1);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio service = new Radio();

        service.decreaseVolume(0);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio service = new Radio();

        service.decreaseVolume(5);

        int expected = 4;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void invalidCurrentVolume() {
        Radio service = new Radio();

        service.decreaseVolume(11);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }


}