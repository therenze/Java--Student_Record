import java.util.Random;

public abstract class Student{
    
    int id;
    int newID;
    int id_range;

    String grade;
    String name;
    private String roomName; //encapsulation


    public void setRoomName(String roomName){
        this.roomName = roomName;
    }
    String getRoomName(){
        return roomName;
    }

    //abtract method
    abstract void UniqueStudentID();
}

