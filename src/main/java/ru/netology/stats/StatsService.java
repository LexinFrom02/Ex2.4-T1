package ru.netology.stats;

public class StatsService {
    int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int salesAmount() {
        int salesAmount = 0;
        for (int i = 0; i < salesByMonth.length; i++) {
            salesAmount += salesByMonth[i];
        }
        return salesAmount;
    }

    public int averageAmount() {
        int salesAmount = 0;
        for (int i = 0; i < salesByMonth.length; i++) {
            salesAmount += salesByMonth[i];
        }
        return salesAmount / 12;
    }

    public int maxSales() {
        int maxSalesMonth = 1;
        int base = salesByMonth[0];
        for (int i = 0; i < salesByMonth.length; i++)
            if (salesByMonth[i] >= base) {
                maxSalesMonth = i + 1;
                base = salesByMonth[i];
            }
        return maxSalesMonth;
    }

    public int leastSales() {
        int leastSalesMonth = 1;
        int base = salesByMonth[0];
        for (int i = 0; i < salesByMonth.length; i++)
            if (salesByMonth[i] <= base) {
                leastSalesMonth = i + 1;
                base = salesByMonth[i];
            }
        return leastSalesMonth;
    }

    public int monthsLessThanAverageSales() {
        int averageSales = averageAmount();
        int lessCounter = 0;
        for (int i = 0; i < salesByMonth.length; i++) {
            if (salesByMonth[i] < averageSales) {
                lessCounter++;
            }
        }
        return lessCounter;
    }

    public int monthsMoreThanAverageSales() {
        int averageSales = averageAmount();
        int moreCounter = 0;
        for (int i = 0; i < salesByMonth.length; i++) {
            if (salesByMonth[i] < averageSales) {
                moreCounter++;
            }
        }
        return moreCounter;
    }
}
