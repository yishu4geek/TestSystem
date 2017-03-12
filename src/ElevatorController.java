/**
 * Created by f79w3gq on 3/11/17.
 */
public class ElevatorController {
    Elevator elevator;
    public ElevatorController(int elevatorId){
        this.elevator = new Elevator(elevatorId,0,"UP");

    }

    public void liftElevator(RequestSystem rs){
        int floor = rs.getRequest(elevator.id);
        if(elevator.curFloor<floor){
            int liftCount = floor-elevator.curFloor;
            while(liftCount>0){
                elevator.moveUp();
                liftCount--;
            }
        }else{
            int liftCount = elevator.curFloor-floor;
            while(liftCount>0){
                elevator.moveDown();
                liftCount--;
            }
        }

    }
}
