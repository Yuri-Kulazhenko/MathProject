package logic;
//5
public class MathHomeWork1 {
    public static void main(String[] args) {
        double aHigh = 10;
        double aMid = 14;
        double aLow = 2;
        double bHigh = 8;
        double bMid = 12;
        double bLow = 3;
        double cHigh = 11;
        double cMid = 11;
        double cLow = 4;
        double sumX = 75;
        double sumA = 26;
        double sumB = 23;
        double sumC = 26;
        System.out.println(" На параллели всего "+(aHigh+bHigh+cHigh)+" отличников, "+(aMid +bMid +cMid )+" хорошистов, "+(aLow+bLow+cLow)+" троечников.");
        System.out.println(" В 1-А классе "+((aHigh/sumA)*100)+"% отличников, "+((aMid/sumA)*100)+"% хорошистов, "+((aLow/sumA)*100)+"% троечников.");
        System.out.println(" В 1-Б классе "+((bHigh/sumB)*100)+"% отличников, "+((bMid/sumB)*100)+"% хорошистов, "+((bLow/sumB)*100)+"% троечников.");
        System.out.println(" В 1-В классе "+((cHigh/sumC)*100)+"% отличников, "+((cMid/sumC)*100)+"% хорошистов, "+((cLow/sumC)*100)+"% троечников.");
        System.out.println(" В параллели "+(((aHigh+bHigh+cHigh)/sumX)*100)+"% отличников, "+(((aMid +bMid +cMid )/sumX)*100)+"% хорошистов, "+(((aLow+bLow+cLow)/sumX)*100)+"% троечников.");
//6
        double tenge = 1;
        double krona = 3.5*tenge;
        double grivna = 0.14*krona;
        double big = 15*tenge;
        double little = 13*tenge;

        if (big+little>10*tenge+5*tenge+2*krona+1*grivna){
            System.out.println("Школьнику не хватит денег на покупку");
        }else {
            System.out.println("Школдьнику хватит денег на покупку");
        }
    }
}
