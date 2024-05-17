package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;

        }
        return sumMonth;
    }

    public double avergSum(long[] sales) {
        double avergSum = 0;
        double sumMonth = 0;

        sumMonth = sumSales(sales);
        avergSum = sumMonth / sales.length;

        return avergSum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int index = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = index;
            }
            index = index + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int index = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = index;
            }
            index = index + 1;
        }
        return maxMonth + 1;
    }

    public int lessThanAvergSales(long[] sales) {
        int lessAvergMonth = 0;
        double avergSum = avergSum(sales);

        for (long sale : sales) {
            if (sale <= avergSum) {
                lessAvergMonth++;
            }
        }
        return lessAvergMonth;
    }

    public int aboveAvergSales(long[] sales) {
        int aboveAvergMonth = 0;
        double avergSum = avergSum(sales);

        for (long sale : sales) {
            if (sale >= avergSum) {
                aboveAvergMonth++;
            }
        }
        return aboveAvergMonth;
    }

}