package JavaGeneric;

public class BoundMultiple {
    public static void main(String[] args){

     // Data<Manager> managerData = new Data<>(new Manager());
     Data<VP> vp = new Data<>(new VP());



    }

     public static interface sayHello{
        void sayHello(String name);
     }


    public static abstract class Employee{


    }

    public static class Manager extends Employee {

    }

    public static class VP extends Employee implements sayHello{

    @Override
    public void sayHello(String name){
        System.out.println("Hello " + name);
    }



    }

    public static class Data<T extends Employee & sayHello>{

        private T data;

        public Data(T data){
            this.data = data;
        }

        public T getData(){
            return data;
        }

        public void setData(T data){
            this.data = data;
        }

    }

}
