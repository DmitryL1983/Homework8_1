public class Main {
    public static void main(String[] args) {
        int[] weights = new int[]{90, 91, 93, 92, 85, 87, 89, 0, 0, 0, 0}; //массив из 12 элементов
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        // задача 1
        // Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        int[] triple = new int[3]; //объявление массива из 3х элементов, заполненного нулями
        triple[0] = 1; // присвоение ячейкам значений
        triple[1] = 2;
        triple[2] = 3;
        //System.out.println(triple[0]); // проверка, вывод значений ячеек в консоль
        // System.out.println(triple[1]);
        //System.out.println(triple[2]);

        // Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        double[] fractions = {1.57, 7.654, 9.986};
        //System.out.println(fractions[0]); // проверка, вывод значений ячеек в консоль
        //System.out.println(fractions[1]);
        //System.out.println(fractions[2]);

        //Произвольный массив
        char[] empty = new char[100];

        // задача 2
        /* Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        начиная с первого элемента, через запятую. Запятая между последним элементом одного массива
        и первым элементом следующего не нужна.
        */
        System.out.print(triple[0] + ",");
        System.out.print(triple[1] + ",");
        System.out.println(triple[2]);

        System.out.print(fractions[0] + ",");
        System.out.print(fractions[1] + ",");
        System.out.println(fractions[2]);

        for (int i = 0; i < empty.length; i++) { // цикл для вывода в консоль значений массива
            if (i < empty.length - 1) {
                System.out.print(empty[i] + ",");
            } else {
                System.out.println(empty[i]); // печать последнего значения массива без знака ","
            }
        }
        // задача 3
        /*распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего

         */
        System.out.print(triple[2] + ",");
        System.out.print(triple[1] + ",");
        System.out.println(triple[0]);

        System.out.print(fractions[2] + ",");
        System.out.print(fractions[1] + ",");
        System.out.println(fractions[0]);

        for (int i = empty.length - 1; i >= 0; i--) { // цикл для вывода в консоль значений массива в обратном порядке
            if (i > 0) {
                System.out.print(empty[i] + ",");
            } else {
                System.out.println(empty[i]); // печать последнего значения массива без знака ","
            }
            }
        // Задача 4
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1)
        for (int i =0; i < triple.length; i++) {
            if (triple[i] % 2 != 0) {
                triple[i] = triple[i] + 1;
            }
            if (triple[i] < triple.length) {
                System.out.print(triple[i] + ",");
            } else {
                System.out.print(triple[i]); // печать последнего значения массива без знака ","
            }
        }
        }
    }