package JavaGeneric;

public class Covariant {
    public static void main(String[] args){

     GenericClass<String> stringData = new GenericClass<>("Getsu");
     process(stringData);


    }

    public static void process(GenericClass<? extends Object> data ){
        System.out.println(data.getData());

        // data.setData(2); Do not do this !
    }


}
