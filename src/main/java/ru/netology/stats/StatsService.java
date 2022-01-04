package ru.netology.stats;

public class StatsService {

    //Считаем сумму значений массива
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Считаем среднее значение продаж
    public int calcMean(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    //Ищем максимальную продажу и последний месяц с максимальной продажей
    public int currentMax(int[] sales) {
        int max = sales[0];
        int count = 1;

        for (int i = 1; i < sales.length; i++) {
            max = Math.max(max, sales[i]);
        }

        for (int i = 0; i < sales.length; i++) {
            if (max == sales[i]) {
                count = i + 1;
            }
        }
        return count;
    }

    //Ищем минимальную продажу и месяц с минимальной продажей
    public int currentMin(int[] sales) {
        int min = sales[0];
        int count = 1;

        for (int i = 1; i < sales.length; i++) {
            min = Math.min(min, sales[i]);
        }

        for (int i = 0; i < sales.length; i++) {
            if (min == sales[i]) {
                count = i + 1;
            }
        }
        return count;
    }

    //Ищем количество месяцев меньше среднего
    public int belowAverage(int[] sales) {
        int avg = calcMean(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                count++;
            }
        }
        return count;
    }

    //Ищем количество месяцев больше среднего
    public int aboveAverage(int[] sales) {
        int avg = calcMean(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                count++;
            }
        }
        return count;
    }
}

