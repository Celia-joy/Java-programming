package  com.marius;
public  class PhoneMain{
    public static void main(String[] args){
    Samsung s = new Samsung();
    IPhone p = new IPhone();
    PhoneService service = new PhoneService();
    service.makeCall(p);
    service.makeCall(s);
    s.call();
    p.call();
    }
}