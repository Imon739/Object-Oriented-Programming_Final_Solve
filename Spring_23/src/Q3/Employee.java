package Q3;

public class Employee {
    public String name;
    public String id;
    public double[] score;
    public double averageScore;

    public Employee(String name, String id, double[] score) {
        this.name = name;
        this.id = id;
        this.score = score;
        finder();
    }
    public void finder(){
        double sum=0;
        for(int i=0;i<score.length;i++){
            sum+=score[i];
        }
        averageScore=sum/score.length;
    }
}
