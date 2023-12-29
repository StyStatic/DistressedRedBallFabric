package tech.stystatic.fluffysqueakyball.Items;

import net.minecraft.entity.TntEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import tech.stystatic.fluffysqueakyball.FluffySqueakyBall;

public class DistressedRedBall extends Item {

    private int SqueakCount;
    public DistressedRedBall(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient()) {
            SqueakCount++;
            System.out.println(SqueakCount);

            world.playSound(
                    null,
                    user.getBlockPos(),
                    FluffySqueakyBall.SQUEAK_EVENT,
                    SoundCategory.PLAYERS,
                    1f,
                    1f
            );

            if ((SqueakCount % 10) == 0) {
                float f = 4.0F;
                user.getWorld().createExplosion(null, user.getX(), user.getY(), user.getZ(), 4.0F, World.ExplosionSourceType.BLOCK);
            }
        }

        return super.use(world, user, hand);
    }
}
