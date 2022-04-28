package ru.netology.SmartHouse;

public class Radio {

    public int currentStation;
    public int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return volume;
    }

    public void setCurrentStation (int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation(int currentStation) {
        if (currentStation < 9 && currentStation >= 0) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            this.currentStation = 0;
        }
        return;
    }

    public void previousStation (int currentStation) {
        if (currentStation > 0 && currentStation <= 9) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            this.currentStation = 9;
        }
        return;
    }

    public void setCurrentVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;

    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume < 10) {
            this.volume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            this.volume = currentVolume;
        }
    }

    public void decreaseVolume(int currentVolume) {
        if (currentVolume > 0 && currentVolume <= 10) {
            this.volume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            this.volume = currentVolume;
        }
    }


}
