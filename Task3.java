// 3. Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.

package HomeworkJava3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        exerciseThree();
    }   
        
    private static void exerciseThree() {
        List<String> planetsNames = List.of("Mercury", "Venus", "Earth", "Mars", 
        "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto");
        Random random = new Random();
        List<String> listPlanet = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            listPlanet.add(planetsNames.get(random.nextInt(9)));
        }
        List<String> listWithoutDuplicates = listPlanet.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println(listWithoutDuplicates);
    }
} 

 

