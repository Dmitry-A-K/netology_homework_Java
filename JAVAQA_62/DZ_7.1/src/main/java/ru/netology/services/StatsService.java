package ru.netology.services;

public class StatsService {

    public int amountAllSales(int[] amount) {    //  сумма продаж
        int result = 0;
        for (int i = 0; i <= (amount.length - 1); i++) {
            result = result + amount[i];
        }
        return result;
    }

    public int averageSalesPerMonth(int[] amount) {  //  средняя сумма в месяц
        int result = amountAllSales(amount);
        return (result / amount.length);
    }

    public int monthMaximumAmount(int[] amount) {   //  месяц с максимальной суммой
        int result = 0;
        int sum = 0;
        for (int i = 0; i < (amount.length - 1); i++) {
            if (amount[i] >= sum) {
                result = i + 1;
                sum = amount[i];
            }
        }
        return result;
    }

    public int monthMinimalAmount(int[] amount) {    // месяц с минимальной суммой
        int result = 0;
        int sum = amountAllSales(amount);
        for (int i = 0; i <= (amount.length - 1); i++) {
            if (amount[i] <= sum) {
                result = i + 1;
                sum = amount[i];
            }
        }
        return result;
    }

    public int counterMonthMaxAmount(int[] amount) { // месяцев выше среднего
        int result = 0;
        int average = averageSalesPerMonth(amount);
        for (int i = 0; i <= (amount.length - 1); i++) {
            if (amount[i] > average) {
                result++;
            }
        }
        return result;
    }

    public int counterMonthMinAmount(int[] amount) { // месяцев ниже средего
        int result = 0;
        int average = averageSalesPerMonth(amount);
        for (int i = 0; i < (amount.length - 1); i++) {
            if (amount[i] < average) {
                result++;
            }
        }
        return result;
    }
}

