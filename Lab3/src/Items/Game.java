package Items;

public class Game {
    String name;
    String start = " началась ";

    public Game(String name) {
        this.name = name;
    }
    public String Ga(){
        return start;
    }

    @Override
    public String toString(){
        return '"'+this.name+'"';
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.start.hashCode();
    }
}
