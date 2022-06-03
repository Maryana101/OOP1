package ru.netology.domain;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class RadioTest {
    int defaultCountRadioStations=10;
    int defaultMaxRadioStation = defaultCountRadioStations-1;
    Radio defaultRadio=new Radio();
    
    int oneRadioStation=0;
    Radio oneRadio=new Radio(oneRadioStation);
    int countRadioStations=25;
    int maxRadioStation=countRadioStations-1;
    Radio radio=new Radio(countRadioStations);
    
    int minRadioStation = 0;
    int maxVolume = 100;
    int minVolume = 0;
    
    @Test
    public void setOneRadioStation() {
        int expected = oneRadioStation;
        int actual = oneRadio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void moreThanMaxDefaultRadioStation() {
        int expected = minRadioStation;
        int actual = oneRadio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void maxDefaultRadioStation() {
        int currentStation = defaultMaxRadioStation;
        defaultRadio.setRadioStation(currentStation);
        int expected = defaultMaxRadioStation;
        int actual = defaultRadio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void lessThanMinDefaultRadioStation() {
        int currentStation = minRadioStation-1;
        defaultRadio.setRadioStation(currentStation);
        int expected = minRadioStation;
        int actual = defaultRadio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void minDefaultRadioStation() {
        int currentStation = minRadioStation;
        defaultRadio.setRadioStation(currentStation);
        int expected = minRadioStation;
        int actual = defaultRadio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void moreThanMaxRadioStation() {
        int currentStation = maxRadioStation + 1;
        radio.setRadioStation(currentStation);
        int expected = minRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void maxRadioStation() {
        int currentStation = maxRadioStation;
        radio.setRadioStation(currentStation);
        int expected = maxRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void minRadioStation() {
        int currentStation = minRadioStation;
        radio.setRadioStation(currentStation);
        int expected = minRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void lessThanMinRadioStation() {
        int currentStation = minRadioStation-1;
        radio.setRadioStation(currentStation);
        int expected = minRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nextAfterMaxDefaultRadioStation() {
        defaultRadio.setRadioStation(defaultMaxRadioStation);
        defaultRadio.nextRadioStation();
        int expected = minRadioStation;
        int actual = defaultRadio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void nextAfterMaxRadioStation() {
        radio.setRadioStation(maxRadioStation);
        radio.nextRadioStation();
        int expected = minRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nextBeforeMaxRadioStation() {
        int currentStation = maxRadioStation - 1;
        radio.setRadioStation(currentStation);
        radio.nextRadioStation();
        int expected = maxRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nextBeforeMaxDefaultRadioStation() {
        int currentStation = defaultMaxRadioStation - 1;
        defaultRadio.setRadioStation(currentStation);
        defaultRadio.nextRadioStation();
        int expected = defaultMaxRadioStation;
        int actual = defaultRadio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nextMinRadioStation() {
        int currentStation = minRadioStation;
        radio.setRadioStation(currentStation);
        radio.nextRadioStation();
        int expected = currentStation + 1;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nextMinDefaultRadioStation() {
        int currentStation = minRadioStation;
        defaultRadio.setRadioStation(currentStation);
        defaultRadio.nextRadioStation();
        int expected = currentStation + 1;
        int actual = defaultRadio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void prevMinRadioStation() {
        radio.setRadioStation(minRadioStation);
        radio.prevRadioStation();
        int expected = maxRadioStation;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void prevMinDefaultRadioStation() {
        defaultRadio.setRadioStation(minRadioStation);
        defaultRadio.prevRadioStation();
        int expected = defaultMaxRadioStation;
        int actual = defaultRadio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void prevMaxRadioStation() {
        int currentStation = maxRadioStation;
        radio.setRadioStation(currentStation);
        radio.prevRadioStation();
        int expected = currentStation - 1;
        int actual = radio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void prevMaxDefaultRadioStation() {
        int currentStation = defaultMaxRadioStation;
        defaultRadio.setRadioStation(currentStation);
        defaultRadio.prevRadioStation();
        int expected = currentStation - 1;
        int actual = defaultRadio.getRadioStation();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void maxVolumeRadioStation() {
        for (int i = minVolume; i <= maxVolume + 1; i++) {
            radio.increaseVolume();
        }
        int actual = radio.getVolume();
        int expected = maxVolume;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void minVolumeRadioStation() {
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
