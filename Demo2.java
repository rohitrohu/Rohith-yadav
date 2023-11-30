package sum;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        // A. Shuffle Array
		        int[] array = {1, 2, 3, 4, 5, 6, 7};
		        shuffleArray(array);
		        System.out.println("Shuffled Array: " + Arrays.toString(array));

		        // B. Convert Roman Number to Integer
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a Roman Number: ");
		        String romanNumeral = scanner.nextLine().toUpperCase();
		        int integerEquivalent = convertRomanToInteger(romanNumeral);
		        System.out.println("Integer Equivalent: " + integerEquivalent);

		        // C. Check if input is pangram
		        System.out.print("Enter a sentence: ");
		        String inputSentence = scanner.nextLine().toLowerCase();
		        boolean isPangram = checkPangram(inputSentence);
		        System.out.println("Is Pangram? " + isPangram);
		        
		 }
		    }

		    // A. Shuffle Array
		    private static void shuffleArray(int[] array) {
		        Random rand = new Random();
		        for (int i = array.length - 1; i > 0; i--) {
		            int index = rand.nextInt(i + 1);
		            // Swap elements
		            int temp = array[index];
		            array[index] = array[i];
		            array[i] = temp;
		        }
		    }

		    // B. Convert Roman Number to Integer
		    private static int convertRomanToInteger(String s) {
		        Map<Character, Integer> romanValues = new HashMap<>();
		        romanValues.put('I', 1);
		        romanValues.put('V', 5);
		        romanValues.put('X', 10);
		        romanValues.put('L', 50);
		        romanValues.put('C', 100);
		        romanValues.put('D', 500);
		        romanValues.put('M', 1000);

		        int result = 0;
		        int prevValue = 0;

		        for (int i = s.length() - 1; i >= 0; i--) {
		            int curValue = romanValues.get(s.charAt(i));
		            if (curValue < prevValue) {
		                result -= curValue;
		            } else {
		                result += curValue;
		            }
		            prevValue = curValue;
		        }

		        return result;
		    }

		    // C. Check if input is pangram
		    private static boolean checkPangram(String sentence) {
		        boolean[] alphabetPresent = new boolean[26];
		        int index;

		        for (int i = 0; i < sentence.length(); i++) {
		            char ch = sentence.charAt(i);
		            if ('a' <= ch && ch <= 'z') {
		                index = ch - 'a';
		            } else if ('A' <= ch && ch <= 'Z') {
		                index = ch - 'A';
		            } else {
		                // Ignore characters other than alphabets
		                continue;
		            }
		            alphabetPresent[index] = true;
		        }

		        for (boolean value : alphabetPresent) {
		            if (!value) {
		                return false;
		            }
		        }

		        return true;
		    }
		

	}

