package com.agilemods.materiamuto.common.item;

import com.agilemods.materiamuto.MateriaMuto;
import com.agilemods.materiamuto.api.IKeyBound;
import com.agilemods.materiamuto.common.item.prefab.MMItem;
import com.agilemods.materiamuto.common.lib.LibKey;
import com.agilemods.materiamuto.common.network.GuiHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemPhilosophersStone extends MMItem implements IKeyBound {
	
    private IIcon icon;
    
    public ItemPhilosophersStone(){
    	super();
    	setMaxStackSize(1);
    }
    
    @Override
    public String getIcon() {
        return "philosophers_stone";
    }

	@Override
	public void doKeyAction(EntityPlayer entityPlayer, ItemStack itemStack, LibKey key){
		GuiHandler.Type.GUI_PHILO_CRAFTING.openGui(entityPlayer);
	}
}
