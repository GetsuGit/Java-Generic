package JavaGeneric;

public class WildcardClass {
    public static void main(String[] args){

     print(new GenericClass<Integer>(100));
     print(new GenericClass<String>("100"));
     print(new GenericClass<BoundMultiple.Manager>(new BoundMultiple.Manager()));

    }

    public static void print(GenericClass<?> data){
        System.out.println(data.getData());
    }
}
