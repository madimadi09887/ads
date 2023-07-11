public static int fibonacci(int n) {
        if (n < 2) {
        return n;
        } else {
        return fibonacci(n-1) + fibonacci(n-2);
        }
        }
        int n = 6;
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
