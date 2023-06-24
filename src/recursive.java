public class recursive {

    public static void PrintHitung(int number){
        if (number < 9900) {
            number++;//number=number +1
            System.out.println(number);
            PrintHitung(number);
        }

    }

    public static void main(String[] args) {
        PrintHitung(1);
    }
}