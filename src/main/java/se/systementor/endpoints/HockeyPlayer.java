package se.systementor.endpoints;

public class HockeyPlayer {
    int id;
    String name;
    int jersey;

    public HockeyPlayer(int jersey, String name, int id) {
        this.jersey = jersey;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJersey() {
        return jersey;
    }

    public void setJersey(int jersey) {
        this.jersey = jersey;
    }
}
