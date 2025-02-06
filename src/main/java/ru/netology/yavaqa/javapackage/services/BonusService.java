package ru.netology.yavaqa.javapackage.services;

public class BonusService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев
        int money = 0; // количество денег на счету
        for (int month = 0; month + count < 12; month++) {
            if (money >= threshold) { // если на счете больше порога
                count++; // увеличиваем счётчик месяцев
                money = (int) Math.ceil((money - expenses) / 3.0); // распределяем деньги
            } else {
                money = money + income - expenses;// обновляем баланс по месяцам
            }

        }
        return count;
    }
}



