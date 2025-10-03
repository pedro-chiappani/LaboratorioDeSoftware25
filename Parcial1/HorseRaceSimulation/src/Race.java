import java.util.concurrent.TimeUnit;
import java.lang.Math;
import java.util.Scanner;

/**
 * A three-horse race, each horse running in its own lane
 * for a given distance
 * 
 * @author McFarewell
 * @version 1.0
 */
public class Race
{
    private int raceLength;
    private Horse lane1Horse;
    private Horse lane2Horse;
    private Horse lane3Horse;
    private boolean finished;


    /**
     * Constructor for objects of class Race
     * Initially there are no horses in the lanes
     * 
     * @param distance the length of the racetrack (in metres/yards...)
     */
    public Race(int distance)
    {
        // initialise instance variables
        raceLength = distance;
        lane1Horse = null;
        lane2Horse = null;
        lane3Horse = null;
        finished = false;
    }
    public void setRaceLength(int distance){
        raceLength = distance;
    }
    public int getRaceLength(){
        return raceLength;
    }
    public void RaceFinished(boolean finished){
        this.finished= finished;
    }
    public boolean isFinished(){
        return this.finished;
    }
    /**
     * Adds a horse to the race in a given lane
     * 
     * @param theHorse the horse to be added to the race
     * @param laneNumber the lane that the horse will be added to
     */
    public void addHorse(Horse theHorse, int laneNumber)
    {
        if (laneNumber == 1)
        {
            lane1Horse = theHorse;
        }
        else if (laneNumber == 2)
        {
            lane2Horse = theHorse;
        }
        else if (laneNumber == 3)
        {
            lane3Horse = theHorse;
        }
        else
        {
            System.out.println("Cannot add horse to lane " + laneNumber + " because there is no such lane");
        }
    }

    private int getHorseLane(Horse horse){
        if (horse.equals(lane1Horse))
            return 1;
        else if (horse.equals(lane2Horse))
            return 2;
        return 3;
    }

    private int checkWithOtherLanes(Horse myHorse, Horse horse2, Horse horse3){
        if (myHorse.getDistanceTravelled() > horse2.getDistanceTravelled()){
            if (myHorse.getDistanceTravelled() > horse3.getDistanceTravelled()){
                return 1;
            }else {
                return 2;
            }
        }else if (myHorse.getDistanceTravelled() > horse3.getDistanceTravelled()){
            return 3;
        }
        return 0;
    }

    public int getPosicion(Horse horse){
        int lane = this.getHorseLane(horse);
        int pos = 0;
        if (lane == 1){
            pos = checkWithOtherLanes(horse, lane2Horse, lane3Horse);
        } else if (lane == 2) {
            pos = checkWithOtherLanes(horse, lane1Horse, lane3Horse);
        }else if (lane == 3) {
            pos = checkWithOtherLanes(horse, lane1Horse, lane2Horse);
        }
        return pos;
    }

}
