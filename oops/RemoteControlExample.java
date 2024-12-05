package oops;

interface Remote {
    void on(); 
    void off(); 
}


class TV implements Remote {
    @Override
    public void on() {
        System.out.println("TV is now ON");
    }

    @Override
    public void off() {
        System.out.println("TV is now OFF");
    }
}

class Fan implements Remote {
    @Override
    public void on() {
        System.out.println("Fan is now ON");
    }

    @Override
    public void off() {
        System.out.println("Fan is now OFF");
    }
}


public class RemoteControlExample {
    public static void main(String[] args) {
        Remote tv = new TV();
        Remote fan = new Fan();
        tv.on();
        tv.off();
        
        fan.on();
        fan.off();
    }
}
