package HW1.teams;

import HW1.sportsman.Participant;

import java.util.Random;

public class Team {
    private String name;
    private Participant[] members;
    private int count = 4;
    private double minSpeed = 5;
    private double maxSpeed = 12;
    private double minJumpHeight = 0.7;
    private double maxJumpHeight = 2;
    private String[] names = new String[]{"Vova", "Petya", "Kolya", "Sasha", "Sergey", "Katya", "Sonya", "Polina", "Dasha"};

    public Team (String name){
        this.name = name;
        this.members = new Participant[count];
        Random r = new Random();
        for (int i = 0; i < count; i++){
            int n = (int)Math.floor(Math.random() * names.length);
            String memberName = names[n];
            double speed = minSpeed + (maxSpeed - minSpeed) * r.nextDouble();
            double height = minJumpHeight + (maxJumpHeight - minJumpHeight) * r.nextDouble();
            Participant member = new Participant(memberName, speed, height);
            this.members[i] =member;
        }
    }

    public int getSize(){
        return count;
    }

    public String getName(){
        return name;
    }

    public Participant getMember(int i){
        return members[i];
    }

    public String getInfo(){
        String teamInfo = "Team " + name + ": \n";
        for(int i = 0; i < count; i++){
            teamInfo = teamInfo + members[i].toString() + "\n";
        }
        return teamInfo;
    }
}
