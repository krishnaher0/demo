public class Scientific_calculator {
    public static void main(String[] args) {
        Advancedcalculator a=new Advancedcalculator();
        System.out.println(a.multiply(12, 12));
        System.out.println(a.multiply(4.0, 6.0));
        System.out.println(a.multiply(11, 11, 11));
        System.out.println(a.multiply(10.0, 10.0, 10));
        
    }
    
}
class basiccalculator{
    double multiply(int a,int b){
        return a*b;
    }
    double multiply(double a,double b){
        return a*b;

    }
}
class Advancedcalculator extends basiccalculator{
    double multiply(int a,int b){
        return a*a;
    }
    double multiply(double a,double b){
        return a*a*a;
    }
    int multiply(int a,int b,int c){
        return a*b*c;
    }
    double multiply(double a,double b,double c){
        return a*b*c;
    }
}
