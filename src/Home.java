import java.util.Scanner;

public class Home {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperatura w pokoju");
        int temperatureCooldown = scanner.nextInt();
        scanner.nextLine();


        Room room = new Room("info", 30, temperatureCooldown, true);

        System.out.println(room.getTemperaturCooldown());

    }
}
