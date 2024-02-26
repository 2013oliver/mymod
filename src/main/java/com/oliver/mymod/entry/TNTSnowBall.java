package com.oliver.mymod.entry;

import com.oliver.mymod.MyMod;
import com.oliver.mymod.item.TNTSnowBallItem;
import net.minecraft.client.renderer.entity.TntRenderer;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class TNTSnowBall extends Snowball {
    LivingEntity le;

    public TNTSnowBall(EntityType<? extends Snowball> p_37391_, Level p_37392_) {
        super(p_37391_, p_37392_);
    }

    public TNTSnowBall(Level p_37399_, LivingEntity p_37400_) {
        super(p_37399_, p_37400_);
        this.le = p_37400_;
    }

    protected Item getDefaultItem() {
        return MyMod.TNTSNOW_ITEM.get();
    }

    public TNTSnowBall(Level p_37394_, double p_37395_, double p_37396_, double p_37397_) {
        super(p_37394_, p_37395_, p_37396_, p_37397_);
    }

    protected void onHitEntity(EntityHitResult p_37404_) {
        PrimedTnt tnt = new PrimedTnt(this.level(),getX(),getY(),getZ(),this.le);
        tnt.setFuse(0);
        this.level().addFreshEntity(tnt);
        this.discard();;
    }

    protected void onHit(HitResult p_37406_) {
        if (!this.level().isClientSide) {
            PrimedTnt tnt = new PrimedTnt(this.level(),getX(),getY(),getZ(),this.le);
            tnt.setFuse(0);
            this.level().addFreshEntity(tnt);
            this.discard();
        }
    }
}
