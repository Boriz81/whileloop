public class Main {
    public static void main(String[] args) {
        /*
        базовый синтаксис:

        while (condition) {
            // тело цикла:
        }
        */
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println("1");
        } while (i < 5);
    }
}