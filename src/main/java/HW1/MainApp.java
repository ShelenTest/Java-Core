package HW1;

import HW1.courses.ObstacleCourse;
import HW1.teams.Team;

public class MainApp {
    public static void main(String[]args){
        ObstacleCourse c = new ObstacleCourse(7);
        c.generateObstacles();
        System.out.println(c.toString());
        Team team1 = new Team("Russians");
        System.out.println(team1.getInfo());
        Team team2 = new Team("Ukrainians");
        System.out.println(team2.getInfo());
        double firstTeamResult = c.doIt(team1);
        double secondTeamResult = c.doIt(team2);
        if(firstTeamResult == secondTeamResult ) {System.out.println("Equal results, friendship wins"); return;}
        String message;
        message = (firstTeamResult > secondTeamResult)? (team1.getName() + " win") : (team2.getName() + " win");
        System.out.println(message);
    }

}
