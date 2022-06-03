package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Radio {
  private int radioStation;
  private int countStations;
  private int minStation;
  private int maxStation;
  private int minVolume;
  private int maxVolume;
  private int currentVolume;
  
  public Radio(){
    countStations = 10;
  }
  public int getMinVolume() {
    return 0;
  }
  
  public int getMaxVolume() {
    return 100;
  }
  /**
   * Переключение на следующую станцию.
   */
  public int getMaxStation() {
    maxStation = countStations-1;
    return maxStation ;
  }
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
  
  public void increaseVolume() {
    if (currentVolume < 100) {
      currentVolume = currentVolume + 1;
    } else {return;}
  }
  
  /**
   * Уменьшение громкости звука.
   */
  public void decreaseVolume() {
    if (currentVolume > 0) {
      currentVolume = currentVolume - 1;
    } else {return;}
  }
}