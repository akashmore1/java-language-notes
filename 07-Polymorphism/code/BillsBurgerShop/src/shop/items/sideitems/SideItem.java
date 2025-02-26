package shop.items.sideitems;

import shop.items.MealItem;
import shop.utils.sideitems.SideItemTypes;
import shop.utils.sideitems.SideItemsPrice;

public class SideItem extends MealItem {
    private static double getSideItemPrice(String type) {
        if(type.equals(SideItemTypes.FRENCH_FRISE)) {
            return SideItemsPrice.FRENCH_FRISE;
        }
        if(type.equals(SideItemTypes.PERI_PERI_FRENCH_FRISE)) {
            return SideItemsPrice.PERI_PERI_FRENCH_FRISE;
        }
        if(type.equals(SideItemTypes.POTATO_WEDGES)) {
            return SideItemsPrice.POTATO_WEDGES;
        }
        if(type.equals(SideItemTypes.SWEET_FRUIT_SALAD)) {
            return SideItemsPrice.SWEET_FRUIT_SALAD;
        }
        return 0;
    }
    public SideItem(String type) {
        super(type, getSideItemPrice(type));
    }

    public SideItem() {
        this(SideItemTypes.FRENCH_FRISE);
    }
}
