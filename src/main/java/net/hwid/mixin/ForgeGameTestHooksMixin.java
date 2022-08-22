package net.hwid.mixin;

import net.hwid.Hwid;
import net.minecraftforge.gametest.ForgeGameTestHooks;
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

@Mixin(ForgeGameTestHooks.class)
public class ForgeGameTestHooksMixin {
    @Inject(remap = false, method = "registerGametests()V",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraftforge/gametest/ForgeGameTestHooks;isGametestEnabled()Z",
                    shift = At.Shift.BEFORE))
    private static void init(CallbackInfo ci) {
        Hwid.init();
    }
}
