package com.github.tomasitobambito.mixin;

import net.minecraft.block.IceBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(IceBlock.class)
public class NoIceMeltMixin {
    @Inject(at = @At("HEAD"), method = "randomTick", cancellable = true)
    private void noMelt(CallbackInfo ci) {
        ci.cancel();
    }
}
