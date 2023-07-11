public static int factorial(int n) {
        if (n == 0 || n == 1) {
        return 1;
        } else {
        return n * factorial(n - 1);
        }
        }
        int n = 5;
        int result = factorial(n);
        System.out.println(n + "! = " + result);