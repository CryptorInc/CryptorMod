
package com.cryptor.cryptormod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import com.cryptor.cryptormod.item.ItemCryptorsSoul;
import com.cryptor.cryptormod.ElementsCryptorMod;

@ElementsCryptorMod.ModElement.Tag
public class TabModTab extends ElementsCryptorMod.ModElement {
	public TabModTab(ElementsCryptorMod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmodtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCryptorsSoul.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
