package latihan;

public class Assignment {
    private double mark = -1;
    public Assignment(){}
    public double getMark() throws NotYetException {
        if (mark==-1) {
            throw new NotYetException("Mark is not yet set");
        }
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
