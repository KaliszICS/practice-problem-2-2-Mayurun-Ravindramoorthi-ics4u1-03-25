import java.sql.Array;
import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	
	 public static int[] compareSearch(int[] array, int number) {
        int[] loopCounts = new int[2]; 
        
        
        loopCounts[0] = sequentialSearch(array, number);
        
     
        loopCounts[1] = binarySearch(array, number);
        
        return loopCounts;
    }

    
    public static int sequentialSearch(int[] array, int number) {
        int loops = 0;
        for (int i = 0; i < array.length; i++) {
            loops++; 
            if (array[i] == number) {
                return loops;
            }
        }
        return loops; 
    }

  
    public static int binarySearch(int[] array, int number) {
        Arrays.sort(array); 
        int left = 0;
        int right = array.length - 1;
        int loops = 0;
        
        while (left <= right) {
            loops++; 
            int middle = left + (right - left) / 2;
            
          
            if (array[middle] == number) {
                return loops; 
            }
            
            
            if (array[middle] > number) {
                right = middle - 1;
            }
            
            else {
                left = middle + 1;
            }
        }
        return loops; 
    }
	public static int[] compareStringSearch(String[] array, String word) {
        int[] loopCounts = new int[2]; 
        
        
        loopCounts[0] = sequentialStringSearch(array, word);
        
        
        loopCounts[1] = binaryStringSearch(array, word);
        
        return loopCounts;
    }

    
    public static int sequentialStringSearch(String[] array, String word) {
        int loops = 0;
        for (int i = 0; i < array.length; i++) {
            loops++; 
            if (array[i].equals(word)) {
                return loops; 
            }
        }
        return loops; 
    }

    
    public static int binaryStringSearch(String[] array, String word) {
        Arrays.sort(array); 
        int left = 0;
        int right = array.length - 1;
        int loops = 0;
        
        while (left <= right) {
            loops++; 
            int middle = left + (right - left) / 2;
            
            
            int comparison = array[middle].compareTo(word);
            
           
            if (comparison == 0) {
                return loops; 
            }
            
          
            if (comparison > 0) {
                right = middle - 1;
            }
        
            else {
                left = middle + 1;
            }
        }
        return loops; 
    }
}
