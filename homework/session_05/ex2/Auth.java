public class Auth {
    public static void authenticate(String username, String password) {
        if (username != null && password != null) {
            System.out.println("User authenticated successfully: " + username);
        } else {
            System.out.println("Authentication failed!");
        }
    }
}