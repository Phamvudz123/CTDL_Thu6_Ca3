
public class Lab3_Task1_1 {

    public static class MyArray {
        private int[] array;

        public MyArray(int[] array) {
            this.array = array;
        }
      //Task1_1_1:
        public int iterativeLinearSearch(int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i;
                }
            }
            return -1;
        }
        
        //Task1_2_1:
        public int recursiveLinearSearch(int target) {
            
            return recursiveLinearSearchHelper(target, 0);
        }

        private int recursiveLinearSearchHelper(int target, int currentIndex) {
          
            if (currentIndex >= array.length) {
                return -1;
            }

          
            if (array[currentIndex] == target) {
                return currentIndex; 
            }

          
            return recursiveLinearSearchHelper(target, currentIndex + 1);
        }
    }
 
    
    

    public static void main(String[] args) {
        int[] array = { 12, 10, 9, 45, 2, 10, 10, 45 };
        MyArray myArray = new MyArray(array);
        int target1= 45;
        int target2 = 10;
        int target3 = 7;
        
        //test Task1_1_1:
        
        int result1Linear  = myArray.iterativeLinearSearch(target1);
        System.out.println("Index of " + target1 + ": " + result1Linear); 

       
        int result2Linear = myArray.iterativeLinearSearch(target2);
        System.out.println("Index of " + target2 + ": " + result2Linear); 

       
        int result3Linear = myArray.iterativeLinearSearch(target3);
        System.out.println("Index of " + target3 + ": " + result3Linear); 
        
        
       
        //test 1_2_1
       
        int result1Recursive = myArray.recursiveLinearSearch(target1);
        System.out.println("Index of " + target1 + ": " + result1Recursive ); 

        int result2Recursive = myArray.recursiveLinearSearch(target2);
        System.out.println("Index of " + target2 + ": " + result2Recursive ); 

     
        int result3Recursive = myArray.recursiveLinearSearch(target3);
        System.out.println("Index of " + target3 + ": " + result3Recursive ); 
    }
    }
    
   
    
       

