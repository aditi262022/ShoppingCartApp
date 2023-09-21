package com.gqt.shoppingcart.electronics;

import java.util.Scanner;

public class ElectronicsApp {
	public void electronicsApp() {
		System.out.println("Enter your name --> ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		System.out.println("Enter your email id --> ");
		Scanner sc1 = new Scanner(System.in);
		String email = sc1.nextLine();

		System.out.println("Select from following products : ");
		System.out.println("Electronics -- Furniture -- Home appliances -- Mattress -- Kitchen Accessories");

		System.out.println("Enter the product --> ");
		Scanner sc2 = new Scanner(System.in);
		String search2 = sc2.nextLine();


		if(search2.equalsIgnoreCase("Electronics")==true) {
			System.out.println("Mobile -- Charger -- Bulb -- AC -- Television");
			System.out.println("Search the needed product --> ");        	
			Scanner sc3 = new Scanner(System.in);
			String search3 = sc3.nextLine();

			//MOBILE -->
			if(search3.equalsIgnoreCase("Mobile")) {
				System.out.println("IPhone14 -- IPhone13 -- OnePlus10Pro -- SamsungGalaxyS22Ultra -- SamsungGalaxyZFold3");


				System.out.println("Search the mobile --> ");
				Scanner sc4 = new Scanner(System.in);
				String search4 = sc4.nextLine();

				if(search4.equalsIgnoreCase("IPhone14")) {
					Mobile e1 = new Mobile("IPhone-14", "Starlight", 109900, "512-GB", "6.1 Inches");
					System.out.println("IPhone-14 : ");
					System.out.println(e1.getBrand()+"--"+e1.getColor()+"--"+e1.getCost()+"--"+e1.getSizeName()+"--"+e1.getScreenSize());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}

				if(search4.equalsIgnoreCase("IPhone13")) {
					Mobile e2 = new Mobile("IPhone-13", "Sierra Blue", 104900, "128-GB", "6.1 Inches");
					System.out.println("IPhone-13 : ");
					System.out.println(e2.getBrand()+"--"+e2.getColor()+"--"+e2.getCost()+"--"+e2.getSizeName()+"--"+e2.getScreenSize());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("OnePlus10Pro")) {
					Mobile e3 = new Mobile("OnePlus 10 Pro", "Emerald Forest", 66999, "256-GB", "6.7 Inches");
					System.out.println("OnePlus 10 Pro: ");
					System.out.println(e3.getBrand()+"--"+e3.getColor()+"--"+e3.getCost()+"--"+e3.getSizeName()+"--"+e3.getScreenSize());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("SamsungGalaxyS22Ultra")) {
					Mobile e4 = new Mobile("Samsung Galaxy S22 Ultra", "Dark Red", 108999, "512-GB", "7 Inches");
					System.out.println("Samsung Galaxy S22 Ultra : ");
					System.out.println(e4.getBrand()+"--"+e4.getColor()+"--"+e4.getCost()+"--"+e4.getSizeName()+"--"+e4.getScreenSize());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("SamsungGalaxyZFold3")) {
					Mobile e5 = new Mobile("Samsung Galaxy Z Fold3", "Black", 139999, "256-GB", "7.6 Inches");
					System.out.println("Samsung Galaxy Z Fold3 : ");
					System.out.println(e5.getBrand()+"--"+e5.getColor()+"--"+e5.getCost()+"--"+e5.getSizeName()+"--"+e5.getScreenSize());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
			}

			//CHARGER -->
			else if(search3.equalsIgnoreCase("Charger")) {
				System.out.println("DRVaku -- Duracell -- Inico -- ConceptKart -- Belkin");


				System.out.println("Search the charger --> ");
				Scanner sc4 = new Scanner(System.in);
				String search4 = sc4.nextLine();

				if(search4.equalsIgnoreCase("DRVaku")) {
					Charger c1 = new Charger("DR VAKU", "30W", 1100, "Type-C", "Smartwatch, headphone, mobile, airpods, apple watches");
					System.out.println("DR VAKU :");
					System.out.println(c1.getBrand()+"--"+c1.getWatts()+"--"+c1.getCost()+"--"+c1.getType()+"--"+c1.getDevices());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}

				if(search4.equalsIgnoreCase("Duracell")) {
					Charger c2 = new Charger("Duracell", "60W", 2164, "Type-C", "pc, tablets, laptops");        			
					System.out.println("Duracell :");
					System.out.println(c2.getBrand()+"--"+c2.getWatts()+"--"+c2.getCost()+"--"+c2.getType()+"--"+c2.getDevices());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("Inico")) {
					Charger c3 = new Charger("Inico", "65W", 2249, "Type-C", "Iphone");
					System.out.println("Inico :");
					System.out.println(c3.getBrand()+"--"+c3.getWatts()+"--"+c3.getCost()+"--"+c3.getType()+"--"+c3.getDevices());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("ConceptKart")) {
					Charger c4 = new Charger("Concept Kart", "150W", 6174, "USB", "Laptops");
					System.out.println("Concept Kart :");
					System.out.println(c4.getBrand()+"--"+c4.getWatts()+"--"+c4.getCost()+"--"+c4.getType()+"--"+c4.getDevices());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("Belkin")) {
					Charger c5 = new Charger("Belkin", "65W", 4199, "Type-C", "Iphone, ipad, Pixel");
					System.out.println("Belkin :");
					System.out.println(c5.getBrand()+"--"+c5.getWatts()+"--"+c5.getCost()+"--"+c5.getType()+"--"+c5.getDevices());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
			}

			//BULB -->        	
			else if(search3.equalsIgnoreCase("Bulb")) {
				System.out.println("Syska -- Philips -- Wipro -- Halonix -- Murphy");


				System.out.println("Search the bulbs --> ");
				Scanner sc4 = new Scanner(System.in);
				String search4 = sc4.nextLine();

				if(search4.equalsIgnoreCase("Syska")) {
					Bulb b1 = new Bulb("Syska", "9 watts", 699, "LED", "Outdoor & Indoor");
					System.out.println("Syska : ");
					System.out.println(b1.getBrand()+"--"+b1.getWatts()+"--"+b1.getCost()+"--"+b1.getType()+"--"+b1.getUsage());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}

				if(search4.equalsIgnoreCase("Philips")) {
					Bulb b2 = new Bulb("Philips", "10 watts", 459, "LED", "Outdoor & Indoor");
					System.out.println("Philips : ");
					System.out.println(b2.getBrand()+"--"+b2.getWatts()+"--"+b2.getCost()+"--"+b2.getType()+"--"+b2.getUsage());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}

				if(search4.equalsIgnoreCase("Wipro")) {
					Bulb b3 = new Bulb("Wipro", "20 watts", 759, "3-D LED", "Indoor");
					System.out.println("Wipro : ");
					System.out.println(b3.getBrand()+"--"+b3.getWatts()+"--"+b3.getCost()+"--"+b3.getType()+"--"+b3.getUsage());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("Halonix")) {
					Bulb b2 = new Bulb("Halonix", "10 watts", 617, "LED", "Outdoor & Indoor");
					System.out.println("Halonix : ");
					System.out.println(b2.getBrand()+"--"+b2.getWatts()+"--"+b2.getCost()+"--"+b2.getType()+"--"+b2.getUsage());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("Murphy")) {
					Bulb b2 = new Bulb("Murphy", "10 watts", 584, "LED", "Indoor");
					System.out.println("Murphy : ");
					System.out.println(b2.getBrand()+"--"+b2.getWatts()+"--"+b2.getCost()+"--"+b2.getType()+"--"+b2.getUsage());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
			}
			//--> AC
			else if(search3.equalsIgnoreCase("AC")) {
				System.out.println("Voltas -- Panasonic -- Samsung -- LG -- AmazonBasics");


				System.out.println("Search the AC --> ");
				Scanner sc4 = new Scanner(System.in);
				String search4 = sc4.nextLine();   

				if(search4.equalsIgnoreCase("Voltas")) {
					AC a1 = new AC("Voltas", "1.5 tons", 33890, 3, "230 volts");
					System.out.println("Voltas : ");
					System.out.println(a1.getBrand()+"--"+a1.getCapacity()+"--"+a1.getCost()+"--"+a1.getStar()+"--"+a1.getVoltage());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("Panasonic")) {
					AC a2 = new AC("Panasonic", "1.5 tons", 40990, 4, "230 volts");
					System.out.println("Panasonic : ");
					System.out.println(a2.getBrand()+"--"+a2.getCapacity()+"--"+a2.getCost()+"--"+a2.getStar()+"--"+a2.getVoltage());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("Samsung")) {
					AC a3 = new AC("Samsung", "1.5 tons", 41499, 5, "230 volts");
					System.out.println("Samsung : ");
					System.out.println(a3.getBrand()+"--"+a3.getCapacity()+"--"+a3.getCost()+"--"+a3.getStar()+"--"+a3.getVoltage());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("LG")) {
					AC a4 = new AC("LG", "1 ton", 32990, 3, "230 volts");
					System.out.println("LG : ");
					System.out.println(a4.getBrand()+"--"+a4.getCapacity()+"--"+a4.getCost()+"--"+a4.getStar()+"--"+a4.getVoltage());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("AmazonBasics")) {
					AC a5 = new AC("AmazonBasics", "1 tons", 26490, 3, "230 volts");
					System.out.println("AmazonBasics : ");
					System.out.println(a5.getBrand()+"--"+a5.getCapacity()+"--"+a5.getCost()+"--"+a5.getStar()+"--"+a5.getVoltage());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
			}
			//--> Television
			else if(search3.equalsIgnoreCase("Television")) {
				System.out.println("Toshiba -- Redmi -- Hyundai -- Sony -- Chroma");


				System.out.println("Search the Television --> ");
				Scanner sc4 = new Scanner(System.in);
				String search4 = sc4.nextLine();   


				if(search4.equalsIgnoreCase("Toshiba")) {
					Television t1 = new Television("Toshiba", 36990, "4k", 55, "55C350LP");
					System.out.println("Toshiba : ");
					System.out.println(t1.getBrand()+"--"+t1.getCost()+"--"+t1.getResolution()+"--"+t1.getScreensize()+"--"+t1.getModelname());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("Redmi")) {
					Television t2 = new Television("Redmi", 25990, "4k", 50, "5EG50LP");
					System.out.println("Redmi : ");
					System.out.println(t2.getBrand()+"--"+t2.getCost()+"--"+t2.getResolution()+"--"+t2.getScreensize()+"--"+t2.getModelname());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("Hyundai")) {
					Television t3 = new Television("Hyundai", 39990, "4k", 48, "55AK6P");
					System.out.println("Hyundai : ");
					System.out.println(t3.getBrand()+"--"+t3.getCost()+"--"+t3.getResolution()+"--"+t3.getScreensize()+"--"+t3.getModelname());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("Sony")) {
					Television t4 = new Television("Sony", 29990, "4k", 40, "55C358FP");
					System.out.println("Sony : ");
					System.out.println(t4.getBrand()+"--"+t4.getCost()+"--"+t4.getResolution()+"--"+t4.getScreensize()+"--"+t4.getModelname());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
				if(search4.equalsIgnoreCase("Chroma")) {
					Television t5 = new Television("Chroma", 36699, "4k", 55, "45F50LP");
					System.out.println("Chroma : ");
					System.out.println(t5.getBrand()+"--"+t5.getCost()+"--"+t5.getResolution()+"--"+t5.getScreensize()+"--"+t5.getModelname());

					System.out.println("Purchase / GoBack ");
					Scanner sc5 = new Scanner(System.in);
					String search5 = sc5.nextLine();

					if(search5.equalsIgnoreCase("Purchase")) {
						System.out.println("Thanku for purchasing. Item will delivered shortly");
					}
					else if(search5.equalsIgnoreCase("GoBack")){
						System.out.println("Thanks for showing your interest");
					}
					else {
						System.out.println("Oops..! Something went wrong.");
					}
				}
			}
		}
		else {
			System.out.println("Oops..! Something went wrong.");
		}
	}
}

