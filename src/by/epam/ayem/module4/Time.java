package by.epam.ayem.module4;

/*6. Составьте описание класса для представления времени. Предусмотрите возможности установки времени
и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений поле устанавливается в значение 0. Создать методы изменения времени
на заданное количество часов, минут и секунд.*/

public class Time {

    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public Time() {
    }

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            System.out.println("Hours set up is not correct. Hours were set to 0.");
            this.hours = 0;
        } else {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            System.out.println("Minutes set up is not correct. Minutes were set to 0.");
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            System.out.println("Minutes set up is not correct. Minutes were set to 0.");
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public void showTime() {
        System.out.printf("Current time is %02d:%02d:%02d \n", hours, minutes, seconds);
    }
}
