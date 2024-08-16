package ru.netology.stats;

public class Main {
    public static void main(String[] args) {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long sumOfSales = service.calculateSumOfAllSales(sales);
        System.out.println("Сумма продаж: " + sumOfSales);

        long averageSales = service.calculateAverageSales(sales);
        System.out.println("Средняя сумма продаж: " + averageSales);

        long maxSalesMonth = service.calculateMaximumSales(sales);
        System.out.println("Месяц с максимальными продажами: " + maxSalesMonth);

        long minSalesMonth = service.calculateMinSales(sales);
        System.out.println("Месяц с минимальными продажами: " + minSalesMonth);

        long belowAverageCount = service.countBelowAverageSales(sales);
        System.out.println("Количество месяцев с родажами ниже среднего: " + belowAverageCount);

        long aboveAverageCount = service.countAboveAverageSales(sales);
        System.out.println("Количество месяцев с продажами выше среднего: " + aboveAverageCount);
    }
}
