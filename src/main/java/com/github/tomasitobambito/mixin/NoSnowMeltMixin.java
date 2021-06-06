package com.github.tomasitobambito.mixin;

import net.minecraft.block.SnowBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SnowBlock.class)
public class NoSnowMeltMixin {
    @Inject(at = @At("HEAD"), method = "randomTick", cancellable = true)
    private void noMelt(CallbackInfo ci) {
        ci.cancel();
    }
}
