package ru.netology.smartHome;

public class Radio {
    public int quantityStation = 10;
    public int maxVolume =100;
    public int numberStation;
    public int volume;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio() {
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > quantityStation-1) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void nextNumberStation() {
        if (numberStation < quantityStation-1) {
            numberStation = numberStation + 1;
        } else {
            numberStation = 0;
        }
    }

    public void prevNumberStation() {
        if (numberStation > 0) {
            numberStation = numberStation - 1;
        } else {
            numberStation = quantityStation-1;
        }
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
