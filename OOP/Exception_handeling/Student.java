public class Student {
    private String name ;
    private int age ; 
    // constructor
    public Student(String naam , int saal)
    {
        this.name = naam ; 
        this.age = saal ;
    }

    // Setters
    public void set_Name(String name)
    {
        this.name = name ;
    }
    // way1
    public void set_Age(int age)
    {
        try{
            if(age <= 0)
            {
                throw new Exception("Baklol Age negative nhi hota...") ;
            }
            this.age = age ;
        }
        catch(Exception e) {
            System.out.println(e.getMessage()) ;
            e.printStackTrace() ;
        }
        finally
        {
            System.out.println("I am finally blockk");
            System.exit(1);
        }
    }
    // way2
    // public void set_Age(int age) throws Exception
    // {
    //     if(age <= 0)
    //     {
    //         throw new Exception("Baklol Age negative nhi hota...") ;
    //     }
    //     this.age = age ;
    // }

    // Getters
    public String get_Name()
    {
        return this.name ;
    }
    public int get_Age()
    {
        return this.age ;
    }

    public void Display()
    {
        System.out.println("Name : " + this.name);
        System.out.println("Age : "+ this.age);
    }
}
