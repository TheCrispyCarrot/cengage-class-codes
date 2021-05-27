public class TeeShirt
{
   private int orderNumber;
   private String size;
   private String color;
   private double price;
   public void setOrderNumber(int num)
   {
       orderNumber = num;
   }
   public void setSize(String sz)
   {
       size = sz;
   }
   public void setColor(String clr)
   {
       color = clr;
   }
   public int getOrderNumber()
   {
       return orderNumber;
   }
   public String getSize()
   {
       return size;
   }
   public String getColor()
   {
       return color;
   }
   public double getPrice()
   {
       if(size.equals("XXL") || size.equals("XXXL")){
           return 22.99;
       }
       else{
           return 19.99;
       }
   }
}
