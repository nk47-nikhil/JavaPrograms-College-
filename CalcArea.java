abstract class GraphicObject{
    public abstract double calculateArea();

}
class circle extends GraphicObject{
   float rad;
   circle(float rad){
      this.rad=rad;
   } 
  public double calculateArea(){
    return 3.14*rad*rad;
  }

}

class rectangle extends GraphicObject{
  float l,b;
  rectangle(float l,float b){
    this.l=l;
    this.b=b;
  }

  public double calculateArea(){
    return l*b;
  }
}

class CalcArea{
    public static void main(String [] args){
        GraphicObject c=new circle(5.0234f);
        System.out.printf(("%.2f"),c.calculateArea());
        GraphicObject r=new rectangle(5.0f,6.0f);
        System.out.println("\nRec Area= "+r.calculateArea());


    }
}
