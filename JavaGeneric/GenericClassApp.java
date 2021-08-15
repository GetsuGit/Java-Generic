package JavaGeneric;

public class GenericClassApp {
    public static void main(String[] args){

        GenericClass<String> stringGC = new GenericClass<>("Getsu Code");
        GenericClass<Integer> integerGC = new GenericClass<>(100);

        String stringValue = stringGC.getData();
        Integer integerValue = integerGC.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
