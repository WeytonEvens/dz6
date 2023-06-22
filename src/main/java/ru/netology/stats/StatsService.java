package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale / sales.length;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int BelowAverageMonths(long[] sales) {
        int counter = 0;

        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }

        }

        return counter;
    }

    public int AboveAverageMonths(long[] sales) {
        int counter = 0;
        long average = average(sales);

        for (long sale : sales) {
            if (sale <= average(sales)) {
                counter++;
            }

        }

        return counter;
    }
}