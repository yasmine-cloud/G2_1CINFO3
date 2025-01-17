public class Arij_jebebli {
    
        public static int findMax(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty.");
            }
    
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
    
        public static int[] concatenateArrays(int[] array1, int[] array2) {
            if (array1 == null || array2 == null) {
                throw new IllegalArgumentException("Arrays cannot be null.");
            }
    
            int[] result = new int[array1.length + array2.length];
            System.arraycopy(array1, 0, result, 0, array1.length);
            System.arraycopy(array2, 0, result, array1.length, array2.length);
    
            return result;
        }
    
        }
