package net.hwid.mixin;

import net.hwid.Hwid;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 *
 * @Author Vp (https://github.com/herravp)
 * @Author CCarbon1024 made forge version (https://github.com/CCarbon1024)
 * Code is free to use :)
 *
 */

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Inject(at = @At("RETURN"), method = "<init>")
    private void init(CallbackInfo ci) {
        Hwid.init();
    }
}
