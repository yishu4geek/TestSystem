/**
 * Created by f79w3gq on 3/11/17.
 */
public class FloorRequest extends Request {

    int requestedfloor;
    String direcction;

    public FloorRequest( int requestedfloor,String direcction){
        this.requestedfloor = requestedfloor;
        this.direcction = direcction;
    }
    public void sentFloorRequest(RequestSystem rs,FloorRequest fr){
        rs.addFloorRequest(fr);
    }
}
