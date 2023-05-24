package ru.netology.services;

public class FreelanceVacation {
    public int calculate(int income, int expense, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                int moneyStart = money;
                money = (money - expense) / 3;
                int moneyVacation;
                moneyVacation = moneyStart - money - expense;
                System.out.println("Месяц " + (month + 1) + ". Денег " + moneyStart + ". Буду отдыхать. Потратил -" + expense + ", затем ещё -" + moneyVacation);

            } else {
                System.out.println("Месяц " + (month + 1) + ". Денег " + money + ". Придётся работать. Заработал +" + income + ", потратил -" + expense);
                money = money + income - expense;
            }
        }
        return count;
    }
}