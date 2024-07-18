

class phone
{
    void call(){
        System.out.println("Calling from phone");
    }
    void sms(){
        System.out.println("Messaging from phone");
    }
}
interface IMusic
{
    void play();
    void suffle();
}
interface  camera
{
    void click();
    void stop();
}
class smartphone extends phone implements camera ,IMusic
{
    public void Vc()
    {
        System.out.println("WOO there is option of video call in Smartphone");
    }
    @Override
    public void click() {
        System.out.println("click to record ");
    }

    @Override
    public void stop() {
        System.out.println("Stop the camera");
    }

    @Override
    public void play() {
        System.out.println("play music");
    }

    @Override
    public void suffle() {
        System.out.println("Suffle the music");
    }
}
public class Inrerfacedemo {
    public static void main(String[] args) {
              smartphone  c = new smartphone();
             c.click();
             c.stop();
              c.Vc();
              c.play();
             c.suffle();
    }
}
