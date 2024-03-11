package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Result> results_without_change = new ArrayList<>();
        double yes = 0;
        double no = 0;
        for (int i = 0; i < 1000; i++) {
            ArrayList<Integer> doors = new ArrayList<>();
            doors.add(0);
            doors.add(0);
            doors.add(0);
            int win = new Random().nextInt(3);
            String setwin = "Win is "+win;
            doors.set(win, 1);
            int choice = new Random().nextInt(3);
            String setChoice = "Choice is "+choice;
            String setDoors = doors.toString();
            int opened_door = 200;
            for (int j = 0; j < doors.size(); j++) {
                if (doors.get(j) != 1 && j!= choice) {
                    opened_door = j;

                }
            }
            String setOpened_door = "opened door is "+opened_door;
            String setResult;
            if (doors.get(choice) == 1) {
                setResult = "Right";
                yes++;
            }
            else{
                setResult = "Wrong";
                no++;
            }
            Result r = new Result(setChoice,setwin,setOpened_door,setDoors,setResult);
            results_without_change.add(r);
        }
        System.out.println(yes);
        System.out.println(no);
        System.out.println((yes/1000)*100 + "% - Right");
        System.out.println((no/1000)*100 + "% - Wrong");

        yes = 0;
        no = 0;

        ArrayList<Result> results_with_change = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            ArrayList<Integer> doors = new ArrayList<>();
            doors.add(0);
            doors.add(0);
            doors.add(0);
            int win = new Random().nextInt(3);
            String setWin = "Win is " + win;
            doors.set(win, 1);
            int choice = new Random().nextInt(3);
            String setChoice = "Choice is " + choice;
            String setDoors = doors.toString();
            int opened_door = 200;
            for (int j = 0; j < doors.size(); j++) {
                if (doors.get(j) != 1 && j != choice) {
                    opened_door = j;

                }
            }
            String setOpened_door = "opened door is " + opened_door;


            if (choice!=win) {
                choice = win;
            }
            else{
                for (int k = 0; k < doors.size(); k++) {
                    if(k != opened_door && k!=win){
                        choice = k;
                    }
                }
            }
            //System.out.println("Choice is " + choice);
            String setResult;
            if (doors.get(choice) == 1) {
                setResult = "Right";
                yes++;
            } else {
                setResult= "Wrong";
                no++;
            }
            Result r1 = new Result(setChoice, setWin, setOpened_door, setDoors, setResult);
            results_with_change.add(r1);
        }
        System.out.println("");
        System.out.println(yes);
        System.out.println(no);
        System.out.println((yes/1000)*100 + "% - Right");
        System.out.println((no/1000)*100 + "% - Wrong");

        System.out.println(results_without_change.get(500).toString());
        System.out.println(results_with_change.get(500).toString());
    }
}