import java.util.*;
public class Main{
    public static Hosteller getHostellerDetails(){
        Scanner sc = new Scanner(System.in);
        Hosteller h = new Hosteller(); 
        
        System.out.println("Enter the Details:");
        
        System.out.println("Student Id");
        h.setStudentId(sc.nextInt());
        sc.nextLine();
        
        System.out.println("Student Name");
        h.setName(sc.nextLine());
        
        System.out.println("Department Id");
        h.setDepartmentId(sc.nextInt());
        sc.nextLine();
        
        System.out.println("Gender");
        h.setGender(sc.nextLine());
        
        System.out.println("Phone Number");
        h.setPhone(sc.nextLine());
        
        System.out.println("Hostel Name");
        h.setHostelName(sc.nextLine());
        
        System.out.println("Room Number");
        h.setRoomNumber(sc.nextInt());
        sc.nextLine();
        sc.close();

        return h;
    }
    
    public static void main(String args[])
    {
        
        Hosteller h = getHostellerDetails();
        System.out.println("Modify Room Number(Y/N)");
        Scanner sc = new Scanner(System.in);
        if(sc.nextLine().toLowerCase().equals("Y"))
        {
            System.out.println("New Room Number");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            h.setRoomNumber(roomNumber);
        }
        
        System.out.println("Modify Phone Number(Y/N)");
        if(sc.nextLine().toLowerCase().equals("Y"))
        {
            System.out.println("New Phone Number");
            String phone = sc.nextLine(); 
            h.setPhone(phone);
        }
        sc.close();
       
    }
}