package sharma.aditya.dp;

public class Fibonacci {

    public static void main(String[] args) {
        int series_length = 10;
        generateUsingLoop(series_length);
        generateUsingRecursion(series_length);
//        generateUsingDP(series_length);
    }

    private static void generateUsingRecursion(int seriesLength) {
        if(seriesLength == 1) return;
    }

    private static void generateUsingLoop(int seriesLength) {
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i = 0; i < seriesLength; i++){
            System.out.print(firstTerm+" "+secondTerm+" ");
            firstTerm = firstTerm + secondTerm;
            secondTerm = firstTerm + secondTerm;
        }
    }
}
