package model;

public class Animal {
   private String type;
   private Integer age;
   private Integer weight;
   private Integer height;

   public Animal(String type, Integer age, Integer weight, Integer height){
       this.type=type;
       this.age=age;
       this.weight=weight;
       this.height=height;
   }

    public String getType() {
        return type;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }
}
