import java.util.ArrayList;

public class CourseOpg_10_9 {
    public static void main(String[] args) {
        //Laver et nyt course
        CourseOpg_10_9 test = new CourseOpg_10_9("Course A");

        //Laver 3 studenter
        test.addStudent("Jens");
        test.addStudent("Hans");
        test.addStudent("BenteBent");

        //Fjerner 1
        test.dropStudent("Hans");

        //Viser students
        System.out.println(test.getStudents());


    }


    /*Kopieret fra Listing 10.6, og vil kun comment de ting jeg har forbedret. */
    private String courseName;
    private ArrayList<String> students= new ArrayList<String>(); //Ændrer det til arrayList
    private int numberOfStudents;

    public CourseOpg_10_9(String courseName) {
        this.courseName = courseName;
    }

    //Del 1.  automatically increase the array size
    public void addStudent(String student) {
        students.add(student); //Bruger arrayList funktion .add, der tilføjer en "Array block" til, med informationen "student" inden i.
        numberOfStudents++;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    //Del 2. Implement the dropStudent method
    public void dropStudent(String student) {
        students.remove(student); //Bruger arrayList funktion .remove, der fjerner en "Array block", med informationen "student" inden i.
        numberOfStudents = students.size(); // Bruger arrayList funktion .size, der fortæller mig størrelsen af students. Den værdi giver jeg så til numberOfStudents
    }
    //Del 3. Clear method
    public void clear(){
        students.clear();//Bruger arrayList funktion .clear, der fjerner alle elementer.
        numberOfStudents = 0; // Ændrer numberOfStudents til 0, da jeg jo fjerner alle studenter
    }



}
