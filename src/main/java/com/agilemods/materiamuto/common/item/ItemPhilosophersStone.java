package com.agilemods.materiamuto.common.item;

import com.agilemods.materiamuto.common.item.prefab.MMItem;

import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemPhilosophersStone extends MMItem{
	
    private IIcon icon;
    
    public ItemPhilosophersStone(){
    	super();
    	setMaxStackSize(1);
    }
    
    @Override
    public String getIcon() {
        return "philosophers_stone";
    }
}
