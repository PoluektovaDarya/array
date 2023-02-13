class formula {
    public static void main(String[] args) {
        int[] array = new int[] {5, 34, 6, 23, 63, 34, 43, 65, 12, 65};
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
