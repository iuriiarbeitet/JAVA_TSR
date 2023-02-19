package HomeWork;

/* Описание занятия: Представьте, что Вы живете в Берлине и собираетесь поехать в Мюнхен.
Вам необходимо создать enum, в котором будут такие варианты передвижения как:
самолет, поезд, автомобиль, велосипед и пешком. Вам необходимо создать такой enum,
в котором в качестве конструктора задавалась бы продолжительность поездки,
в зависимости от способа передвижения. Значение будет задаваться в часах
(дробное число, можно задать приближённое значение, либо попробовать найти лучший вариант на google maps).
Помимо этого, в этом enum необходимо создать метод для получения информации о продолжительности поездки в днях,
 часах, минутах и секундах (разными методами)*/


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public enum Travel_Options {

    PLANE_TRAVEL_OPTION(1, 10, 30){
        @Override
        String printTripDuration() {
            return " - поездка займет: " + getHour() + " ч. " + getMinutes() + " мин. " + getSeconds() + " сек.";
        }
    },

    TRAIN_TRAVEL_OPTION(4, 7, 30){
        String printTripDuration() {
            return " - поездка займет: " + getHour() + " ч. " + getMinutes() + " мин. " + getSeconds() + " сек.";
        }
    },
    CAR_TRAVEL_OPTION(5, 39, 30){
        String printTripDuration() {
            return " - поездка займет: " + getHour() + " ч. " + getMinutes() + " мин. " + getSeconds() + " сек.";
        }
    },
    BICYCLE_TRAVEL_OPTION(1, 14, 45, 30),
    FOOT_TRAVEL_OPTION(4, 22, 30, 30);

    private int day;
    private int hour;
    private int minutes;
    private int seconds;

    String printTripDuration() {
        return " - поездка займет: "+ getDay() + " (дня/день) " + getHour() + " ч. " + getMinutes() + " мин. " + getSeconds() + " сек.";
    }
    Travel_Options(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    Travel_Options(int day, int hour, int minutes, int seconds) {
        this.day = day;
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getDay() {
        return day;
    }
    public int getHour() {
        return hour;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public static void main(String[] args) {
        System.out.println(Travel_Options.PLANE_TRAVEL_OPTION + " " + PLANE_TRAVEL_OPTION.printTripDuration());
        System.out.println(Travel_Options.TRAIN_TRAVEL_OPTION + " " + Travel_Options.TRAIN_TRAVEL_OPTION.printTripDuration());
        System.out.println(CAR_TRAVEL_OPTION + " " + Travel_Options.CAR_TRAVEL_OPTION.printTripDuration());
        System.out.println(BICYCLE_TRAVEL_OPTION + " " + Travel_Options.BICYCLE_TRAVEL_OPTION.printTripDuration());
        System.out.println(FOOT_TRAVEL_OPTION + " " + Travel_Options.FOOT_TRAVEL_OPTION.printTripDuration());
    }


}
