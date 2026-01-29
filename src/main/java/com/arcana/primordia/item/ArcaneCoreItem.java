package com.arcana.primordia.item;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ArcaneCoreItem extends Item {

    private static final String ARCANA = "Arcana";
    private static final int MAX_ARCANA = 100;

    public ArcaneCoreItem(Properties props) {
        super(props);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (!level.isClientSide) {
            CompoundTag tag = stack.getOrCreateTag();
            int arcana = tag.getInt(ARCANA);

            if (arcana < MAX_ARCANA) {
                tag.putInt(ARCANA, Math.min(arcana + 5, MAX_ARCANA));
            }
        }

        return InteractionResultHolder.success(stack);
    }
}
