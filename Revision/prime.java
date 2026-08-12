class prime {

    public static void main(String args[]) {
        System.out.println(delAlternate("Mehdiali"));
    }

    static String delAlternate(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static int nextPrime(int n) {

        // code here to find next prime number
        outerLoop: while (true) {
            if (n % 2 == 0) {
                n++;
                continue;
            }

            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    n++;
                    continue outerLoop;
                }
            }

            return n;
        }
    }
}