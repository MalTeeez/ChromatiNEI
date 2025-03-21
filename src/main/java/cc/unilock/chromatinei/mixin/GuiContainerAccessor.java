package cc.unilock.chromatinei.mixin;

import net.minecraft.client.gui.inventory.GuiContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(GuiContainer.class)
public interface GuiContainerAccessor {
//    RecipeHandlers:
//
//    GuiContainer gui = NEIClientUtils.getGuiContainer();
//    int centerX = ((GuiContainerAccessor) gui).getGuiLeft() + gui.width / 2;
//    int centerY = ((GuiContainerAccessor) gui).getGuiTop() + gui.height / 2;

    @Accessor
    int getGuiLeft();

    @Accessor
    int getGuiTop();
}
