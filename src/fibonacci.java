public class fibonacci {
    public static void main(String[] args) {
        int limit = 4500;
        int previous = 0;
        int current = 1;
        int sum = 0;
        int count = 0;
        StringBuilder evenNumbers = new StringBuilder();

        while (current <= limit) {
            if (current % 2 == 0) {
                sum += current;
                evenNumbers.append(current).append(" ");
                count++;
            }
            int next = previous + current;
            previous = current;
            current = next;
        }

        System.out.println("Deretan bilangan Fibonacci genap:");
        System.out.println(evenNumbers);
        System.out.println("Total bilangan Fibonacci genap: " + count);
        System.out.println("Jumlah bilangan Fibonacci genap: " + sum);
    }
}
