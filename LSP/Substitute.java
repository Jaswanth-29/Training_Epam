package LSP;

interface MsgVideo{
    void msg();
    void Videocall();
}
interface Posting{
    void msg();
    void Videocall();
    void post();
}
class whatsapp implements MsgVideo{
    public void msg(){
        System.out.println("Messaging is possible");
    }
    public void Videocall(){
        System.out.println("Video calling is possible");
    }
}
class Facebook implements Posting{
    public void msg(){
        System.out.println("Messaging is possible");
    }
    public void Videocall(){
        System.out.println("Video calling is possible");
    }
    public void post(){
        System.out.println("Posting is possible");
    }
}
public class Substitute {
    public static void main(String[] args) {
        MsgVideo ob=new whatsapp();
        Posting ob1=new Facebook();
        ob.msg();
        ob.Videocall();
        ob1.msg();
        ob1.Videocall();
        ob1.post();
    }
}
