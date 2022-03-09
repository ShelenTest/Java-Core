package HW1.courses;

import HW1.teams.Team;

import java.util.Random;

public class ObstacleCourse {
    private int count;
    private double minRun = 10;
    private double maxRun = 100;
    private double minJump = 0.5;
    private double maxJump = 1.0;
    private Course[] courseArray;

    public ObstacleCourse (int count){
        this.count = count;
        this.courseArray  = new Course[count];
    }

    public void generateObstacles(){
        Random r = new Random();
        // System.out.println(count);
        for(int i = 0; i < count; i++){
            // System.out.println(i);
            courseArray[i] = new Distance(minRun + (maxRun - minRun) * r.nextDouble());
            i++;
            // System.out.println(i);
            if(i < count) {
                courseArray[i] = new Height(minJump + (maxJump - minJump) * r.nextDouble());
            }
        }
    }

    public int getCount(){
        return count;
    }

    public Course getObstacle(int i){
        return courseArray[i];
    }

    public double doIt(Team team){
        double teamTime = 0;
        for(int i = 0; i < team.getSize(); i++){
            if(!team.getMember(i).canJumpAllObstacles(this)) teamTime = teamTime - 10;
            teamTime = teamTime + team.getMember(i).totalRunTime(this);
        }
        return teamTime;
    }

    @Override
    public String toString(){
        String list = "All teams ";
        for(int i = 0; i < count; i++){
            list = list + courseArray[i].getInfo() + ", ";
        }
        return list;
    }

}
