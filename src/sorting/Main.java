package sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(Arrays.asList(args).contains("-sortIntegers")) {

            ArrayList<Integer> intList = new ArrayList<>();
            int number;
            while (scanner.hasNextInt()) {
                number = scanner.nextInt();
                intList.add(number);
            }
            int totalIntegers = intList.size();
            Collections.sort(intList);//sorts Arraylist in ascending order
            System.out.println("Total numbers: " + totalIntegers);
            System.out.print("Sorted data: ");
            for (int num : intList) {
                System.out.print(num + " ");
            }
        }else if(args[0].equals("-dataType")) {
            String type = args[1];
            switch (type) {
                case "long" -> {
                    ArrayList<Integer> numList = new ArrayList<>();
                    int number;
                    while (scanner.hasNextInt()) {
                        number = scanner.nextInt();
                        numList.add(number);
                    }
                    int maxValue = Collections.max(numList);
                    int numFrequency = Collections.frequency(numList, maxValue);
                    double percentage =(double)numFrequency/numList.size()*100;
                    System.out.println("Total numbers: " + numList.size() + ".");//Number of elements in the list(numbers)
                    System.out.printf("The greatest number: %d (%d times(s), %.0f%%."
                            , maxValue, numFrequency, percentage);//maximum value in the list (number)
                }
                case "line" -> {
                    ArrayList<String> lineList = new ArrayList<>();
                    while(scanner.hasNextLine()){
                        lineList.add(scanner.nextLine().trim());
                    }
                    String longestLine = lineList
                            .stream()
                            .max(Comparator.comparingInt(String::length))
                            .get();
                    int totalLines = lineList.size();
                    int lineFrequency = Collections.frequency(lineList, longestLine);
                    double percentage = (double)lineFrequency/totalLines*100;
                    System.out.printf("Total lines: %d.\nThe longest line:\n%s\n(%d times(s), %.0f%%)."
                            ,totalLines, longestLine, lineFrequency, percentage);
                }
                case "word" -> {
                    ArrayList<String> wordList = new ArrayList<>();
                    String word;
                    while(scanner.hasNext()){
                        word = scanner.next();
                        wordList.add(word);
                    }
                    //System.out.println(wordList);
                    int totalWords = wordList.size();
                    String longestWord = wordList
                            .stream()
                            .max(Comparator.comparingInt(String::length))
                            .get();

                    int wordFrequency = Collections.frequency(wordList, longestWord);
                    double percentage = (double)wordFrequency/totalWords*100;
                    System.out.printf("Total words: %d.\nThe longest word: %s (%d time(s), %.0f%%)."
                            , totalWords, longestWord, wordFrequency, percentage);
                }
                default -> System.out.println("Incorrect input");
            }
        } else{
            //Assumed to be of word type
            ArrayList<String> wordList = new ArrayList<>();
            String word;
            while(scanner.hasNext()){
                word = scanner.next();
                wordList.add(word);
            }
            int totalWords = wordList.size();
            String longestWord = Collections.max(wordList);
            int wordFrequency = Collections.frequency(wordList, longestWord);
            double percentage = (double)wordFrequency/totalWords*100;
            System.out.printf("Total words: %d.\nThe longest word: %s (%d time(s), %f%%)."
                    , totalWords, longestWord, wordFrequency, percentage);
        }

    }

    /*public static void word(){

    }

    public static void longer(){

    }

    public static void line(){

    }*/
}
