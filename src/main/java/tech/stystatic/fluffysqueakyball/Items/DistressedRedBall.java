package tech.stystatic.fluffysqueakyball;

import net.minecraft.entity.TntEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class DistressedRedBall extends Item {

    private int SqueakCount;
    public DistressedRedBall(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        SqueakCount++;
        System.out.println(SqueakCount);
        if ((SqueakCount % 10) == 0) {
            float f = 4.0F;
            user.getWorld().createExplosion(user, user.getX(), user.getY(), user.getZ(), 4.0F, World.ExplosionSourceType.TNT);
        }
        return super.use(world, user, hand);
    }
}
