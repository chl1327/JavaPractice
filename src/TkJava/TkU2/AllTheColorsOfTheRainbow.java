package TkJava.TkU2;

/**
 * Created by chl1327 on 2018/8/16.
 */
public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors=newHue;
    }
    public static void main(String[] args){
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        allTheColorsOfTheRainbow.changeTheHueOfTheColor(2);
        System.out.println(allTheColorsOfTheRainbow.anIntegerRepresentingColors);
        allTheColorsOfTheRainbow.changeTheHueOfTheColor(3);
        System.out.println(allTheColorsOfTheRainbow.anIntegerRepresentingColors);
    }
}
