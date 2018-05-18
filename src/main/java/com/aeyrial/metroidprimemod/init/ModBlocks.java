package com.aeyrial.metroidprimemod.init;

import java.util.ArrayList;
import java.util.List;

import com.aeyrial.metroidprimemod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block PHAZON_BLUE_BLOCK = new BlockBase("phazon_blue_block", Material.REDSTONE_LIGHT);
}
