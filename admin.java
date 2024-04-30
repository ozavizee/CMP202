public class Admin extends Users{
    String staffNo;

    void uploadResult(String course, float score) {

    }

    public static void main(String[] args) {
        Admin treasure = new Admin();
        treasure.uploadResult("CMP202", 99);

    }

}