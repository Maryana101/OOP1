package ru.netology.domain;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class RadioTest {
  Radio radio = new Radio();
  Radio radio_all = new Radio(0, 25, 0, 24, 0, 100, 0);
  
  @Test
  public void getDefaultRadioCount() {
    int actual = radio.getCountStations();
    int expected = 10;
    Assert.assertEquals(expected, actual);
  }
  
  @Test
  public void getRadioStation() {
    radio_all.setRadioStation(5);
    int expected = 5;
    int actual = radio_all.getRadioStation();
    Assert.assertEquals(expected, actual);
  }
  
  @Test
  public void getMinDefaultStation() {
    int expected = 0;
    int actual = radio.getMinStation();
    Assert.assertEquals(expected, actual);
  }
  
  @Test
  public void getMinStation() {
    int expected = 0;
    int actual = radio_all.getMinStation();
    Assert.assertEquals(expected, actual);
  }
  
  @Test
  public void getMaxStation() {
    int expected = 9;
    int actual = radio.getMaxStation();
    Assert.assertEquals(expected, actual);
  }
  
  @Test
  public void prevMinRadioStation() {
    radio.setRadioStation(0);
    radio.prevRadioStation();
    int expected = radio.getMaxStation();
    int actual = radio.getRadioStation();
    Assert.assertEquals(expected, actual);
  }
  
  @Test
  public void prevRadioStation() {
    radio.setRadioStation(9);
    radio.prevRadioStation();
    int expected = 8;
    int actual = radio.getRadioStation();
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void nextMaxRadioStation() {
    radio.setRadioStation(9);
    radio.nextRadioStation();
    int expected = radio.getMinStation();
    int actual = radio.getRadioStation();
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void nextRadioStation() {
    radio.setRadioStation(7);
    radio.nextRadioStation();
    int expected = 8;
    int actual = radio.getRadioStation();
    Assert.assertEquals(expected, actual);
  }
  
  
  @Test
  public void maxVolumeRadioStation() {
    for (int i = 0; i <= 110 + 1; i++) {
      radio.increaseVolume();
    }
    int actual = radio.getCurrentVolume();
    int expected = radio.getMaxVolume();
    Assert.assertEquals(expected, actual);
  }
  @Test
  public void minVolumeRadioStation() {
    for (int i = 0; i <= 110 + 1; i++) {
      radio.increaseVolume();
    }
    for (int i = 100; i >= 0; i--) {
      radio.decreaseVolume();
    }
    int actual = radio.getCurrentVolume();
    int expected = radio.getMinVolume();
    Assert.assertEquals(expected, actual);
  }

    /*
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
   */
  
}
