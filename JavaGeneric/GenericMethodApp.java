package JavaGeneric;

public class GenericMethodApp {
    public static void main(String[] args){

    String[] names = {"Getsu", "Code,", "Code"};
    Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(GenericMethod.<String>data(names));
        System.out.println(GenericMethod.data(numbers));

    }
}
