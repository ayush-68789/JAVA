public class Client {
    public static void main(String[] args) {
        User s = new User() ; 
        s.name = "ayush" ; 
        s.age = 10 ; 
        s.introduce(); 

        User s1 = new User() ; 
        s1.name = "Raju" ;
        s1.age = 25 ;
        s1.introduce(); 
        s1.SayHey("Kaju");

        User.Mentor();   // static method ko class ke naam se call krte hein
    }
}
