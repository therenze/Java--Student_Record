import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Behavior extends Student{

    // get random generated id
    void UniqueStudentID(){
        Random random = new Random();
        id_range = 99 ;
        id = random.nextInt(id_range);
        System.out.println("Unique Student ID : "+id);
    }

    void showDetails(){
        System.out.println("Student ID : "+id);
        System.out.println("Student Name : "+name);
        System.out.println("Student Grade : "+grade);
        System.out.println("Student Room : "+getRoomName());    
    }

    
}
