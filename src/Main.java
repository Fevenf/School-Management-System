import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher Almaz = new Teacher(1,"Almaz",700);
        Teacher Mahlet = new Teacher(2,"Mahlet",900);
        Teacher Abel = new Teacher(3,"Abel",800);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Almaz);
        teacherList.add(Mahlet);
        teacherList.add(Abel);


        Student Lidia = new Student(1,"Lidia",4);
        Student Meron = new Student(2,"Meron",12);
        Student Beti = new Student(3,"Beti",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Lidia);
        studentList.add(Beti);
        studentList.add(Meron);




        School abc = new School(teacherList,studentList);

        Teacher Gelila = new Teacher(6,"Gelila", 900);

        abc.addTeacher(Gelila);


        Lidia.payFees(5700);
        Meron.payFees(7600);
        System.out.println("ABC has earned $"+ abc.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Almaz.receiveSalary(Almaz.getSalary());
        System.out.println("ABC has spent for salary to " + Almaz.getName()
        +" and now has $" + abc.getTotalMoneyEarned());

        Abel.receiveSalary(Abel.getSalary());
        System.out.println("ABC has spent for salary to " + Abel.getName()
                +" and now has $" + abc.getTotalMoneyEarned());


        System.out.println(Meron);

        Mahlet.receiveSalary(Mahlet.getSalary());

        System.out.println(Mahlet);


    }
}
