package Algorithms;

public class HashingAlgorithm {

    public static int hashFunction(String str, int tableSize) {
        int sum = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            sum += (ch - 'a' + 1);
        }

        return sum % tableSize;
    }

    public static void main(String[] args) {
        int tableSize = 7;

        String[] strings = {"ab", "cd", "efg"};

        for (String s : strings) {
            int index = hashFunction(s, tableSize);
            System.out.println(s + " -> index " + index);
        }
    }
}