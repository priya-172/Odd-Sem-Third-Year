class Base{
        Object a(){
            System.out.println("i am in parent class ");
            return null;
        }
    }
    class SubClass1 extends Base{
        String a(){
            System.out.println("i am in class SUBCLASS1");
            return null;
        }
    }

        class SubClass2 extends Base{
            Integer a(){
                System.out.println("i am in class SUBCLASS2");
                return 0;
            }
        public static void main(String args[]){
            SubClass1 child1=new SubClass1();
            Base child2=new Base();
            Base child3=new SubClass1();
            child1.a();//i am in class child class
            child2.a();//i am in parent class
            child3.a();//i am in class child class
        }
    }
    

