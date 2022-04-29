package ru.netology.SmartHouse;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

//    public void next() {
//        int newCurrentStation = currentStation + 1;
//        if (newCurrentStation == 1) {
//            newCurrentStation = 0;
//        }
//        setCurrentStation(newCurrentStation);
//        if (currentStation == 9) {
//            currentStation = 0;
//        }
//    }
//

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentStation >= 0 && currentStation < 9) {
            currentStation = currentStation + 1;
        } else {currentStation = 0;}

    }

    public void prev() {
        if (currentStation <= 9 && currentStation > 0) {
            currentStation = currentStation - 1;
        } else {currentStation = 9;}

    }
}










