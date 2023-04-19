// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное 
// и среднее арифметическое из этого списка.

package HomeworkJava3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        FillList(numbers);
        PrintList(numbers);
        int min_a = 0;
        int max_a = 0;
        float sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min_a) 
            min_a = numbers.get(i);
            if (numbers.get(i) > max_a) 
            max_a = numbers.get(i);
            sum = sum + numbers.get(i);            
        }
        float diff_ar = sum / numbers.size();
        System.out.println(" минимальное значение:" + min_a + ", \n максимальное значение:" + max_a + ", \n среднеарифметическое значение:" + diff_ar);
    }
    public static void FillList(List<Integer> list) {
        Random ran = new Random();
        int r = ran.nextInt(10)+10;
        for (int i = 0; i < r; i++) {
        int rand = ran.nextInt(200)-100;
        list.add(rand);
        }
    }
    public static void PrintList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }
}    

