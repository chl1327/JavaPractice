package TkJava.TKU19;

import net.mindview.util.Countries;
import net.mindview.util.Enums;

public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class),
    FASTFOOD(Food.Fastfood.class);
    private Food[] values;
    private Course(Class<? extends Food> kind){
        values = kind.getEnumConstants();
    }
    public Food randomSelection(){
        return Enums.random(values);
    }
}
