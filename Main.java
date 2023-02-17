import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Drob defaultDrob = new Drob();
    defaultDrob.setDenomenator(1);
    int defaultNum = defaultDrob.getNumerator();
    defaultDrob.setNumerator(1);
    int defaultDem = defaultDrob.getDenomenator();
Drob firstDrob = new Drob();
    System.out.println("Введите числитель первой дроби");
        try{
            firstDrob.setNumerator(sc.nextInt());
        }
        catch (InputMismatchException e){
            System.out.println("Введите число");
            System.exit (1);
        }
        int num1 = firstDrob.getNumerator();
    System.out.println("Введите знаменатель первой дроби");
        try {
            firstDrob.setDenomenator(sc.nextInt());
        }
        catch (InputMismatchException e)
        {
            System.out.println("Введите число");
            System.exit (1);
        }
        int den1 = firstDrob.getDenomenator();
Drob secondDrob = new Drob();
    System.out.println("Введите числитель второй дроби");
           try {
               secondDrob.setNumerator(sc.nextInt());
           }
           catch (InputMismatchException e)
           {
               System.out.println("Введите число");
               System.exit (1);
           }
            int num2 = secondDrob.getNumerator();
        System.out.println("Введите знаменатель второй дроби");
            try {
                secondDrob.setDenomenator(sc.nextInt());
            }
            catch (InputMismatchException e)
            {
                System.out.println("Введите число");
                System.exit (1);
            }
            int den2 = secondDrob.getDenomenator();
            Drob lastDrob = new Drob();
            System.out.println("Выберите операцию, которую хотите выполнить:");
            System.out.println("Введите 1, если сложение");
            System.out.println("Введите 2, если вычитание");
            System.out.println("Введите 3, если умножение");
            System.out.println("Введите 4, если деление");
            int operation = 0;
            try {
                 operation = sc.nextInt();
            }catch (InputMismatchException e)
            {
                System.out.println("Введите число");
            }
        if(operation == 1){
        if(den1 == den2) {
            lastDrob.setTheSameDenom(den2);
            lastDrob.setTheSameNumPLus(num1, num2);
            lastDrob.print();
        }
          else{
        lastDrob.setCommonDenom(den1, den2);
        lastDrob.setCommonNumPlus(num1, num2, den1, den2);
        lastDrob.print();
        }}
        else if(operation == 2){
            if(den1 == den2){
                lastDrob.setTheSameDenom(den2);
                lastDrob.setTheSameNumMinus(num1, num2);
                lastDrob.print();}
                else{
                lastDrob.setCommonDenom(den1, den2);
                lastDrob.setCommonNumMinus(num1, num2, den1, den2);
                lastDrob.print();
            }
            }
        else if(operation == 3){
            lastDrob.setMultiplying(den1, den2, num1, num2);
            lastDrob.print();
        }
        else if(operation == 4){
            lastDrob.setDivision(den1, den2, num1, num2);
            lastDrob.print();
        }
        sc.close();
        }
    }
