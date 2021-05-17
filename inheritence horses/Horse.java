public class Horse
{
   private String name;
   private String color;
   private int birthYear;
   void setName(String name){
       this.name = name;
   }
   String getName(){
       return name;
   }

   void setColor(String color){
       this.color = color;
   }
   String getColor(){
       return color;
   }
   
   void setBirthYear(int birthYear){
       this.birthYear = birthYear;
   }
   int getBirthYear(){
       return birthYear;
   }
}
