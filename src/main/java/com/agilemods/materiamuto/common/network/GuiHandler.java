package com.agilemods.materiamuto.common.network;

import com.agilemods.materiamuto.client.gui.GuiAlchemicalChest;
import com.agilemods.materiamuto.common.inventory.ContainerAlchemicalChest;
import com.agilemods.materiamuto.common.tile.TileAlchemicalChest;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import com.agilemods.materiamuto.MateriaMuto;
import com.agilemods.materiamuto.client.gui.GuiAlchemicalBag;
import com.agilemods.materiamuto.client.gui.GuiCondenser;
import com.agilemods.materiamuto.client.gui.GuiCrafting;
import com.agilemods.materiamuto.common.inventory.ContainerAlchemicalBag;
import com.agilemods.materiamuto.common.inventory.ContainerCondenser;
import com.agilemods.materiamuto.common.inventory.ContainerCrafting;
import com.agilemods.materiamuto.common.tile.TileCondenser;

public class GuiHandler implements IGuiHandler {

    public static enum Type {
        GUI_ALCHEMICAL_BAG,
        GUI_CONDENSER,
        GUI_PHILO_CRAFTING,
        GUI_ALCHEMICAL_CHEST;

        public void openGui(EntityPlayer entityPlayer) {
            openGui(entityPlayer, 0, 0, 0);
        }

        public void openGui(EntityPlayer entityPlayer, int x, int y, int z) {
            entityPlayer.openGui(MateriaMuto.instance, this.ordinal(), entityPlayer.worldObj, x, y, z);
        }

        private static Type[] values;

        public static Type[] all() {
            if (values == null) {
                values = values();
            }
            return values;
        }

        public static Type get(int ordinal) {
            return all()[ordinal % all().length];
        }
    }

    @Override
    public Object getServerGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z) {
        Type type = Type.get(id);
        switch (type) {
            case GUI_ALCHEMICAL_BAG:
                return new ContainerAlchemicalBag(entityPlayer, entityPlayer.getHeldItem());
            case GUI_CONDENSER:
                return new ContainerCondenser(entityPlayer, (TileCondenser) world.getTileEntity(x, y, z));
            case GUI_ALCHEMICAL_CHEST:
                return new ContainerAlchemicalChest(entityPlayer, (TileAlchemicalChest) world.getTileEntity(x, y, z));
            case GUI_PHILO_CRAFTING:
            	return new ContainerCrafting(entityPlayer.inventory, world);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z) {
        Type type = Type.get(id);
        switch (type) {
            case GUI_ALCHEMICAL_BAG:
                return new GuiAlchemicalBag(entityPlayer, entityPlayer.getHeldItem());
            case GUI_CONDENSER:
                return new GuiCondenser(entityPlayer, (TileCondenser) world.getTileEntity(x, y, z));
            case GUI_ALCHEMICAL_CHEST:
                return new GuiAlchemicalChest(entityPlayer, (TileAlchemicalChest) world.getTileEntity(x, y, z));
            case GUI_PHILO_CRAFTING:
            	return new GuiCrafting(entityPlayer.inventory, world);
        }
        return null;
    }
}
