package com.gqt.shoppingcart.main;

import com.gqt.shoppingcart.HomeAppliances.HomeAppliancesApp;
import com.gqt.shoppingcart.electronics.ElectronicsApp;

public class ShoppingCartApp {
public static void main(String[] args) {
	ElectronicsApp eap = new ElectronicsApp();
	eap.electronicsApp();
	HomeAppliancesApp hap = new HomeAppliancesApp();
	hap.homeAppliancesApp();
	
}
}
