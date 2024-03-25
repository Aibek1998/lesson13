public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Aibek",25,"Java Backend","Osh");
        Student student2 = new Student("Doolot",19,"Java Fronend","Batken");
        Student student3 = new Student("Samat",19,"Java Frontend","Batken");
        System.out.println("Student 1");
        System.out.println("name : "+student1.name+"\n"+
                "age : "+student1.age+"\n"+
                "lesson : "+student1.lesson+"\n"+
                "live in : "+student1.livein);
        System.out.println();
        System.out.println("Student 2");
        System.out.println("name : "+student2.name+"\n"+
                "age : "+student2.age+"\n"+
                "lesson : "+student2.lesson+"\n"+
                "live in : "+student2.livein);
        System.out.println();
        System.out.println("Student 3");
        System.out.println("name : "+student3.name+"\n"+
                "age : "+student3.age+"\n"+
                "lesson : "+student3.lesson+"\n"+
                "live in : "+student3.livein);
    }
}