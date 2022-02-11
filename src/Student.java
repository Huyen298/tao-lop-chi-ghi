public class Student {
    String name;
    String classes;

    public Student(String a, String change) {
        name=a;
        classes= change;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
