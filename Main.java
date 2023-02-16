import java.util.Arrays;
import java.util.Scanner;
public class Main
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int number = input.nextInt();
            int[] array = new int[number];
            for (int i = 0; i < array.length; i++) {
                System.out.printf("Введите %d элемент: ", i + 1);
                array[i] = input.nextInt();
                System.out.println();
            }
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
}
