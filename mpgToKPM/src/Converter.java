
public class Converter {
    public static void main(String[] args){
        System.out.print(mpgToKPM(10));
    }
    public static float mpgToKPM(final float mpg) {
        //mpg * mile / gallon = KPM
        float KPM = mpg * 1.609344f / 4.54609188f;
        String strFloat = String.format("%.2f", KPM);
        strFloat = strFloat.replace(",",".");
        KPM = Float.parseFloat(strFloat);
        return KPM;
    }
}
