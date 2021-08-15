package JavaGeneric;

public class GenericClass<T> {

    private T data;

    public GenericClass(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }
}
