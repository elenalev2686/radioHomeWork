package ru.netology.radiohomework.servise;

import lombok.Getter;

@Getter
public class Radio {

    private int currentStationNumber;
    private int currentVolume;
    private int firstStation = 0;
    private int lastStation;
    private int maxVolume = 100;
    private int minVolume = 0;



    public Radio() {
        this.lastStation = 9;
    }

    public Radio(int lastStation) {
        this.lastStation = lastStation - 1;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > lastStation) {
            return;
        }
        if (currentStationNumber < firstStation) {
            return;
        }
        this.currentStationNumber = currentStationNumber;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            setMaxVolume(100);
        }
        if (currentVolume < minVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void setFirstStation(int firstStation) {
        currentStationNumber = firstStation;
    }

    public void setLastStation(int lastStation) {
        currentStationNumber = lastStation;
    }

    public void setMaxVolume(int maxVolume) {
        currentVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        currentVolume = minVolume;
    }

    public void nextStation() {
        if (currentStationNumber != lastStation) {
            currentStationNumber = currentStationNumber + 1;
        } else {
            setFirstStation(0);
        }
    }

    public void prevStation() {
        if (currentStationNumber != firstStation) {
            currentStationNumber = currentStationNumber - 1;

        } else {
            setLastStation(9);
        }
    }

    public void increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > maxVolume) {
            setMaxVolume(100);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}






