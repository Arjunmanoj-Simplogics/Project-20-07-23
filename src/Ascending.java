public class Ascending {

    private static Integer arr[] = {10, 6, 99, 35, 43, 56, 77, 25, 33, 22};

    public void Ascending() {

    }

    public static void sort() {
        Integer i, j, temp, n, index;
        n = arr.length;
        for (i = 0; i < n; i++) {
            index = i;

            for (j = i + 1; j < n; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSecond Highest No:" + arr[n - 2]);
    }

    public static void main(String[] args) {
        sort();

    }

}