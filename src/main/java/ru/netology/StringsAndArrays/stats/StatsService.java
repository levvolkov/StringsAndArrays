package ru.netology.StringsAndArrays.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSumSales(long[] sales) {
        int averageSum = 0;
        for (long ignored : sales) {
            averageSum = (sumSales(sales) / 12);
        }
        return averageSum;
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

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowTheAverageSales(long[] sales) {
        int month = 0;
        int average = averageSumSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public int aboveAverageSales(long[] sales) {
        int month = 0;
        int average = averageSumSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }
}


