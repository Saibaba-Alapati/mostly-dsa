class Encapsulate {
    private String name;
    private int roll_no;
    private int age;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll_no;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    
    public void setName(String newName) {
        name = newName;
    }

    public void setRoll(int newRoll) {
        roll_no = newRoll;
    }
}

public class TestEncapsulation{
    public static void main(String arg[]){
        Encapsulate obj = new Encapsulate();
        obj.setAge(19);
        obj.setName("Saibaba Alapati");
        obj.setRoll(361);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.getRoll());
    }
}

//Data hiding and abstraction
//Increased Flexibility
//Reusability
//Testing code is easy