package bridgeMetod;

public interface Device {

    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int percent);
    int getChanel();
    void setChanel(int chanel);
    void printStatus();

    // bu sınıftan implemente olan iki sınıf var
    // TV ve Radio


}
