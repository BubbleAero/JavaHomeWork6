package ru.netology.stats;

public class Main {
    public static void main(String[] args) {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int sumOfSales = service.calculateSumOfAllSales(sales);
        System.out.println("Сумма продаж: " + sumOfSales);

        int averageSales = service.calculateAverageSales(sales);
        System.out.println("Средняя сумма продаж: " + averageSales);

        int maxSalesMonth = service.calculateMaximumSales(sales);
        System.out.println("Месяц с максимальными продажами: " + maxSalesMonth);

        int minSalesMonth = service.calculateMinSales(sales);
        System.out.println("Месяц с минимальными продажами: " + minSalesMonth);

        int belowAverageCount = service.countBelowAverageSales(sales);
        System.out.println("Количество месяцев с родажами ниже среднего: " + belowAverageCount);

        int aboveAverageCount = service.countAboveAverageSales(sales);
        System.out.println("Количество месяцев с продажами выше среднего: " + aboveAverageCount);
    }
}
