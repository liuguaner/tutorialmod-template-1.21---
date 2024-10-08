package com.liuguaner.tutorialmod.item;

import com.liuguaner.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.item.MinecartItem;

import static net.minecraft.item.Items.*;


public class ModItems {
    //public static final FoodComponent PEACH = (new FoodComponent.Builder()).nutrition(4).saturationModifier(0.3F).build();
    public static final Item PEACH = registerItems("peach",new Item(new Item.Settings().food(ModFoodComponents.PEACH)));
    public static final Item GOLDEN_PEACH = registerItems("golden_peach",new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_PEACH)));

    public static final Item CRYING_OBSIDIAN_SWORD = registerItems("crying_obsidian_sword",new SwordItem(ModToolMaterials.CRYING_OBSIDIAN,new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CRYING_OBSIDIAN,3,-2.4f))));
    public static final Item HOLY_CRYING_OBSIDIAN_PICKAXE = registerItems("holy_crying_obsidian_pickaxe",new PickaxeItem(ModToolMaterials.CRYING_OBSIDIAN1,new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.CRYING_OBSIDIAN1,0.5F,-3.5F))));
    public static final Item CRYING_OBSIDIAN_PICKAXE = registerItems("crying_obsidian_pickaxe",new PickaxeItem(ModToolMaterials.CRYING_OBSIDIAN,new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.CRYING_OBSIDIAN,1.0F,-2.8F))));
    public static final Item CRYING_OBSIDIAN_AXE = registerItems("crying_obsidian_axe",new AxeItem(ModToolMaterials.CRYING_OBSIDIAN,new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.CRYING_OBSIDIAN,5.5F,-3.0f))));
    public static final Item CRYING_OBSIDIAN_SHOVEL = registerItems("crying_obsidian_shovel",new ShovelItem(ModToolMaterials.CRYING_OBSIDIAN,new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.CRYING_OBSIDIAN,1.5F,-3.0f))));
    public static final Item CRYING_OBSIDIAN_HOE = registerItems("crying_obsidian_hoe",new HoeItem(ModToolMaterials.CRYING_OBSIDIAN,new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.CRYING_OBSIDIAN,1.0F,-3.0f))));

    public static final Item LAPIS_LAZULI_SWORD = registerItems("lapis_lazuli_sword",new SwordItem(ModToolMaterials.LAPIS_LAZULI,new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LAPIS_LAZULI,3,-2.5f))));
    public static final Item LAPIS_LAZULI_PICKAXE = registerItems("lapis_lazuli_pickaxe",new PickaxeItem(ModToolMaterials.LAPIS_LAZULI,new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LAPIS_LAZULI,1.0F,-2.9F))));
    public static final Item LAPIS_LAZULI_AXE = registerItems("lapis_lazuli_axe",new AxeItem(ModToolMaterials.LAPIS_LAZULI,new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.LAPIS_LAZULI,5.5F,-3.2f))));
    public static final Item LAPIS_LAZULI_SHOVEL = registerItems("lapis_lazuli_shovel",new ShovelItem(ModToolMaterials.LAPIS_LAZULI,new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LAPIS_LAZULI,1.5F,-3.1f))));
    public static final Item LAPIS_LAZULI_HOE = registerItems("lapis_lazuli_hoe",new HoeItem(ModToolMaterials.LAPIS_LAZULI,new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.LAPIS_LAZULI,1.0F,-3.1f))));


    public static final Item EMERALD_SWORD = registerItems("emerald_sword", new SwordItem(ModToolMaterials.EMERALD,new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.EMERALD,3,-2.0f))));
    public static final Item EMERALD_PICKAXE = registerItems("emerald_pickaxe",new PickaxeItem(ModToolMaterials.EMERALD,new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.EMERALD,1.0F,-2.5F))));
    public static final Item EMERALD_AXE = registerItems("emerald_axe",new AxeItem(ModToolMaterials.EMERALD,new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.EMERALD,5.5F,-2.8f))));
    public static final Item EMERALD_SHOVEL = registerItems("emerald_shovel",new ShovelItem(ModToolMaterials.EMERALD,new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.EMERALD,1.5F,-2.8f))));
    public static final Item EMERALD_HOE = registerItems("emerald_hoe",new HoeItem(ModToolMaterials.EMERALD,new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.EMERALD,1.0F,-2.8f))));

    private static Item registerItems(String id,Item item) {
        return Registry.register(Registries.ITEM,Identifier.of(TutorialMod.MOD_ID,id),item);
    }

    public static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(PEACH);
        fabricItemGroupEntries.add(GOLDEN_PEACH);
    }



    public static void registerModItems(){
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToIG);

        //食品与饮品类注册
        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(GOLDEN_PEACH->{GOLDEN_PEACH.addAfter(Items.APPLE,ModItems.GOLDEN_PEACH);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(PEACH->{PEACH.addAfter(Items.APPLE,ModItems.PEACH);});


        //工具类注册

        //1.绿宝石类
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(EMERALD_SWORD->{EMERALD_SWORD.addAfter(Items.IRON_SWORD,ModItems.EMERALD_SWORD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(EMERALD_PICKAXE->{EMERALD_PICKAXE.addAfter(Items.IRON_PICKAXE,ModItems.EMERALD_PICKAXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(EMERALD_AXE->{EMERALD_AXE.addAfter(Items.IRON_AXE,ModItems.EMERALD_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(EMERALD_SHOVEL->{EMERALD_SHOVEL.addAfter(Items.IRON_SHOVEL,ModItems.EMERALD_SHOVEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(EMERALD_HOE->{EMERALD_HOE.addAfter(Items.IRON_HOE,ModItems.EMERALD_HOE);});

        //2.青金石类
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(LAPIS_LAZULI_SWORD->{LAPIS_LAZULI_SWORD.addAfter(Items.IRON_SWORD,ModItems.LAPIS_LAZULI_SWORD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(LAPIS_LAZULI_AXE->{LAPIS_LAZULI_AXE.addAfter(Items.IRON_AXE,ModItems.LAPIS_LAZULI_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(LAPIS_LAZULI_PICKAXE->{LAPIS_LAZULI_PICKAXE.addAfter(Items.IRON_PICKAXE,ModItems.LAPIS_LAZULI_PICKAXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(LA0PIS_LAZULI_SHOVEL->{LA0PIS_LAZULI_SHOVEL.addAfter(IRON_SHOVEL,ModItems.LAPIS_LAZULI_SHOVEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(LAPIS_LAZULI_HOE->{LAPIS_LAZULI_HOE.addAfter(IRON_HOE,ModItems.LAPIS_LAZULI_HOE);});

        //3.黑曜石类



        //4.哭泣黑曜石类
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(CRYING_OBSIDIAN_SWORD->{CRYING_OBSIDIAN_SWORD.addAfter(Items.DIAMOND_SWORD,ModItems.CRYING_OBSIDIAN_SWORD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(CRYING_OBSIDIAN_AXE->{CRYING_OBSIDIAN_AXE.addAfter(DIAMOND_AXE,ModItems.CRYING_OBSIDIAN_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(CRYING_OBSIDIAN_PICKAXE->{CRYING_OBSIDIAN_PICKAXE.addAfter(DIAMOND_PICKAXE,ModItems.CRYING_OBSIDIAN_PICKAXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(CRYING_OBSIDIAN_SHOVEL->{CRYING_OBSIDIAN_SHOVEL.addAfter(DIAMOND_SHOVEL,ModItems.CRYING_OBSIDIAN_SHOVEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(CRYING_OBSIDIAN_HOE->{CRYING_OBSIDIAN_HOE.addAfter(DIAMOND_HOE,ModItems.CRYING_OBSIDIAN_HOE);});
        */




        TutorialMod.LOGGER.info("this mod is running");
    }
}
