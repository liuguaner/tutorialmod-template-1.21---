package com.liuguaner.tutorialmod.block;

import com.liuguaner.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModBlocks {

    //方块有两种形式
    public static void registerBlockItems(String id,Block block){
        Item item=Registry.register(Registries.ITEM,Identifier.of(TutorialMod.MOD_ID,id),new BlockItem(block,new Item.Settings()));
        if(item instanceof BlockItem){
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS,item);
        }
    }


    public static Block register(String id,Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID,id),block);
    }
}
