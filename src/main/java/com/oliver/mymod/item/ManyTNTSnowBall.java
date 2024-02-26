package com.oliver.mymod.item;

import com.oliver.mymod.entry.TNTSnowBall;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SnowballItem;
import net.minecraft.world.level.Level;

public class ManyTNTSnowBall extends SnowballItem {
    public ManyTNTSnowBall(Properties p_43140_) {
        super(p_43140_);
    }

    public InteractionResultHolder<ItemStack> use(Level p_43142_, Player p_43143_, InteractionHand p_43144_) {
        ItemStack itemstack = p_43143_.getItemInHand(p_43144_);
        p_43142_.playSound((Player)null, p_43143_.getX(), p_43143_.getY(), p_43143_.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (p_43142_.getRandom().nextFloat() * 0.4F + 0.8F));
        if (!p_43142_.isClientSide) {
            TNTSnowBall snowball = new TNTSnowBall(p_43142_, p_43143_);
            TNTSnowBall snowball1 = new TNTSnowBall(p_43142_, p_43143_);
            TNTSnowBall snowball2 = new TNTSnowBall(p_43142_, p_43143_);
            TNTSnowBall snowball3 = new TNTSnowBall(p_43142_, p_43143_);
            TNTSnowBall snowball4 = new TNTSnowBall(p_43142_, p_43143_);
            TNTSnowBall snowball5 = new TNTSnowBall(p_43142_, p_43143_);
            TNTSnowBall snowball6 = new TNTSnowBall(p_43142_, p_43143_);
            TNTSnowBall snowball7 = new TNTSnowBall(p_43142_, p_43143_);
            TNTSnowBall snowball8 = new TNTSnowBall(p_43142_, p_43143_);
            snowball.setItem(itemstack);
            snowball1.setItem(itemstack);
            snowball2.setItem(itemstack);
            snowball3.setItem(itemstack);
            snowball4.setItem(itemstack);
            snowball5.setItem(itemstack);
            snowball6.setItem(itemstack);
            snowball7.setItem(itemstack);
            snowball8.setItem(itemstack);
            snowball.shootFromRotation(p_43143_, p_43143_.getXRot(), p_43143_.getYRot(), 0.0F, 1.5F, 1.0F);
            snowball1.shootFromRotation(p_43143_, p_43143_.getXRot() + 5, p_43143_.getYRot(), 0.0F, 1.5F, 1.0F);
            snowball2.shootFromRotation(p_43143_, p_43143_.getXRot() - 5, p_43143_.getYRot(), 0.0F, 1.5F, 1.0F);
            snowball3.shootFromRotation(p_43143_, p_43143_.getXRot(), p_43143_.getYRot() + 5, 0.0F, 1.5F, 1.0F);
            snowball4.shootFromRotation(p_43143_, p_43143_.getXRot(), p_43143_.getYRot() - 5, 0.0F, 1.5F, 1.0F);
            snowball5.shootFromRotation(p_43143_, p_43143_.getXRot() + 5, p_43143_.getYRot() - 5, 0.0F, 1.5F, 1.0F);
            snowball6.shootFromRotation(p_43143_, p_43143_.getXRot() - 5, p_43143_.getYRot() + 5, 0.0F, 1.5F, 1.0F);
            snowball7.shootFromRotation(p_43143_, p_43143_.getXRot() + 5, p_43143_.getYRot() + 5, 0.0F, 1.5F, 1.0F);
            snowball8.shootFromRotation(p_43143_, p_43143_.getXRot() - 5, p_43143_.getYRot() - 5, 0.0F, 1.5F, 1.0F);
            p_43142_.addFreshEntity(snowball);
            p_43142_.addFreshEntity(snowball1);
            p_43142_.addFreshEntity(snowball2);
            p_43142_.addFreshEntity(snowball3);
            p_43142_.addFreshEntity(snowball4);
            p_43142_.addFreshEntity(snowball5);
            p_43142_.addFreshEntity(snowball6);
            p_43142_.addFreshEntity(snowball7);
            p_43142_.addFreshEntity(snowball8);
        }

        p_43143_.awardStat(Stats.ITEM_USED.get(this));
        if (!p_43143_.getAbilities().instabuild) {
            itemstack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(itemstack, p_43142_.isClientSide());
    }
}
