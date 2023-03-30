public class Main {
    public static void main(String[] args) {

        BasicStructure audi=new BasicStructure();
        audi.color="black";
        audi.model="A3";
        audi.power="5000cc";

        Engine x=new Engine();
        x.cylinders="8";
        x.size="1234cc";
        x.weight="7567k";


        Color col=new Color();
        col.colorLights="True";
        col.colorType="false";
        col.colorWindows="true";

        Lights light=new Lights();
        light.size="15cm";
        light.color="red";
        light.intensity="123445";




    }
}