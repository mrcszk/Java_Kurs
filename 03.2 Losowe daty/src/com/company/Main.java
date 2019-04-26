package com.company;
import java.util.Random;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate date2;
        System.out.print("Podaj wybór: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        LocalDate currentDate = LocalDate.now();

        switch(option) {
            case 1:
                LocalDate date1 = loadUserDate();
                if(date1==null)
                    System.out.println("Podane błędne dane!");
                else{
                    System.out.println(date1);
                Period intervalPeriod1 = Period.between(date1, currentDate);
                System.out.println("Różnica czasu to: " + intervalPeriod1.getYears() + " lat " +
                        intervalPeriod1.getMonths() + " miesięcy " + intervalPeriod1.getDays() + " dni.");
                }
                break;
            case 2:
                date2 = loadRandomDate();
                System.out.println(date2);
                Period intervalPeriod2 = Period.between(date2, currentDate);
                System.out.println("Różnica czasu to: " + intervalPeriod2.getYears() + " lat " +
                        intervalPeriod2.getMonths() + " miesięcy " + intervalPeriod2.getDays() + " dni.");
                break;
            default:
                System.out.println("Nie ma takiej opcji!");
                break;
        }
        System.out.println("Dzisiejsza data to: " + currentDate);


    }

    private static LocalDate loadUserDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dzien: ");
        int day =  scanner.nextInt();
        System.out.print("Podaj miesiac: ");
        int month =  scanner.nextInt();
        System.out.print("Podaj rok: ");
        int year =  scanner.nextInt();
        if (0<day && day<32 && 0<month && month<13 && 0<year)
            return LocalDate.of(year, month, day);
        else
            return null;
    }
    private static int generateRandomNumber(int from, int to){
        Random random = new Random();
        return  random.nextInt(to-from+1)+from;
    }
    private static LocalDate loadRandomDate() {
        int day =  generateRandomNumber(1,28);
        int month =  generateRandomNumber(1,12);
        int year =  generateRandomNumber(1900,2015);
        return LocalDate.of(year, month, day);
    }
    }