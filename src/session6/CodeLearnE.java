package session6;

public class CodeLearnE {
    public static void main(String[] args) {
        new CodeLearnB().methodPublic();
        new CodeLearnB().methodProtected();

        new CodeLearnE().methodProtected();
    }

    private void methodProtected() {
    }
}
