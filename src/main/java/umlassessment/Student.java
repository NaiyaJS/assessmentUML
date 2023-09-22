package umlassessment;

public class Student extends Customer implements Discountable{

    private static long studentID;
    private long studentIDNum;
    private String studentName;

    public Student(String studentName){
        this.studentName = studentName;
        this.studentIDNum = ++studentID;
    }
    public Student(Size size) {
        super(size);
    }

    public void printCustomerName(String Customer) {

    }

    @Override
    public double calculateDiscount() {
        return 0.5;
    }
}
