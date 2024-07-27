public class Person1 {
    private int rollNo;
    private double id;
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public double getId() {
        return id;
    }
    public void setId(double id) {
        this.id = id;
    }
    public Person1(int rollNo, double id) {
        this.rollNo = rollNo;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Person1 [rollNo=" + rollNo + ", id=" + id + "]";
    }

}
