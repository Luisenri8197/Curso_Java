package OOP;

public class Student {
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public void aprove(){
        if(score >= 60){
            System.out.printf("El estudiante %s aprobó con %.1f%n", name, score);
            return;
        }
        System.out.printf("El bruto jpta de %s reprobó con un miserable %.1f%n", name, score);
    }
}
