public class ScentedCandle extends Candle
{
    private String scent;
    private int price; 
    
    void setScent(String scent){
        this.scent = scent;
    }
    String getScent(){
        return scent;
    }

    int getPrice(){
        price = super.height * 3;
        return price;
    }
}
