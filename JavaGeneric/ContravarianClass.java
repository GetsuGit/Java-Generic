package JavaGeneric;

public class ContravarianClass  {
    public static void main(String[] args){

     GenericClass<Object> objekData = new GenericClass<>("GETSU");
     GenericClass<? super String> data1 = objekData;

     process(objekData);
        System.out.println(objekData.getData());

    }

    public static void process(GenericClass<? super String> data2){

       data2.setData("Code");
    }

}
