package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int averageSale(int[] sales) {
        int PerMonth = 0;
        int sum = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            sum += sales[sale];

        }

        return sum / sales.length;
    }

    public int monthlySalesAmount(int[] sales) {
        int sum = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            sum += sales[sale];

        }

        return sum;
    }

    public int belowAverageSales(int[] sales) {
        int average = averageSale(sales); // средняя продажа
        int numberOfMonths = 0; // счетчик месяцев с продажей ниже среднего
        for (int sale : sales) {
            if (sale < average) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;


    }
    public int aboveAverageSales(int[] sales) {
        int average = averageSale(sales); // средняя продажа
        int numberOfMonths = 0; // счетчик месяцев с продажей ниже среднего
        for (int sale : sales) {
            if (sale > average) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;


    }
}