public class Celebrity {
    String name;
    String clue;

    public Celebrity(String n, String c) {
        name = n;
        clue = c;
    }

    public void setName(String n) {
        name = n;
    }

    public void setClue(String c) {
        clue = c;
    }

    public String getName() {
        return name;
    }

    public String getClue() {
        return clue;
    }

    public boolean checkName(String guess) {
        return guess.equals(name);
    }

    @Override
    public String toString() {
        return name + ", " + clue;
    }
}