package com.company;

public class Main {

    public static void main(String[] args) {
	double deposit_telo = 10000;
	int percent_year = 12;
	int time = 6;
	double percent_month = percent_year / 12;
	double deposit_sum = deposit_telo + deposit_telo * percent_month * time / 100;
	System.out.println("Сумма по депозиту " + deposit_telo +" через " + time + " месяцев под "
			           + percent_year + " % годовых " + deposit_sum);
    }
}
