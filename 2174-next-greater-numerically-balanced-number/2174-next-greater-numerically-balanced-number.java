import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
   
    private Set<Integer> balancedNumbers = new HashSet<>();
  
    private final int[] possibleDigits = {1, 2, 3, 4, 5, 6, 7};

   
    

    private void generateBalancedNumbers(int startDigitIndex, List<Integer> currentDigits, int currentLength) {
     
        if (currentLength > 0) {
            int[] digits = currentDigits.stream().mapToInt(i -> i).toArray();
            generatePermutations(digits, 0);
        }
        
        if (currentLength >= 7) {
            return;
        }

        for (int i = startDigitIndex; i < possibleDigits.length; i++) {
            int digit = possibleDigits[i];
            
           
            if (currentLength + digit <= 7) {
                // Add 'digit' number of 'digit's to the list
                for (int j = 0; j < digit; j++) {
                    currentDigits.add(digit);
                }
                
              
                generateBalancedNumbers(i + 1, currentDigits, currentLength + digit);
               
                for (int j = 0; j < digit; j++) {
                    currentDigits.remove(currentDigits.size() - 1);
                }
            }
        }
    }

    private void generatePermutations(int[] digits, int index) {
        if (index == digits.length) {
            long number = 0;
            for (int d : digits) {
                number = number * 10 + d;
            }
            if (number <= Integer.MAX_VALUE) {
                balancedNumbers.add((int) number);
            }
            return;
        }

        Set<Integer> used = new HashSet<>();
        for (int i = index; i < digits.length; i++) {
         
            if (used.contains(digits[i])) continue;
            used.add(digits[i]);

            swap(digits, index, i);
            generatePermutations(digits, index + 1);
           
            swap(digits, index, i);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private List<Integer> sortedBalancedNumbers;
    private static Solution instance;

    private static void initialize() {
        if (instance == null) {
            instance = new Solution();
            instance.generateBalancedNumbers(0, new ArrayList<>(), 0);
            
            instance.sortedBalancedNumbers = new ArrayList<>(instance.balancedNumbers);
            Collections.sort(instance.sortedBalancedNumbers);
        }
    }

    public int nextBeautifulNumber(int n) {
       
        initialize();

        for (int num : instance.sortedBalancedNumbers) {
            if (num > n) {
                return num;
            }
        }
       
        return -1;
    }
}