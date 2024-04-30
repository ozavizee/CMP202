public class Student extends Users{
    String matricNo;
    String admissionNo;


    @Override
    String register() {
        if (matricNo == "") {
            return "can't be empty";
        } else {
            return "success";
        }
    }

    void registerCourses(String course) {
        System.out.println(course);
    }

    String checkResult() {
        return  "99";
    }

    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.registerCourses("cmp202");
        System.out.println(newStudent.checkResult());
    }

}