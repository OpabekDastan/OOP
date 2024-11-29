package CHALLENGE;
import java.util.*;

public class DuplicateCounter extends Pair {
    public DuplicateCounter(int element, int cnt) {
        super(element, cnt);
    }

    public static List<Pair> calculateDuplicates(List<Integer> numbers) {
        Map<Pair, Integer> pairCountMap = new HashMap<>();
        
        // Подсчет количества каждого элемента через Pair
        for (Integer number : numbers) {
            Pair newPair = new Pair(number, 1);  // Создаем пару для проверки
            boolean found = false;
            
            // Проверяем, существует ли уже такая пара
            for (Pair pair : pairCountMap.keySet()) {
                if (pair.equals(newPair)) {  // Используем equals для сравнения
                    pairCountMap.put(pair, pairCountMap.get(pair) + 1);  // Увеличиваем счетчик
                    found = true;
                    break;
                }
            }

            if (!found) {
                pairCountMap.put(newPair, 1);  // Добавляем новую пару
            }
        }

        // Создание списка пар с обновлёнными значениями count
        List<Pair> result = new ArrayList<>();
        for (Map.Entry<Pair, Integer> entry : pairCountMap.entrySet()) {
            result.add(new Pair(entry.getKey().element, entry.getValue()));  // Формируем пары с их финальными count
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 9, 1, 2, 3, 9, 9, 2, 1);
        List<Pair> duplicates = calculateDuplicates(numbers);

        System.out.println(duplicates);  // Вывод списка пар
    }
}
