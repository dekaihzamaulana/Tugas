public class Latihan {
    public static void main(String[] args) {
        Calculating z = new Calculating();
        z.setNumber1(6);
        z.setNumber2(90);
        z.addAllNumbers();
        z.multiplyNumbers(z.getNumber1(), z.getNumber2());
    }
}

class Calculating {
    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void addAllNumbers() {
        int sum = number1 + number2;
        System.out.println("Sum: " + sum);
    }

    public void multiplyNumbers(int num1, int num2) {
        int product = num1 * num2;
        System.out.println("Product: " + product);
    }
}
