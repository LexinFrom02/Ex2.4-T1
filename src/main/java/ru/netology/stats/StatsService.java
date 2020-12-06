package ru.netology.stats;

public class StatsService {
//    int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int salesAmount(int[] salesByMonth) {
        int salesAmount = 0;
        for (int i = 0; i < salesByMonth.length; i++) {
            salesAmount += salesByMonth[i];
        }
        return salesAmount;
    }

    public int averageAmount(int[] salesByMonth) {
//        int salesAmount = 0;
//        for (int i = 0; i < salesByMonth.length; i++) {
//            salesAmount += salesByMonth[i];
//        }
        return salesAmount(salesByMonth) / 12;
    }

    public int maxSales(int[] salesByMonth) {
        int maxSalesMonth = 1;
        int base = salesByMonth[0];
        for (int i = 0; i < salesByMonth.length; i++)
            if (salesByMonth[i] >= base) {
                maxSalesMonth = i + 1;
                base = salesByMonth[i];
            }
        return maxSalesMonth;
    }

    public int leastSales(int[] salesByMonth) {
        int leastSalesMonth = 1;
        int base = salesByMonth[0];
        for (int i = 0; i < salesByMonth.length; i++)
            if (salesByMonth[i] <= base) {
                leastSalesMonth = i + 1;
                base = salesByMonth[i];
            }
        return leastSalesMonth;
    }

    public int monthsLessThanAverageSales(int[] salesByMonth) {
        int averageSales = averageAmount(salesByMonth);
        int lessCounter = 0;
        for (int i = 0; i < salesByMonth.length; i++) {
            if (salesByMonth[i] < averageSales) {
                lessCounter++;
            }
        }
        return lessCounter;
    }

    public int monthsMoreThanAverageSales(int[] salesByMonth) {
        int averageSales = averageAmount(salesByMonth);
        int moreCounter = 0;
        for (int i = 0; i < salesByMonth.length; i++) {
            if (salesByMonth[i] < averageSales) {
                moreCounter++;
            }
        }
        return moreCounter;
    }
}
