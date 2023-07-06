package ru.netology.stats;

public class StatsService {

    public int sum(int[] months) {
        int totalSale = 0;
        for (int i = 0; i < months.length; i++) {
            totalSale = totalSale + months[i];
        }
        return totalSale;
    }


    public int average(int[] months) {
        int totalSale = sum(months);
        int averageMoney = 0;
        int i = 0;
        for (; i < months.length; i++) {

        }
        averageMoney = totalSale / i;
        return averageMoney;
    }





    public int maxSales(int[] months) {
        int maxMonth = 0;

        int i = 0;
        for (; i < months.length; i++) {
            if (months[i] >= months[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int minSales(int[] months) {
        int minMonth = 0;

        int i = 0;
        for (; i < months.length; i++) {
            if (months[i] <= months[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int BelowAverageMonths(int[] months) {

        int minMonth = 0;
        int averageMoney = average(months);
        int i = 0;

        for (i = 0; i < months.length; i++) {
            if (months[i] < averageMoney) {
                minMonth++;
            }
        }
        return minMonth;
    }


    public int AboveAverageMonths(int[] months) {

        int maxMonth = 0;
        int averageMoney = average(months);
        int i = 0;

        for (i = 0; i < months.length; i++) {
            if (months[i] > averageMoney) {
                maxMonth++;
            }
        }
        return maxMonth;
    }
}