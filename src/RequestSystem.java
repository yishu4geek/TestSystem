import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by f79w3gq on 3/11/17.
 */
public class RequestSystem {
    Queue<Integer> floorRequests;
    Queue<Integer> elevatorRequests1;
    Queue<Integer> elevatorRequests2;
    Queue<Integer> elevatorRequests3;
    ElevatorController[] elevatorControllers = new ElevatorController[3];



    public RequestSystem(){
        floorRequests = new LinkedList<>();
        elevatorRequests1 = new LinkedList<>();
        elevatorRequests2 = new LinkedList<>();
        elevatorRequests3 = new LinkedList<>();
        for(int i = 0;i<3;i++){
            elevatorControllers[i]= new ElevatorController(i+1);
        }

    }

    public void addElevatorRequest(ElevatorRequest er){
        if(er.elevatorId == 1){
            elevatorRequests1.offer(er.requestedfloor);
        }else if(er.elevatorId == 2){
            elevatorRequests2.offer(er.requestedfloor);
        }else{
            elevatorRequests3.offer(er.requestedfloor);
        }
    }

    public void addFloorRequest(FloorRequest fr){
         floorRequests.offer(fr.requestedfloor);
    }
    public void removeFloorRequest(){
        floorRequests.remove();
    }
    public void removeElevatorRequest(int elevatorId){
        if(elevatorId == 1){
            elevatorRequests1.remove();
        }else if(elevatorId == 2){
            elevatorRequests2.remove();
        }else{
            elevatorRequests3.remove();
        }
    }
    public boolean elevatorIsEmpty(int elevatorId){
        if(elevatorId == 1){
            return elevatorRequests1.isEmpty();
        }else if(elevatorId == 2){
            return elevatorRequests2.isEmpty();
        }else{
            return elevatorRequests3.isEmpty();
        }
    }
    public int getRequest(int elevatorId) {

        if (!elevatorIsEmpty(elevatorId)) {
            if (elevatorId == 1) {
                int removedFoor =  elevatorRequests1.peek();
                removeElevatorRequest(1);
                return removedFoor;
            } else if (elevatorId == 2) {
                int removedFoor = elevatorRequests2.peek();
                removeElevatorRequest(2);
                return removedFoor;
            } else {
                int removedFloor= elevatorRequests3.peek();
                removeElevatorRequest(3);
                return removedFloor;
            }
        }else{
            int removedFloor = floorRequests.peek();
            removeFloorRequest();
            return removedFloor;
        }

    }


}
