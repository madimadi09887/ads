public static boolean isPrime(int n) {
        if (n <= 1) {
        return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
        return false;
        }
        }
        return true;
        }
        int num = 17;
        if (isPrime(num)) {
        System.out.println(num + " is prime");
        } else {
        System.out.println(num + " is not prime");
        }