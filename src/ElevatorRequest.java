/**
 * Created by f79w3gq on 3/11/17.
 */
public class ElevatorRequest extends Request {
    int elevatorId;
    int requestedfloor;
    public ElevatorRequest(int id, int requestedfloor){
        this.elevatorId = id;
        this.requestedfloor = requestedfloor;
    }
    public void sendElevatorRequest(ElevatorRequest er,RequestSystem rs){
        rs.addElevatorRequest(er);
    }
}
