package ru.netology.domai;

public class Radio {
    String name = "Be52";
    private int currentRadioStation = 8;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentVolume = 100;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;
    boolean on;

    public Radio() {
    }

    public Radio(int currentVolume, int minCurrentVolume, int maxCurrentVolume, boolean on) {
        this.currentVolume = currentVolume;
        this.minCurrentVolume = minCurrentVolume;
        this.maxCurrentVolume = maxCurrentVolume;
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < maxCurrentVolume) {
            currentVolume++;
            return;
        }
        if (currentVolume > maxCurrentVolume) {
            return;
        }
        if (currentVolume < minCurrentVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }

    public void setMinCurrentVolume(int minCurrentVolume) {
        this.minCurrentVolume = minCurrentVolume;

    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }

    public void setMaxCurrentVolume(int maxCurrentVolume) {
        this.maxCurrentVolume = maxCurrentVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}

