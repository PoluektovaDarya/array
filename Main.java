import java.util.Scanner;

public class Main
{
        public static void main(String[] args) {
            Scanner out = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int number = out.nextInt();
            int[] array = new int[number];
            for (int i = 0; i < array.length; i++){
                System.out.printf("Введите %d элемент: ",i+1);
                array[i] = out.nextInt();
                System.out.println();
            }
            int m = 0;
            for (int i : array) {//перебор массива и дальнейший вывод его эллементов
                System.out.print(i + " ");
                m += i;//Сумма всех чисел
            }System.out.println();
            System.out.println("Среднее арифметическое значение: " + m/array.length);//Сумму элементов массива поделить на количество элементов и вывести

            int max = array[0];//Присвоение переменной max первого элемента массива
            for (int num : array) {//перебор массива
                if (num > max) {//если число > максимального, то в max записать это число
                    max = num;
                }
            }
            System.out.println("Максимальный элемент: " + max);
        }
    }
