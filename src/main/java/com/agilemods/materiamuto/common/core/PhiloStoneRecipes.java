package com.agilemods.materiamuto.common.core;

import org.apache.commons.codec.language.bm.Rule.Phoneme;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class PhiloStoneRecipes {
	
	    private static ItemStack philoStoneStack = new ItemStack(MMItems.philoStone, 1, OreDictionary.WILDCARD_VALUE);
	    private static Item philoStone = MMItems.philoStone;
	    
	    private static ItemStack anyWood = new ItemStack(Blocks.log, 1, OreDictionary.WILDCARD_VALUE);

	    
		public static void init()
		{
			//GoldBlock To DiamondBlock and Back
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block), philoStoneStack, Blocks.gold_block, Blocks.gold_block, Blocks.gold_block, Blocks.gold_block);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gold_block,4), philoStoneStack, Blocks.diamond_block);
			
			//Gold To Diamond and Diamond to Gold
			GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), philoStoneStack, Items.gold_ingot, Items.gold_ingot, Items.gold_ingot, Items.gold_ingot);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot,4), philoStoneStack, Items.diamond);

			//IronBlock To GoldBlock and Back
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gold_block), philoStoneStack, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block, Blocks.iron_block);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot,8), philoStoneStack, Items.gold_ingot);
			
			//Iron To Gold and Gold To Iron
			GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot), philoStoneStack, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot,8), philoStoneStack, Items.gold_ingot);
			
			//Iron To Ender Perl and Back
			GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl), philoStoneStack, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot,4), philoStoneStack, Items.ender_pearl);
			
			//Wood To Obsidian
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian), philoStoneStack, anyWood, anyWood);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.log,2), philoStoneStack, Blocks.obsidian);
			
			//Cobble To Flint
			GameRegistry.addShapelessRecipe(new ItemStack(Items.flint), philoStoneStack, Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone,4), philoStoneStack, Items.flint);
			
			//Sticks To Planks
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks), philoStoneStack, Items.stick, Items.stick);
			
			//Clay Block To Clay
			GameRegistry.addShapelessRecipe(new ItemStack(Items.clay_ball,4), philoStoneStack, Blocks.clay);
			
			//SandStone 2 Sand
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand,4), philoStoneStack, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand);
			
			//Dirt To Cobble To Sand To Dirt
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone), philoStoneStack, Blocks.dirt);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand), philoStoneStack, Blocks.cobblestone);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt), philoStoneStack, Blocks.sand);
			
			//Dyes	
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,0), philoStoneStack, new ItemStack(Items.dye,1,15));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,1), philoStoneStack, new ItemStack(Items.dye,1,0));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,2), philoStoneStack, new ItemStack(Items.dye,1,1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,3), philoStoneStack, new ItemStack(Items.dye,1,2));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,4), philoStoneStack, new ItemStack(Items.dye,1,3));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,5), philoStoneStack, new ItemStack(Items.dye,1,4));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,6), philoStoneStack, new ItemStack(Items.dye,1,5));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,7), philoStoneStack, new ItemStack(Items.dye,1,6));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,8), philoStoneStack, new ItemStack(Items.dye,1,7));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,9), philoStoneStack, new ItemStack(Items.dye,1,8));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,10), philoStoneStack, new ItemStack(Items.dye,1,9));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,11), philoStoneStack, new ItemStack(Items.dye,1,10));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,12), philoStoneStack, new ItemStack(Items.dye,1,11));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,13), philoStoneStack, new ItemStack(Items.dye,1,12));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,14), philoStoneStack, new ItemStack(Items.dye,1,13));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,1,15), philoStoneStack, new ItemStack(Items.dye,1,14));
			
			//Fish
			GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,1), philoStoneStack, new ItemStack(Items.fish,1,0));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,2), philoStoneStack, new ItemStack(Items.fish,1,1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,3), philoStoneStack, new ItemStack(Items.fish,1,2));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.fish,1,0), philoStoneStack, new ItemStack(Items.fish,1,3));

			philoStone.setContainerItem(philoStone);
		}

}
