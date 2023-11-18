import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//Сформируйте массив из 10 элементов, заполнив его целыми случайными числами от -10 до 10. Определите среднее
//арифметическое элементов массива. Сформируйте новый массив, переписав в него элементы исходного массива, меньшие среднего

public class Main {
    public static void main(String[] args) {
        int size = 10;
        int[] numbers = new int[size];
        System.out.print("Array:\t");
        for(int i = 0; i < size; i++){
            numbers[i] = ThreadLocalRandom.current().nextInt(-10, 10);
            System.out.print(numbers[i] + "\t");
        }
        int sum = Arrays.stream(numbers).sum();
        System.out.println("\nSum = " + sum);
        double average = (double) sum / size;
        System.out.println("Average = " + average);
        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            if(numbers[i] >= average) break;
            list.add(numbers[i]);
        }
        System.out.print("New array:\t");
        for (int item:list) System.out.print(item + "\t");
    }
}