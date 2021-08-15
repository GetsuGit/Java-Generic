package JavaGeneric;

public class BoundedParameterClass {
    public static void main(String[] args){

     NumberData<Integer> integerData = new NumberData<>(1);
     NumberData<Long> longData = new NumberData<>(1L);

     // NumberData<String> stringData = new NumberData<String>("GETSU"); ERROR

    }

    public static class NumberData<T extends Number>{

        private T data;

        public NumberData(T data){
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
