public class Main {
    public static void main(String[] args) {
        double[] arr = {1.0,2.0,3.0,4.0,5.0};
        runningAverage(arr);

    }
    public static void runningAverage(double[] arr) {
        for (double i = 0; i < arr.length + 1; i++) {
            double sum = i;
            for (double j = 0; j < i; j++) {
                sum += j;

            }
            double avg = sum / i;
            System.out.println(avg);
        }


    }


}
