package ru.netology.stats;

public class StatsService {

    public int calculateMinSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateSumOfAllSales(int[] sales) {
        int allSales = 0;

        for (int sale : sales) {
            allSales += sale;
        }

        return allSales;
    }

    public int calculateAverageSales(int[] sales) {
        return calculateSumOfAllSales(sales) / sales.length;
    }

    public int calculateMaximumSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int countBelowAverageSales(int[] sales) {
        int averageSales = calculateAverageSales(sales);
        int count = 0;

        for (int sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int countAboveAverageSales(int[] sales) {
        int averageSales = calculateAverageSales(sales);
        int count = 0;

        for (int sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}
