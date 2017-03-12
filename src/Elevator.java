/**
 * Created by f79w3gq on 3/11/17.
 */
public class Elevator {
    int id;
    int curFloor;
    String dirction;
    ElevatorButton eb;


    public Elevator(int id,int floor,String dirction){
        this.id = id;
        this.curFloor = floor;
        this.dirction = dirction;
        eb = new ElevatorButton();
    }
    public void moveUp(){
        System.out.println(" Elevator"+id+" is at " + curFloor + " floor. "+"Moving up...");
        curFloor++;
    }
    public void moveDown(){
        System.out.println(" Elevator"+id+" is at " + curFloor + " floor. "+"Moving down...");
        curFloor--;
    }

}
