package bridgeMetod;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Remote {

    protected Device device;
    public Remote(){

    }
    public Remote(Device device){
        this.device=device;
    }

    public void togglePower(){
        System.out.println("Toggle Power");
        if(device.isEnabled()){
            device.disable();
        }
        else{
            device.enable();
        }
    }

    public void volumeDown(){
        System.out.println("Volume Down");
        device.setVolume(device.getVolume()-10);

    }
    public void volumeUP(){
        System.out.println("volume up");
        device.setVolume(device.getVolume()+10);
    }
    public void chanelUp(){
        System.out.println("Chanel Up");
        device.setChanel(device.getChanel()+1);
    }
    public void chanelDown(){
        System.out.println("Chanel Down");
        device.setChanel(device.getChanel()-1);
    }


}
