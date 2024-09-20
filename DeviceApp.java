public class DeviceApp{
    public static void main(String[] args){

        Laptop lappy = new Laptop();
        PowerOutlet lappyPO = new LaptopAdapter(lappy);

        Refrigerator ref = new Refrigerator();
        PowerOutlet refPO = new RefrigeratorAdapter(ref);

        SmartphoneCharger phone = new SmartphoneCharger();
        PowerOutlet phonePO = new SmartphoneAdapter(phone);

        System.out.println(lappyPO.plugIn());
        System.out.println(refPO.plugIn());
        System.out.println(phonePO.plugIn());

        

    }
}