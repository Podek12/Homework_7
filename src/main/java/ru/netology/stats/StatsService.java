package ru.netology.stats;

public class StatsService {

    public long sumAllSales(long[] sales) {

        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long sumAverageSalesInMonth(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (sum + sales[i]);
        }
        return sum = sum / sales.length;
    }

    public int sumMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int sumMinSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int minCalcMonthBelowAverage(long[] sales) {
        int calcMinMonth = 0;
        long sumAverageSalesInMonth = sumAverageSalesInMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sumAverageSalesInMonth) {
                calcMinMonth = calcMinMonth + 1;
            }

        }
        return calcMinMonth;
    }

    public int maxCalcMonthHigherAverage(long[] sales) {
        int calcMaxMonth = 0;
        long sumAverageSalesInMonth = sumAverageSalesInMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sumAverageSalesInMonth(sales)) {
                calcMaxMonth = calcMaxMonth + 1;
            }
        }
        return calcMaxMonth;
    }

}