public class tasnimamd {
        public int sumArray(int[] arr) {
            int sum = 0;
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
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
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
        public boolean isEven(int n) {
            return n % 2 == 0;
        }
        public boolean isPalindrome(String str) {
            String reversed = reverseString(str);
            return str.equals(reversed);
        }
        public double power(int base, int exponent) {
            return Math.pow(base, exponent);
        }
                                        
            public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

    
}