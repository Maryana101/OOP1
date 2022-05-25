package ru.netology.domain;

public class Radio {
  private int radioStation;
  private int minStation = 0;
  private int maxStation = 9;
  private int currentVolume;
  private int minVolume = 0;
  private int maxVolume = 10;
  
  public int getVolume() {
    return currentVolume;
  }
  
  /**
   * Увеличение громкости звука.
   */
  public void increaseVolume() {
    if (currentVolume < maxVolume) {
      currentVolume = currentVolume + 1;
    }
  }
  
  /**
   * Уменьшение громкости звука.
   */
  public void decreaseVolume() {
    if (currentVolume > minVolume) {
      currentVolume = currentVolume - 1;
    }
  }
  
  /**
   * Сеттер для класса RadioStation.
   */
  public void setRadioStation(int radioStation) {
    if (radioStation > maxStation) {
      return;
    }
    if (radioStation < minStation) {
      return;
    }
    this.radioStation = radioStation;
  }
  
  /**
   * Геттер для класса RadioStation.
   */
  public int getRadioStation() {
    return radioStation;
  }
  
  /**
   * Следующая станция.
   */
  public void nextRadioStation() {
    int currentRadioStation = getRadioStation();
    if (currentRadioStation == maxStation) {
      setRadioStation(minStation);
    } else {
      setRadioStation(currentRadioStation + 1);
    }
  }
  
  /**
   * Предыдущая станция.
   */
  public void prevRadioStation() {
    int currentRadioStation = getRadioStation();
    if (currentRadioStation == minStation) {
      setRadioStation(maxStation);
    } else {
      setRadioStation(currentRadioStation - 1);
    }
  }

}
