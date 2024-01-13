package ru.netology.customRadio;
public class Radio {
    private int numberCurrentStation;
    private int volume;

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < 0) {
            return;
        }
        if (newNumberCurrentStation > 9) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    public void nextStation(){
        if (numberCurrentStation == 9){
            numberCurrentStation = 0;
        }
        else{
            numberCurrentStation = numberCurrentStation + 1;
        }
    }

    public void prevStation(){
        if (numberCurrentStation == 0){
            numberCurrentStation = 9;
        }
        else{
            numberCurrentStation = numberCurrentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return volume;
    }

    public void increaseVolume(){
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void downVolume(){
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
