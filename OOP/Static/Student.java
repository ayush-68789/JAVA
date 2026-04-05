public class Student {
    String name ; 
    int age ; 
    public void introduce()
    {
        System.out.println("My Name is "+name+ " and age is "+age );
    }

    public void SayHey (String name)
    {
        // but non-static field mein static acces kr skte hein
        Student.Mentor();
        System.out.println(this.name + " says Hey to " + name);
    }
    public static void Mentor()
    {
        System.out.println("Mentor is MONU BHAIYA...");   // static mein non static var accesible nhi hote hien
        // but non-static field mein static acces kr skte hein
    }
    static 
    {
        System.out.println("I am Static Block...");  
    }
}
