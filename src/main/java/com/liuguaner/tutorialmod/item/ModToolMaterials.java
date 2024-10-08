package com.liuguaner.tutorialmod.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial{
    EMERALD(BlockTags.INCORRECT_FOR_IRON_TOOL, 451, 10.0F, 2.5F, 14, () -> Ingredient.ofItems(Items.EMERALD)),
    LAPIS_LAZULI(BlockTags.INCORRECT_FOR_IRON_TOOL, 231, 6.0F, 2.5F, 32, () -> Ingredient.ofItems(Items.LAPIS_LAZULI)),
    CRYING_OBSIDIAN(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1791, 8.0F, 3.5F, 10, () -> Ingredient.ofItems(Items.CRYING_OBSIDIAN)),
    CRYING_OBSIDIAN1(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 10000, 24.0F, 1F, 50, () -> Ingredient.ofItems(Items.NETHER_STAR));


    private final TagKey<Block> inverseTag;
    private final int itemDurability ;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {


        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
