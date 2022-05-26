package OCP;

interface A {
void  purpose();
void sides();
}
interface B {
    void  purpose();
}

class triangle implements B{
    public void purpose(){
        System.out.println("Triangle is formed");
    }
}
class Rectangle implements A{
    public void purpose(){
        System.out.println("Rectangle is formed");
    }
    public void sides(){
        System.out.println("4 sides are present");
    }
}
public class shapes{
    public static void main(String[] args) {
        A obj=new Rectangle();
        obj.purpose();
        obj.sides();
    }
}