package bridgeMetod;

public class Radio implements Device{
    private boolean on=false;
    private int volume=10;
    private int channel=1;




    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on=true;

    }

    @Override
    public void disable() {
        on=false;

    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if(percent>50){
            volume=50;
        }
        else if(percent<0){
            volume=0;
        }
        else{
            volume=percent;
        }

    }

    @Override
    public int getChanel() {
        return channel;
    }

    @Override
    public void setChanel(int chanel) {
        this.channel=chanel;

    }

    @Override
    public void printStatus() {
        System.out.println("Radyo");
        System.out.println("Status:"+on);
        System.out.println("Kanal:"+channel);
        System.out.println("Ses:"+volume);

    }
}
