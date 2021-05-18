public class Candle
{
    private String color;
    protected int height = 0;
    private int price = 0;

    
    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return color;
    }

    void setHeight(int height){
        this.height = height;
    }
    int getHeight(){
        return height;
    }

    int getPrice(){
        price = height * 2;
        return price;
    }
}
