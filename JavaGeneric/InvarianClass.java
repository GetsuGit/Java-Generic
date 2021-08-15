package JavaGeneric;

public class InvarianClass {
    public static void main(String[] args){

        GenericClass<String> stringData = new GenericClass("Getsu");
        // doIt(stringMyData); // ERROR
        // GenericClass<Object> objectData = stringData; // ERROR

        GenericClass<Object> objekData = new GenericClass<>(1000);
        // GenericClass<Object> objectData = stringData; // ERROR

        String stringValue = stringData.getData();
        Object objekValue = objekData.getData();

        System.out.println(stringValue);
        System.out.println(objekValue);

    }

    public static void doIt(GenericClass<Object>objekData){
    //  do nothing
    }

}
