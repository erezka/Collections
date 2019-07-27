package TaskCollections.Services;

public class Demo {
    public static void go() {
        String text = "народ Хоббиты — скромный народ, но очень древний народ, раньше более многочисленный народ раньше, чем Хоббиты теперь";
        WorkingWithText testWorkingWithText = new WorkingWithText();
        System.out.println("Получившаяся коллекция типа (слово - количество повторений в тексте): ");
        System.out.println(testWorkingWithText.stringToMapAndCountWordRepeats(text));
        System.out.print("Уникальные слова в тексте: ");
        System.out.println(testWorkingWithText.uniqueWords(testWorkingWithText.getTextToMap()));
        System.out.println("Сортируем коллекцию по длине слов, результат: ");
        System.out.println(testWorkingWithText.SortingByWordLength(testWorkingWithText.getTextToMap()));
        System.out.println("Сортируем коллекцию по алфавиту, результат: ");
        System.out.println(testWorkingWithText.SortingByAlghabet(testWorkingWithText.getTextToMap()));
    }
}
