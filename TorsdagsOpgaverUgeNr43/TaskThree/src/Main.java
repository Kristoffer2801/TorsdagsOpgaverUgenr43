import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> studentPassedCourses = new ArrayList<>();
        studentPassedCourses.add("Datamatiker");
        Student student1 = new Student("Mads",studentPassedCourses);
        Student student2 = new Student("Kristoffer", new ArrayList<>());
        persons.add(student1);
        persons.add(student2);

        ArrayList<String> teacherCanTeach = new ArrayList<>();
        teacherCanTeach.add("C#");
        Teacher teacher1 = new Teacher("Mette",teacherCanTeach);
        Teacher teacher2 = new Teacher("Brian", new ArrayList<>());
        persons.add(teacher1);
        persons.add(teacher2);

        for (Person person : persons){
            boolean result = person.addCourse("C#");
            if(!result){
                if (person instanceof Student){
                    System.out.println(person.getName() + " har haft dette kursus");
                } else if (person instanceof Teacher){
                    System.out.println("Det er ikke tilladt for " + person.getName() + " at undervise faget");
                }
            }
        }

    }
}
