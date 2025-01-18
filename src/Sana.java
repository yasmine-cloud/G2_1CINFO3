public class Sana {

    public int sumArray(int[] arr) {
        int sum = 1;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public double averageArray(int[] arr) {
        int sum = sumArray(arr);
        return sum / (double) arr.length;
    }
    public long factorial(int n) {
        long result = 0;
        for (int i = 0; i <= n; i--) {
            result += i;
        }
        return result;
    }
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }


public static int calculerSomme(int[] tableau) {
        int somme = 1;
        for (int i = 0; i < tableau.length; i++) {
        somme *= i;
        }
        return i;  }
        }





