package by.epam.ayem.module4;

/*6. Составьте описание класса для представления времени. Предусмотрите возможности установки времени
и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений поле устанавливается в значение 0. Создать методы изменения времени
на заданное количество часов, минут и секунд.*/

public class AppRunner {

    public static void main(String[] args) {
        Time time = new Time(3,45,23);
        time.showTime();
        time.setHours(2);
        time.setMinutes(70);
        time.setSeconds(50);
        time.showTime();
    }
}
