package com.liuguaner.tutorialmod.item;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.item.ItemGroup;
import com.liuguaner.tutorialmod.TutorialMod;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class ModItemGroups {
    /*public static final RegistryKey<ItemGroup> TUTORIAL_GROUP = register("tutorial_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP,Identifier.of(TutorialMod.MOD_ID));
    }
    public static void registerModItemGroups(){
        Registry.register(Registries.ITEM_GROUP,TUTORIAL_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP,7)
                        .displayName(Text.translatable("itemGroup.tutorial_group"))
                        .icon(()-> new ItemStack(ModItems.PEACH))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.PEACH);}).build());

    }*/
    //以上是繁琐的写法

    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP,Identifier.of(TutorialMod.MOD_ID,"tutorial_group"),
            ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.tutorial_group")).icon(()->{return new ItemStack(ModItems.CRYING_OBSIDIAN_SWORD);}).entries((displayContext, entries) -> {
                entries.add(ModItems.PEACH);
                entries.add(ModItems.GOLDEN_PEACH);


                entries.add(ModItems.LAPIS_LAZULI_SWORD);
                entries.add(ModItems.LAPIS_LAZULI_AXE);
                entries.add(ModItems.LAPIS_LAZULI_PICKAXE);
                entries.add(ModItems.LAPIS_LAZULI_SHOVEL);
                entries.add(ModItems.LAPIS_LAZULI_HOE);


                entries.add(ModItems.EMERALD_SWORD);
                entries.add(ModItems.EMERALD_AXE);
                entries.add(ModItems.EMERALD_PICKAXE);
                entries.add(ModItems.EMERALD_SHOVEL);
                entries.add(ModItems.EMERALD_HOE);


                entries.add(ModItems.CRYING_OBSIDIAN_SWORD);
                entries.add(ModItems.CRYING_OBSIDIAN_AXE);
                entries.add(ModItems.CRYING_OBSIDIAN_PICKAXE);
                entries.add(ModItems.HOLY_CRYING_OBSIDIAN_PICKAXE);
                entries.add(ModItems.CRYING_OBSIDIAN_SHOVEL);
                entries.add(ModItems.CRYING_OBSIDIAN_HOE);

                //原版物品也可加入这个新的物品栏里r
            }).build());
    public static void registerModItemGroups(){
        TutorialMod.LOGGER.info("ModItemGroups is running");
    }
}
