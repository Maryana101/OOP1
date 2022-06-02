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
    maxStation=9;
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
}