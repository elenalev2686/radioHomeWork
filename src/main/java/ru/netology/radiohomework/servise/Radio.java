package ru.netology.radiohomework.servise;

public class Radio {
    private int currentStationNumber;

    int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {

        if (newCurrentStationNumber > 9) {
            return;
        }
        if (newCurrentStationNumber < 0) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;

    }

    public void nextStation() {
        if (currentStationNumber != 9) {
            currentStationNumber = currentStationNumber + 1;
        } else {
            setFirstStation();
        }
    }

    public void prevStation() {
        if (currentStationNumber != 0) {
            currentStationNumber = currentStationNumber - 1;

        } else {
            setLastStation();
        }
    }

    public void setFirstStation() {
        currentStationNumber = 0;
    }

    public void setLastStation() {
        currentStationNumber = 9;
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            setMaxVolume();
        }
        if (newCurrentVolume < 0) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void setMaxVolume() {
        currentVolume = 100;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 100) {
            setMaxVolume();
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

