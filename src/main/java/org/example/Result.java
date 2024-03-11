package org.example;

public class Result {
    private String choice;
    private String win;
    private String opened_door;
    private String doors;
    private String result;

    public Result(String choice, String win, String opened_door, String doors, String result) {
        this.choice = choice;
        this.win = win;
        this.opened_door = opened_door;
        this.doors = doors;
        this.result = result;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public void setOpened_door(String opened_door) {
        this.opened_door = opened_door;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getChoice() {
        return choice;
    }

    public String getWin() {
        return win;
    }

    public String getOpened_door() {
        return opened_door;
    }

    public String getDoors() {
        return doors;
    }

    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Result{" + choice+"; " + win+"; " + opened_door+"; " + doors+"; " + result+ '}';
    }
}
