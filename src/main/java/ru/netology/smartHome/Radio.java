package ru.netology.smartHome;

public class Radio {
    private int numberStation;
    private int volume;

    public int getNumberStation() {
        return numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > 9) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void nextNumberStation() {
        if (numberStation < 9) {
            numberStation = numberStation + 1;
        } else {
            numberStation = 0;
        }
    }

    public void prevNumberStation() {
        if (numberStation > 0) {
            numberStation = numberStation - 1;
        } else {
            numberStation = 9;
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
