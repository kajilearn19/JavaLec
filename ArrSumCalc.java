public class ArrSumCal {

    // Recursive method
    public static int calSumRec(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + calSumRec(arr, index + 1);
    }

    // Iterative method
    public static int calSumIterative(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {   
            sum = sum + arr[i];
        }
        return sum;   
    }

    public static void main(String[] args) {    

        int[] arr = {1, 2, 3, 4, 5};

        // Recursive execution time
        long recursiveStartTime = System.nanoTime();   
        int recursiveSum = calSumRec(arr, 0);
        long recursiveEndTime = System.nanoTime();
        long recursiveExecutionTime = recursiveEndTime - recursiveStartTime;
        System.out.println("Recursive Sum: " + recursiveSum);
        System.out.println("Recursive Execution Time (ns): " + recursiveExecutionTime);

        // Iterative execution time
        long iterativeStartTime = System.nanoTime();
        int iterativeSum = calSumIterative(arr);
        long iterativeEndTime = System.nanoTime();
        long iterativeExecutionTime = iterativeEndTime - iterativeStartTime;
        System.out.println("Iterative Sum: " + iterativeSum);
        System.out.println("Iterative Execution Time (ns): " + iterativeExecutionTime);
    }
}
