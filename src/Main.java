import java.util.Scanner;

public class Main {

    public static int binarySearch(int[] a, int k) {
        int l = 1; //левая граница поиска нужного числа
        int r = a.length; //правая граница поиска нужного числа
        int m; //номер индекса согласно алгоритма "разделяй и властвуй"
        while (l <= r) {
            m = l + (r - l) / 2;
            if (m < 1) m = 0;
            if (a[m - 1] == k) {
                return m;
            } else if (a[m - 1] > k) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //чтение, инициализация переменных и массивов
        Scanner scanner = new Scanner(System.in).useDelimiter("\\W");
        int n = scanner.nextInt(); //количество элементов первого массива (упорядоченного)

        int[] firstArray = new int[n]; //инициализация первого массива
        //заполнение массива
        for (int i = 0; i < n; i++) {
            firstArray[i] = scanner.nextInt();
        }
        int m = scanner.nextInt(); //количество элементов второго массива
        int[] secondArray = new int[m]; //инициализация первого массива
        //заполнение массива
        for (int i = 0; i < m; i++) {
            secondArray[i] = scanner.nextInt();
        }

        //тело программы

        for (int i : secondArray) {
            System.out.print(binarySearch(firstArray, i) + " ");
        }

    }
}
