package session9;

abstract public class Monster {
    public String name;


    public Monster(String name) {
        this.name = name;
    }
    abstract public String attack();
}
