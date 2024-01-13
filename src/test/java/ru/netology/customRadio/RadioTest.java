package ru.netology.customRadio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(5);

        int expected = 5;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(15);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMax() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(-1);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAfterMax() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationAfterMin() {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();
        radio.increaseVolume();
        radio.downVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolumeBelowMin() {
        Radio radio = new Radio();

        radio.downVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolumeHigherMax() {
        Radio radio = new Radio();

        for (int i = 1; i <= 101; i++) {
            radio.increaseVolume();
        }

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
