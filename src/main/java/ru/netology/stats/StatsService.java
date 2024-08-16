package ru.netology.stats;

public class StatsService {

    public long calculateMinSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long calculateSumOfAllSales(long[] sales) {
        long allSales = 0;

        for (long sale : sales) {
            allSales += sale;
        }

        return allSales;
    }

    public long calculateAverageSales(long[] sales) {
        return calculateSumOfAllSales(sales) / sales.length;
    }

    public long calculateMaximumSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long countBelowAverageSales(long[] sales) {
        long averageSales = calculateAverageSales(sales);
        long count = 0;

        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public long countAboveAverageSales(long[] sales) {
        long averageSales = calculateAverageSales(sales);
        long count = 0;

        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}
