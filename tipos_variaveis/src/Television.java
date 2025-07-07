public class Television {

boolean on;
int channel;
int volume;
public Television() {
    this.on = false;
    this.channel = 11;
    this.volume = 10;
}


public void turnOn (){
       System.out.println("TV has been turned on");
        on= true;
}
public void turnOff(){
    on = false;
    System.out.println("TV has been turned off");
}

public void volumeUp(){

if (volume<=100) {
        volume ++;
        System.out.println(volume );
        }    

}
public void volumeDown(){
    if (volume> 0)
    volume --;
    System.out.println(volume);
}

public void upChannel(){
channel ++;
System.out.println(channel);
}
public void downChannel(){
    channel--;
    System.out.println(channel);
}
public void specificChannel(int num){
channel = num;
System.out.println(channel);
}


}
