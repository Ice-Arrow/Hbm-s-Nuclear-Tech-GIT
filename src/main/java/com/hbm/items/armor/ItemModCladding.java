package com.hbm.items.armor;

import java.util.List;

import com.hbm.handler.ArmorModHandler;
import com.hbm.items.armor.ItemArmorMod;

import com.hbm.util.I18nUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemModCladding extends ItemArmorMod {
	
	public double rad;
	
	public ItemModCladding(double rad) {
		super(ArmorModHandler.cladding, true, true, true, true);
		this.rad = rad;
	}
	
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool) {
		list.add(EnumChatFormatting.YELLOW + "+" + rad + I18nUtil.resolveKeyArray("armorMod.mod.cladding")[0]);
		list.add("");
		super.addInformation(itemstack, player, list, bool);
	}

	@Override
	public void addDesc(List list, ItemStack stack, ItemStack armor) {
		list.add(EnumChatFormatting.YELLOW + "  " + stack.getDisplayName() + " (+" + rad + I18nUtil.resolveKeyArray("armorMod.mod.cladding")[1]);
	}
}
