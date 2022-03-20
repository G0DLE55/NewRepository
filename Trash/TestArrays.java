import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 4, 6, 5};
        System.out.println("Input array: \t\t\t\t" + Arrays.toString(numbers));

        /* Сортировка по возрастанию */
        Arrays.sort(numbers);
        System.out.println("After Arrays.sort array: \t" + Arrays.toString(numbers));

        /* Ищет индекс элемента в отсортированном массиве, используя алгоритм двоичног опоиска */
        System.out.println("After Arrays.binarySearch(3) array: \t" + Arrays.binarySearch(numbers, 3));

        /* Сравнение массивов сначала по ссылкам, далее по типам, далее по содержимому,
        с выводом значения разницы между первым и вторым массивами */
        System.out.println("After Arrays.compare(1, 0, 3, 4, 6, 5) array: \t\t" + Arrays.compare(numbers, new int[] {1, 0, 3, 4, 6, 5}));

        /* Возвращает копию массива заданной длины, не ссылаясь на предыдущий */
        System.out.println("After Arrays.copyOf array: \t" + Arrays.toString(Arrays.copyOf(numbers, 4)));

        /* Сравнение массивов */
        System.out.println("After Arrays.equals {1, 0, 3, 4, 6, 5} array: \t" + Arrays.equals(numbers, new int[] {1, 0, 3, 4, 6, 5}));

        /* Заполняет массив указанным значением */
        Arrays.fill(numbers, 1);
        System.out.println("After Arrays.fill(1) array: \t" + Arrays.toString(numbers));

        /* Возвращает хеш-код массива */
        System.out.println("After Arrays.hashCode array: " + Arrays.hashCode(numbers));

        /* Возвращает индекс первого расхождения в массивах */
        System.out.println("After Arrays.equals {1, 0, 3, 4, 6, 5} array: \t" + Arrays.mismatch(numbers, new int[] {1, 0, 3, 4, 6, 5}));

        /* Меняет элементы массива согласно иснтрукции */
        Arrays.setAll(numbers, i -> (i * 2));
        System.out.println("After Arrays.setAll array: \t" + Arrays.toString(numbers));

        /* Разделяет элементы массива на отдельные элементы */
        System.out.println("After Arrays.spliterator array: \t" + Arrays.spliterator(numbers));

        /* Преобразует массив в строку */
        System.out.println("After Arrays.toString array: \t" + Arrays.toString(numbers));

        /* Преобразует массив в лист */
        //Arrays.asList();

        /* Аналог ToString для многомерных массивов */
        //Arrays.deepToString(numbers);

        //float pi1 = 3_.1415F;      // Invalid; cannot put underscores adjacent to a decimal point
        //float pi2 = 3._1415F;      // Invalid; cannot put underscores adjacent to a decimal point
        //long socialSecurityNumber1 = 999_99_9999_L;         // Invalid; cannot put underscores prior to an L suffix

        /* Символ нижнего подчеркивания используется для создания удобочитаемого кода с числами и используется только внутри чисел, не примыкая к спец символам */
        //int x1 = _52;              // This is an identifier, not a numeric literal
        int x2 = 5_2;              // OK (decimal literal)
        //int x3 = 52_;              // Invalid; cannot put underscores at the end of a literal
        int x4 = 5_______2;        // OK (decimal literal)

        //int x5 = 0_x52;            // Invalid; cannot put underscores in the 0x radix prefix
        //int x6 = 0x_52;            // Invalid; cannot put underscores at the beginning of a number
        int x7 = 0x5_2;            // OK (hexadecimal literal)
        //int x8 = 0x52_;            // Invalid; cannot put underscores at the end of a number

        int x9 = 0_52;             // OK (octal literal)
        int x10 = 05_2;            // OK (octal literal)
        //int x11 = 052_;            // Invalid; cannot put underscores at the end of a number
    }
}
