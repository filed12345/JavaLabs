package lab11.lab20_8;

public class GenericClassPair <F,S>{
    F value;
    S value2;

    public void setValue(F value) {
        this.value = value;
    }

    public void setValue2(S value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "GenericClassPair{" +
                "value=" + value +
                ", value2=" + value2 +
                '}';
    }
}
