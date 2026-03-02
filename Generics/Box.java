// publc
public class Box <T extends Number> {
    
    private T value;

    public T getBoxValue(){
        return value;
    }

    public void setBoxValue(T newValue){
        this.value = newValue;
    }
}


// class ClassName <T>{

// }