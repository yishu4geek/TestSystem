import org.junit.Test;

/**
 * Created by f79w3gq on 3/11/17.
 */import static org.junit.Assert.assertEquals;

public class TestElevatorController {


    int floor1 =2;
    int floor2 =8;
    int floor3 =3;
    int floor4 =7;
    int floor5 =10;
    int elevator1 = 1;
    int elevator2 = 2;
    int elevator3 = 3;
    RequestSystem rs = new RequestSystem();
    @Test
    public void testElevatorMovingUp(){
        FloorRequest fr = new FloorRequest(floor1,"UP");
        System.out.println("Get "+floor1 +" floor request.");
        fr.sentFloorRequest(rs,fr);
        assertEquals(2,rs.getRequest(1));

//        FloorRequest fr1 = new FloorRequest(floor2,"UP");
//        System.out.println("Get "+floor2 +" floor request.");
//        fr.sentFloorRequest(rs,fr1);
//        FloorRequest fr2 = new FloorRequest(floor3,"DOWN");
//        System.out.println("Get "+floor3 +" floor request.");
//        fr.sentFloorRequest(rs,fr2);

//        ElevatorRequest er = new ElevatorRequest(elevator1,floor4);
//        er.sendElevatorRequest(er,rs);
//        ElevatorRequest er1 = new ElevatorRequest(elevator1,floor5);
//        er.sendElevatorRequest(er,rs);
//        ElevatorRequest er2 = new ElevatorRequest(elevator2,floor2);
//        er.sendElevatorRequest(er,rs);
//        ElevatorRequest er3 = new ElevatorRequest(elevator2,floor3);
//        er.sendElevatorRequest(er,rs);

    }

}
