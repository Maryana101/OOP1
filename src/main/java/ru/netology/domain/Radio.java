package ru.netology.domain;

public class Radio {
  private int radioStation;
  private int countStations;
  private int minStation;
  private int minVolume;
  private int maxVolume = 100;
  private int currentVolume;
  
  public Radio() {
    countStations = 10;
  }
  
  /**
   * Конструктор класса.
   */
  public Radio(int countStations) {
    this.countStations = countStations;
  }
  
  /**
   * Сеттер для класса Radio.
   */
  public void setRadioStation(int radioStation) {
    if (radioStation > getMaxStation()) {
      return;
    } else if (radioStation < minStation) {
      return;
    }
    this.radioStation = radioStation;
  }
  
  /**
   * Геттер для класса Radio.
   */
  public int getRadioStation() {
    return radioStation;
  }
  
  public int getMaxStation() {
    return countStations - 1;
  }
  
  /**
   * Переключение на следующую станцию.
   */
  public void nextRadioStation() {
    if (radioStation >= getMaxStation()) {
      setRadioStation(minStation);
    } else {
      setRadioStation(radioStation + 1);
    }
  }
  
  /**
   * Предыдущая станция.
   */
  public void prevRadioStation() {
    if (radioStation <= minStation) {
      setRadioStation(getMaxStation());
    } else {
      setRadioStation(radioStation - 1);
    }
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
   * текущий уровень звука.
   */
  public int getVolume() {
    return currentVolume;
  }
}
