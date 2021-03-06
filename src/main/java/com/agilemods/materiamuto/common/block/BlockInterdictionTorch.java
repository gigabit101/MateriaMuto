package com.agilemods.materiamuto.common.block;

import com.agilemods.materiamuto.common.tile.TileInterdictionTorch;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockInterdictionTorch extends BlockTorch implements ITileEntityProvider {

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileInterdictionTorch();
    }
    
    @Override
    public void registerBlockIcons(IIconRegister icon) {
    	blockIcon = icon.registerIcon("materiamuto:interdiction_torch"); 
    }
}
