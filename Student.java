public class Student{
    protected int studentId,departmentId;
    protected String name,gender,phone;
    
    //setter methods
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setDepartmentId(int departmentId){
        this.departmentId = departmentId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    //getter methods
    public int getStudentId(){
        return this.studentId;
    }
    public int getDepartmentId(){
        return this.departmentId;
    }
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public String getPhone(){
        return this.phone;
    }
}