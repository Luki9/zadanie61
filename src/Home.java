import java.util.Scanner;

public class Home {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperatura w pokoju");
        int temperature = scanner.nextInt();
        scanner.nextLine();


        Room room = new Room("info", 30, temperature, true);

        room.temperature();
        System.out.println(room.getTemperature());

    }
}
