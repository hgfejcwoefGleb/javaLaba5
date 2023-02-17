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
            lastDrob.setTheSameNumPLus(firstDrob, secondDrob);
            lastDrob.print();
        }
          else{
        lastDrob.setCommonDenom(firstDrob, secondDrob);
        lastDrob.setCommonNumPlus(firstDrob, secondDrob);
        lastDrob.print();
        }}
        else if(operation == 2){
            if(den1 == den2){
                lastDrob.setTheSameDenom(den2);
                lastDrob.setTheSameNumMinus(firstDrob, secondDrob);
                lastDrob.print1();}
                else{
                lastDrob.setCommonDenom(firstDrob, secondDrob);
                lastDrob.setCommonNumMinus(firstDrob, secondDrob);
                lastDrob.print();
            }
            }
        else if(operation == 3){
            lastDrob.setMultiplying(firstDrob, secondDrob);
            lastDrob.print();
        }
        else if(operation == 4){
            lastDrob.setDivision(firstDrob, secondDrob);
            lastDrob.print();
        }
        else if(operation!=1&&operation!=2&&operation!=3&&operation!=4){
            System.out.println("Введите число от 1 до 4");
            System.exit (1);
        }
        sc.close();
        }
    }
