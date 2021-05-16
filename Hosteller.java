public class Hosteller extends Student{
    private String hostelName;
    private int roomNumber;

    //setter methods
    public void setHostelName(String hostelName){
        this.hostelName = hostelName;
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }
    //getter methods
    public String getHostelName(){
        return this.hostelName;
    }
    public int getRoomNumber(){
        return this.roomNumber;
    }
}