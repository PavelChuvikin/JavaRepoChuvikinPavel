public class homework1 {

    public static void main(String[] args){
        //Проверяем работу метода computation (задание1)
        System.out.println(computation(2, 3, 8, 15));
        //Проверяем работу метода SumCheck (задание2)
        System.out.println(sumCheck( 2, 20));
        //Проверяем работу метода positiveOrNegative (задание3)
        System.out.println(positiveOrNegative(5));
        //Проверяем работу метода frendlyMethod (задание4)
        System.out.println(frendlyMethod("Павел"));
        //Проверяем работу метода leapYear (задание5)
        System.out.print(leapYear(1988));
            }
    //метод, вычисляющий a * (b + (c / d)) (задание1)
    public static double computation(int a, int b, int c, int d){
        double n =  a;
        double e =  b;
        double f =  c;
        double g =  d;
        double result = n * (e + (f / g));
        return result;
    }
    //метод, проверяющий что сумма "х" и "у" в пределах от 10 до 20(включительно) (задание2)
    public static boolean sumCheck (int x, int y){
        boolean result = false;
        if(x+y<=20 && x+y>=10)
        {
            result = true;
        }
        return result;
    }
    //метод, проверяющий положительное ли число передали, или отрицательное (задание3)
    public static String positiveOrNegative(int x){
        String result;
        if(x>=0)
            result = "positive";
        else
            result = "negative";
        return result;
    }
    //метод, возвращающий "Привет, name!" (задание4)
    public static String frendlyMethod(String name){
        String frendlyPower = "Привет, " + name +"!";
        return frendlyPower;
    }
    //метод, проверяющий високосный ли год (задание5)
    public static String leapYear(int year){
        String checkYear = "Не високосный";
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        checkYear = "Високосный";
        return checkYear;
    }
    }
