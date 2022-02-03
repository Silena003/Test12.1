package ru.netology.domai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void constructorVolume() {
        Radio radio = new Radio(100, 100, 0, true);

        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void constructorRadioStationPro() {
        Radio radio = new Radio(8, 0, 9, true);
        assertEquals(8, radio.getCurrentRadioStation());
    }

}