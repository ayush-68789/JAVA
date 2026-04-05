public class Client {
    public static void main(String[] args) {
        Student s = new Student() ; 
        s.name = "ayush" ; 
        s.age = 10 ; 
        s.introduce(); 

        Student s1 = new Student() ; 
        s1.name = "Raju" ;
        s1.age = 25 ;
        s1.introduce(); 
        s1.SayHey("Kaju");

        Student.Mentor();   // static method ko class ke naam se call krte hein
    }
}
