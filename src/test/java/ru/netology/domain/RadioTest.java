package ru.netology.domain;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class RadioTest {
    int maxRadioStation = 9;
    int minRadioStation = 0;
    int maxVolume = 10;
    int minVolume = 0;

    @Test
    public void maxRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(maxRadioStation);
        int expected = maxRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(minRadioStation);
        int expected = minRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void moreThanMaxRadioStation() {
        Radio radio = new Radio();
        int currentStation = maxRadioStation + 1;
        radio.setRadioStation(currentStation);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void lessThanMinRadioStation() {
        Radio radio = new Radio();
        int currentStation = minRadioStation - 1;
        radio.setRadioStation(currentStation);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nextAfterMaxRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(maxRadioStation);
        radio.nextRadioStation();
        int expected = minRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nextBeforeMaxRadioStation() {
        int currentStation = maxRadioStation - 1;
        Radio radio = new Radio();
        radio.setRadioStation(currentStation);
        radio.nextRadioStation();
        int expected = maxRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nextMinRadioStation() {
        int currentStation = minRadioStation;
        Radio radio = new Radio();
        radio.setRadioStation(currentStation);
        radio.nextRadioStation();
        int expected = currentStation + 1;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void prevMinRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(minRadioStation);
        radio.prevRadioStation();
        int expected = maxRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void prevMaxRadioStation() {
        int currentStation = maxRadioStation;
        Radio radio = new Radio();
        radio.setRadioStation(currentStation);
        radio.prevRadioStation();
        int expected = currentStation - 1;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxVolumeRadioStation() {
        Radio radio = new Radio();
        for (int i = minVolume; i <= maxVolume + 1; i++) {
            radio.increaseVolume();
        }
        int actual = radio.getVolume();
        int expected = maxVolume;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minVolumeRadioStation() {
        Radio radio = new Radio();
        for (int i = minVolume; i <= maxVolume; i++) {
            radio.increaseVolume();
        }
        for (int i = maxVolume; i >= minVolume - 1; i--) {
            radio.decreaseVolume();
        }
        int actual = radio.getVolume();
        int expected = minVolume;
        Assert.assertEquals(expected, actual);
    }
}
