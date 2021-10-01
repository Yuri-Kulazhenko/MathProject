package logic;

public class MathHomeWork {
    public static void main(String[] args) {
//1
        int m = 7;
        int d = 8;
        int f = 12;
        System.out.println("1. В ведре осталось " + ((m + d) - f) + " литра воды");
//2
        int n = 4;
        int p = 5;
        System.out.println("2. Девочки прочитали вместе " + (n + p) + " книг.");
//3
        int g = 6;
        int h = 7;
        System.out.println("3. На обоих ветках всего " + (g + h) + " яблок");
        //4
        byte j = 2;
        byte k = 1;
        short l = 3;
        System.out.println("4. Всего на подоконниках стояло " + (j + k + l) + " цветков");
        //7-8-9-10
        int a = -24;
        int b = 4;
        int c = 22;
        if (a >= 0) {
            System.out.println("Число А является положительным");
        } else {
            System.out.println("Число А является отрицательным");
        }
        //8-9
        if (a%2==1){
            System.out.println("Число А нечетное");
        }else {
            System.out.println("Число А четное, Истину говорю вам");
        }
        if (((a>b)&&(b>c))||((a<b)&&(b<c))) {
            System.out.println("Число В находится между числами А и С");
        }else {
            System.out.println("Число В не находится между числами А и С");
        }
        f=17;
        g =(f==12)? 23:13;
        System.out.println(g);
        System.out.println("sum is"+12+3);
    }
}