/* Jeminez, Jasmin
   BSIT 2
   Oct 09, 2023
*/   
import java.util.Scanner;

public class RouteActivity {
    public static void main(String[] args) {
        Route route = new Route();
        Scanner scanner = new Scanner(System.in);

        System.out.println(" --- Welcome! ---");
        System.out.print("Is Route 4 (via Barili) obstructed? [Y/N]: ");
        char ans = scanner.next().charAt(0);
        ans = Character.toLowerCase(ans);

        if (ans == 'y') {
            System.out.print("Is Route 4.2.1 (via Dumajug) obstructed? [Y/N]: ");
            String ans2 = scanner.next();
           

            if (ans2.equalsIgnoreCase("y")) {
                route.route3(); // Route via Argao
            } else {
                route.route2(); // Route via Sibonga
            }
        } else {
            route.defRoute(); // Default Route via Barili
        }

        System.out.println("Enjoy your journey to Moalboal!");
        scanner.close();
    }

    static class Route {
        public void defRoute() {
            System.out.println("Default Route:");
            System.out.println("    Cebu City     ");
            System.out.println("Minglanilla     Route 1");
            System.out.println("San Fernando    Route 2");
            System.out.println("Carcar City     Route 3");
            System.out.println("Barili          Route 4");
            System.out.println("Dumajug         Route 4.2.1");
            System.out.println("Alcantara       Route 4.2.2");
            System.out.println("Moalboal        End");
        }

        public void route2() {
            System.out.println("Alternative Route via Sibonga:");
            System.out.println("   Cebu City    ");
            System.out.println("Minglanilla     Route 1");
            System.out.println("San Fernando    Route 2");
            System.out.println("Carcar City     Route 3");
            System.out.println("Sibonga         Route 4.2");
            System.out.println("Dumajug         Route 4.2.1");
            System.out.println("Alcantara       Route 4.2.2");
            System.out.println("Moalboal        End");
        }

        public void route3() {
            System.out.println("Alternative Route via Argao:");
            System.out.println("    Cebu City   ");
            System.out.println("Minglanilla     Route 1");
            System.out.println("San Fernando    Route 2");
            System.out.println("Carcar City     Route 3");
            System.out.println("Argao           Route 5");
            System.out.println("Ronda           Route 5.1");
            System.out.println("Alcantara       Route 5.2");
            System.out.println("Moalboal        End");
        }
    }
}
