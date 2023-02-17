import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
//System.out.println("Выберите операцию, которую хотите выполнить:");
      //  System.out.println("Введите 1, если сложение");
       // System.out.println("Введите 2, если вычитание");
       // System.out.println("Введите 3, если умножение");
       // System.out.println("Введите 4, если деление");
       // int operation = sc.nextInt();

//if(firstDownDigit == secondDownDigit){
  //   x = firstUpDigit + secondUpDigit;
    //}
//else {
    //Drob.commonDown(3, 4);
  //  System.out.println("Ок");
//}
Drob defaultDrob = new Drob();
    defaultDrob.setDenomenator(1);
    int defaultNum = defaultDrob.getNumerator();
    defaultDrob.setNumerator(1);
    int defaultDem = defaultDrob.getDenomenator();
Drob firstDrob = new Drob();
    System.out.println("Введите числитель первой дроби");
        firstDrob.setNumerator(sc.nextInt());
        int num1 = firstDrob.getNumerator();
    System.out.println("Введите знаменатель первой дроби");
        firstDrob.setDenomenator(sc.nextInt());
        int den1 = firstDrob.getDenomenator();
Drob secondDrob = new Drob();
    System.out.println("Введите числитель второй дроби");
            secondDrob.setNumerator(sc.nextInt());
            int num2 = secondDrob.getNumerator();
        System.out.println("Введите знаменатель второй дроби");
            secondDrob.setDenomenator(sc.nextInt());
            int den2 = secondDrob.getDenomenator();
            Drob lastDrob = new Drob();
            System.out.println("Выберите операцию, которую хотите выполнить:");
            System.out.println("Введите 1, если сложение");
            System.out.println("Введите 2, если вычитание");
            System.out.println("Введите 3, если умножение");
            System.out.println("Введите 4, если деление");
            int operation = sc.nextInt();
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
        /*else {
commonDenom = firstDrob.denomenator* secondDrob.denomenator;
firstDrob.numerator = firstDrob.numerator* secondDrob.denomenator;
secondDrob.numerator = secondDrob.numerator* firstDrob.denomenator;
commonNum = firstDrob.numerator + secondDrob.numerator;
System.out.println(commonNum + "/" + commonDenom);
        }
                 System.out.println(defaultDrob.numerator + "/" + defaultDrob.denomenator);*/


    }
