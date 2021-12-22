package ru.netology.stats;

public class StatsService<count> {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcMean(int[] sales) {
        int a = (sales.length);
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int mean = sum / a;
        return mean;
    }

    public int currentMax(int[] sales) {
        int max = sales[0];
        int count = 1;

//        ищем максимальную продажу
        for (int i = 1; i < sales.length; i++) {
            max = Math.max(max, sales[i]);
        }
//        ищем последний месяц с максимальной продажей
        for (int i = 0; i < sales.length; i++) {
            if (max == sales[i]) {
                count = i + 1;
            }
        }
        return count;
    }

    public int currentMin(int[] sales) {
        int min = sales[0];
        int count = 1;

//        ищем минимальную продажу
        for (int i = 1; i < sales.length; i++) {
            min = Math.min(min, sales[i]);
        }
//        ищем месяцы с минимальной продажей
        for (int i = 0; i < sales.length; i++) {
            if (min == sales[i]) {
                count = i + 1;
            }
        }
        return count;
    }

    public int belowAverage(int[] sales) {
        int a = (sales.length);
        int sum = 0;
        int count = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int mean = sum / a;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < mean) {
                count += 1;
            }
        }
        return count;
    }

    public int aboveAverage(int[] sales) {
        int a = (sales.length);
        int sum = 0;
        int count = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int mean = sum / a;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > mean) {
                count += 1;
            }
        }
        return count;
    }
}

