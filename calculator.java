import java.util.Scanner;

class calculator{
   
   Float add(Float a, Float b){
     return a+b;
   }
   Float sub(Float a, Float b){
    return a-b;
   }
   Float mul(Float a, Float b){
    return a*b;
   }
   Float div(Float a, Float b){
    return a/b;
   }
}
class triangle extends calculator{

  float area(float base,float height){
  return (float) (0.5*mul(base, height));
  }
}

class square extends calculator{
  float areaSq(float side){
    return (float) (mul(side,side));
    }
}
class Main{
  public static void main (String[] args){
    Float a;
    Float b;
    float base;
    float height;
    float side;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the 1st number: ");
      a=sc.nextFloat();
      System.out.println("Enter the 2nd number: ");
      b=sc.nextFloat();
      System.out.println("Enter the base of the triangle: ");
      base=sc.nextFloat();
      System.out.println("Enter the height of the triangle: ");
      height=sc.nextFloat();
      System.out.println("Enter the side of the square: ");
      side=sc.nextFloat();
    }
    calculator c =new calculator();
    triangle t=new triangle();
    square s =new square();
    System.out.println("Addition of 2 numbers: "+c.add(a,b));
    System.out.println("substraction of 2 numbers: "+c.sub(a,b));
    System.out.println("multiplication of 2 numbers: "+c.mul(a,b));
    System.out.println("division of 2 numbers: "+c.div(a,b));
    System.out.println("area of the triangle: "+t.area(base, height));
    System.out.println("area of square: "+s.areaSq(side));
}
}

