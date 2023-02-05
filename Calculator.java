/**
 *Класс с конструктором, получения арифметических вычислений, заданных в классе Present
 */
public class Calculator implements I_Model {
    private double x,y;
//    int sign;
    @Override
    public void setNum(double value, double val) {
        this.x=value;
        this.y=val;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double result (int sign){
        switch (sign){
            case 1:
                return getX()+getY();
            case 2:
                return getX()-getY();
            case 3:
                return getX()*getY();
            case 4:
                return getX()/getY();
            default:
                return 0;
        }

    }





}
