package leson4;

public class Student {
    int namberStydent;
    String lastName;
    String soname;
    int got;
    double ballMat;
    double balIcon;
    double inYaz;
}

class StudentTest {
    public static void main(String[] args) {
        Student studentTest = new Student();
        Student studentTest2 = new Student();
        Student studentTest3 = new Student();
        studentTest3.namberStydent = 12;
        studentTest3.lastName = "Игорь";
        studentTest3.ballMat = 4;
        studentTest3.inYaz = 5;
        studentTest3.balIcon = 4;

        StudentTest sredOcenca = new StudentTest();
        sredOcenca.sredOcenka(studentTest3);
    }

    void sredOcenka(Student at) {
        double ocenca = (at.ballMat + at.inYaz + at.balIcon) / 3;
        System.out.println("Средняя оценка ученика " + at.lastName + ": " + ocenca);

    }


}






