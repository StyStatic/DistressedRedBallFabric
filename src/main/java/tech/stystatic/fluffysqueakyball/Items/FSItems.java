package tech.stystatic.fluffysqueakyball.Items;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tech.stystatic.fluffysqueakyball.FluffySqueakyBall;


public class FSItems {

    public static final Item AdvancedWoodSword = registerItem("distressed_red_ball",
           new DistressedRedBall(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FluffySqueakyBall.MODID, name), item);
    }

    public static void registerFSItems() {
        System.out.println("Registering Mod Items for " + FluffySqueakyBall.MODID);
    }
}
