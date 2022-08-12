class Base{
    void a(){
        System.out.println("i am in parent class ");
    }
}
class SubClass extends Base{
    void a(){
        System.out.println("i am in class child class");
    }
    public static void main(String args[]){
        SubClass child1=new SubClass();
        Base child2=new Base();
        Base child3=new SubClass();
        child1.a();//i am in class child class
        child2.a();//i am in parent class
        child3.a();//i am in class child class
    }
}
