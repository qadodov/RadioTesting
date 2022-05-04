package ru.netology.SmartHouse;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Radio {

    // ПОЛЯ

    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int numberOfStations = 10;

    // КОНСТРУКТОРЫ

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.maxStation = numberOfStations - 1;
    }

    // МЕТОДЫ

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {currentStation = minStation;}

    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {currentStation = maxStation;}

    }
}










