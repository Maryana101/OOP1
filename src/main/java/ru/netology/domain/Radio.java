package ru.netology.domain;

public class Radio {
  private int radioStation;
  private int countStations;
  private int minStation;
  private int maxStation;
  private int minVolume;
  private int maxVolume = 100;
  private int currentVolume;
  
  public Radio() {
    countStations = 10;
    maxStation = countStations - 1;
  }
  
  /**
   * Конструктор класса с инициализацией параметра.
   */
  public Radio(int countStations) {
    if (countStations <= 0) {
      maxStation = 0;
    } else {
      this.countStations = countStations;
      maxStation = countStations - 1;
    }
  }
  
  /**
   * Сеттер для класса Radio.
   */
  public void setRadioStation(int radioStation) {
    if (radioStation > maxStation) {
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
  
  /**
   * Переключение на следующую станцию.
   */
  public void nextRadioStation() {
    if (radioStation >= maxStation) {
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
      setRadioStation(maxStation);
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
