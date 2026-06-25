public class FindMinimum {
    public static void main(String[] args) {
        int arr[] = {8, 3, 12, 1, 5};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum value = " + min);
    }
}

----------------------------------------------------

  public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

------------------------------------------------------

  public class FrequencyCount {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 1, 2};
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}


---------------------------------------------------------------------

  public class MergeArrays {
    public static void main(String[] args) {
        int a[] = {1, 3, 5};
        int b[] = {2, 4, 6};

        int merged[] = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        while (i < a.length)
            merged[k++] = a[i++];

        while (j < b.length)
            merged[k++] = b[j++];

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}

-=-----------------------------------------

  public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}

------------------------------------------------
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}


https://chatgpt.com/c/6a3c7671-4e40-83ee-998d-9117fffd38f8
  
  
  

  
  
