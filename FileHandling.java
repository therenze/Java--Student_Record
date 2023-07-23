import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling extends Behavior implements Controller_Interface {

        Behavior student = new Behavior();
    // ADDING STUDENT TO RECORDS
    public void add() {
        student.UniqueStudentID();
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Name: ");
            name = input.nextLine();
            System.out.print("Enter Grade: (ex.grade2) ");
            grade = input.nextLine();
            System.out.print("Enter Room Name: (ex.room2) ");
            student.setRoomName(input.nextLine());

            FileWriter write = new FileWriter("text.txt",true);
            write.write("\n"+student.id+" || ");
            write.write(" Student Name:"+name+" || ");
            write.write(" Student Grade:"+grade+" || ");
            write.write(" Student Room:"+student.getRoomName());
            write.close();
            System.out.println("\nSuccessfully Added to Records!!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


 
    @Override
    public void update() {
        

    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void saveRecords() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveRecords'");
    }

    @Override
    public void showAllRecords() {
        //this will show all records
        try{
            System.out.println("\n===========================");
            System.out.println("SHOWING ALL STUDENT RECORDS");
            File create = new File("text.txt");
            
            Scanner write = new Scanner(create);
            while (write.hasNextLine()){
                String data = write.nextLine();
                System.out.println(data);}
            write.close();
        }
         catch (IOException e){
             System.out.println("An error occurred while creating.");
             e.printStackTrace();
         }
    }

    
    
}
