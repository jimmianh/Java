package session6;

public class testAuthor {
    public static void main(String[] args) {
    Author ahTeck = new Author("Tan ah tack","teck@nowhere.com",'m');
    System.out.println(ahTeck);

    ahTeck.setEmail("teck@somewhere.com");


    System.out.println(ahTeck.toString());
}
}
