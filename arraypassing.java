public class arraypassing {
    public static double average(double[] marks) {
        double sum = 0,avg=0;
        for(int i = 0;i<marks.length;i++){
            sum+=marks[i];
        }
        avg = sum/marks.length;
        return avg;
    
    }
    public static void main(String[] args) {
        double [] marks = {80.5,90,74,46.5,80};
        System.out.println(average(marks));        
    }
}