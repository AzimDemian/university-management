import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private int facultyID;
    private String firstName;
    private String secondName;
    private String email;
    private String phoneNumber;
    private String department;
    private String position;
    private String officeLocation;
    private String hireDate;
    private boolean availability;
    private List<Course> coursesTaught;

    public Faculty(int facultyID, String firstName, String secondName, String email, String phoneNumber,
                   String department, String position, String officeLocation, String hireDate, boolean availability) {
        this.facultyID = facultyID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.position = position;
        this.officeLocation = officeLocation;
        this.hireDate = hireDate;
        this.availability = availability;
        this.coursesTaught = new ArrayList<>();
    }

    public Faculty(int facultyID, String firstName, String secondName) {
        this(facultyID, firstName, secondName, "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", false);
    }

    public int getFacultyID() 
    { 
        return facultyID; 
    }
    public String getFirstName() 
    { return firstName; }
    public String getSecondName() 
    { 
        return secondName; 
    }
    public String getEmail() 
    { 
        return email; 
    }
    public String getPhoneNumber() 
    { 
        return phoneNumber; 
    }
    public String getDepartment() 
    { 
        return department; 
    }
    public String getPosition() 
    { 
        return position; 
    }
    public String getOfficeLocation() 
    { 
        return officeLocation; 
    }
    public String getHireDate() 
    { 
        return hireDate; 
    }
    public boolean isAvailable() 
    { 
        return availability; 
    }
    public List<Course> getCoursesTaught() 
    { 
        return new ArrayList<>(coursesTaught); 
    }

    public void setFacultyID(int facultyID) 
    { 
        this.facultyID = facultyID; 
    }
    public void setFirstName(String firstName) 
    { 
        this.firstName = firstName; 
    }
    public void setSecondName(String secondName) 
    { 
        this.secondName = secondName; 
    }
    public void setEmail(String email) 
    { 
        this.email = email; 
    }
    public void setPhoneNumber(String phoneNumber) 
    { 
        this.phoneNumber = phoneNumber; 
    }
    public void setDepartment(String department) 
    { 
        this.department = department; 
    }
    public void setPosition(String position) 
    { 
        this.position = position; 
    }
    public void setOfficeLocation(String officeLocation) 
    { 
        this.officeLocation = officeLocation; 
    }
    public void setHireDate(String hireDate) 
    { 
        this.hireDate = hireDate; 
    }
    public void setAvailability(boolean availability) 
    { 
        this.availability = availability; 
    }

    public void changeAvailabilityStatus(boolean status) {
        this.availability = status;
        String message = status ? "is now available" : "is now unavailable";
        System.out.printf("%s %s %s %s\n", this.position, this.firstName, this.secondName, message);
    }

    public void assignCourse(Course courseName) {
        if (!coursesTaught.contains(courseName)) {
            coursesTaught.add(courseName);
            System.out.println("\"" + courseName + "\" has been assigned to " + this.firstName + " " + this.secondName);
        } else {
            System.out.println(this.firstName + " " + this.secondName + " is already assigned to \"" + courseName + "\"");
        }
    }

    @Override
    public String toString() {
        return "Faculty ID: " + facultyID +
               "\nName: " + firstName + " " + secondName +
               "\nEmail: " + email +
               "\nPhone: " + phoneNumber +
               "\nDepartment: " + department +
               "\nPosition: " + position +
               "\nOffice: " + officeLocation +
               "\nHire Date: " + hireDate +
               "\nAvailability: " + (availability ? "Available" : "Unavailable") +
               "\nCourses Taught: " + (coursesTaught.isEmpty() ? "None" : coursesTaught);
    }
}