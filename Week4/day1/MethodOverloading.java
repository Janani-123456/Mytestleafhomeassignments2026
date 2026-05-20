package learnpolymorphism.Week4.day1;

public class MethodOverloading {

public void reportStep(String msg , String status){
System.out.println(msg+" "+status);
}
public void reportStep(String msg , String status , boolean snap){
   System.out.println(msg+" "+status+" "+snap); 
}
public static void main(String[] args) {
    MethodOverloading opt = new MethodOverloading();
    opt.reportStep("Congrats" , "Completed");
    opt.reportStep("Congrats" , "Completed",true);
}
}
