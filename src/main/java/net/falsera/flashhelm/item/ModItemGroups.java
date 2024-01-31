package net.falsera.flashhelm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.falsera.flashhelm.FlashHelm;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Helmet_Group = Registry.register(Registries.ITEM_GROUP, new Identifier(FlashHelm.MOD_ID, "tachelm"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tachelm"))
                    .icon(()-> new ItemStack(ModItems.TACHELM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TACHELM);
                        entries.add(ModItems.FLASHLIGHT);
                    }).build());
    public static void RegisterItemGroups(){
        FlashHelm.LOGGER.info("Registering Item Groups for " + FlashHelm.MOD_ID);
    }

}
