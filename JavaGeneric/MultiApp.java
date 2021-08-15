package JavaGeneric;

public class MultiApp {
    public static void main(String[] args){

      MultiParamType<String, Integer> pair = new MultiParamType<>("User", 100);
      System.out.println(pair.getFirst());
      System.out.println(pair.getSecond());



    }
}
