public class Drob {
     private int numerator;
    private int denomenator;
    public void setDenomenator(int denomenator){
        if(denomenator == 0){
            System.out.println("Знаменатель не может равняться 0");
            System.exit (1);
        }
        else {
            this.denomenator = denomenator;
        }
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
public int getNumerator(){
        return numerator;
}
public int getDenomenator() {
        return denomenator;
    }
public void setTheSameNumPLus(int num1, int num2){
        this.numerator = num1 + num2;
}
public void setCommonNumPlus(int num1, int den1, int num2, int den2){
        this.numerator = num1*den2 + num2*den1;
}
    public void setCommonNumMinus(int num1, int den1, int num2, int den2){
        this.numerator = num1*den2 - num2*den1;
    }
public void print(){
        System.out.println(numerator + "/" + denomenator);
}
   public void setTheSameDenom(int denom){
        this.denomenator = denom;
   }
    public void setTheSameNumMinus(int num1, int num2){
        this.numerator = num1 - num2;
    }
    public void setCommonDenom(int denomenator1, int denomerator2 ){
        this.denomenator = denomenator1*denomerator2;

    }
    public void setMultiplying(int den1, int den2, int num1, int num2){
        this.denomenator = den1*den2;
        this.numerator = num1*num2;
    }
    public void setDivision(int den1, int den2, int num1, int num2){
        this.denomenator = den1*num2;
        this.numerator = num1*den2;
    }
}
