import utils.ComparableContent;

public class MyNumber implements ComparableContent<MyNumber> {
    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean isGreater(MyNumber pContent) {
        return this.value > pContent.value;
    }

    @Override
    public boolean isEqual(MyNumber pContent) {
        return this.value == pContent.value;
    }

    @Override
    public boolean isLess(MyNumber pContent) {
        return this.value < pContent.value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    } //
}
