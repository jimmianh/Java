package session6;

public class CodeLearnA {
    public void methodPublic() {
        methodPrivate();
    }
    protected void methodProtected(){
        methodPrivate();
    }
    void methodDefault(){
        methodPrivate();
    }
    private void methodPrivate(){}
}
