
import java.awt.print.Printable;

public interface Test {
    
    void print();

}

class MyNumber extends Number implements Test{


    private final int value;

    public myNumber (int value){
        this.value = value;
    }

    @Override
    public void print(){
        System.out.println("MyNumber" + value);
    }

    @Override
    public int intValue(){
        return value;
    }

    @Override
    public long longValue(){
        return value;
    }

    public float floatNumber(){
        return value;
    }

    public double doubleNumber(){
        return value;
    }

}

class Boxx<T extends Number & Test>{

}
