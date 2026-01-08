package Latihan.RefactoringClass;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = person.name = "Bobo Smith";
        System.out.println(person.name);

        personRefactoring personRefactoring = new personRefactoring();
        personRefactoring.setName("Bobob Smith");
        System.out.println(personRefactoring.name);
    }
}
