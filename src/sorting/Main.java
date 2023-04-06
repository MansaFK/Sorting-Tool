package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        long max; //max value of all numbers
        int maxCount; //frequency of the max value
        ArrayList<Long> list = new ArrayList<>();
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            list.add(number);
        }
        Collections.sort(list);
        max = list.get(list.size()-1);
        maxCount = Collections.frequency(list, max);
        System.out.println("Total numbers: "+list.size()+".");
        System.out.println("The greatest number: "+ max+ " (" +maxCount+" time(s).");
    }
}
