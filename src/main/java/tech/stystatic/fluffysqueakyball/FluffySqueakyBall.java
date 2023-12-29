package tech.stystatic.fluffysqueakyball;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tech.stystatic.fluffysqueakyball.Items.FSItems;

public class FluffySqueakyBall implements ModInitializer {
    public static String MODID = "fluffysqueakyball";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public static final Identifier SQUEAK_ID = new Identifier("fluffysqueakyball:squeak");
    public static SoundEvent SQUEAK_EVENT = SoundEvent.of(SQUEAK_ID);

    @Override
    public void onInitialize() {
        FSItems.registerFSItems();
        Registry.register(Registries.SOUND_EVENT, FluffySqueakyBall.SQUEAK_ID, SQUEAK_EVENT);
    }
}
