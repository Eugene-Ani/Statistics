package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private StatsService service = new StatsService();
    private int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    // проверяю сумму значений массива
    @Test
    void shouldCalculateSum() {

        assertEquals(180, service.calcSum(managerSales));
    }

    //проверяю среднее значение
    @Test
    void shouldCalcMean() {

        assertEquals(15, service.calcMean(managerSales));
    }

    //проверяю номер месяца с максимальным значением
    @Test
    void shouldCalcCurrentMax() {

        assertEquals(8, service.currentMax(managerSales));
    }

    //проверяю номер месяца с минимальным значением
    @Test
    void shouldCalcCurrentMin() {

        assertEquals(9, service.currentMin(managerSales));
    }

    //проверяю количество месяцев с значением меньше среднего
    @Test
    void shouldCalcBelowAverage() {

        assertEquals(5, service.belowAverage(managerSales));
    }

    //проверяю количество месяцев с значением больше среднего
    @Test
    void shouldCalcAboveAverage() {

        assertEquals(5, service.aboveAverage(managerSales));
    }
}