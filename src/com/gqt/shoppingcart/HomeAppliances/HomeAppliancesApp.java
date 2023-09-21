package com.gqt.shoppingcart.HomeAppliances;

import java.util.Scanner;

public class HomeAppliancesApp {
	public void homeAppliancesApp()
	{
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

		if(search2.equalsIgnoreCase("Home appliances")==true) {
			System.out.println("Kettle -- VaccumCleaner -- Iron -- AirFryer -- Induction");
			System.out.println("Search the needed product --> ");        	
			Scanner sc3 = new Scanner(System.in);
			String search3 = sc3.nextLine();

//kettle
			if(search3.equalsIgnoreCase("Kettle")) {
				System.out.println("Prestige -- Pegion -- Havells -- WiproVesta -- Brayden");


				System.out.println("Search the kettle --> ");
				Scanner sc4 = new Scanner(System.in);
				String search4 = sc4.nextLine();

				if(search4.equalsIgnoreCase("Prestige")) {
					Kettle k1 = new Kettle("Prestige", 1190, "Silver", "1.7 liter", "230 voltage");
					System.out.println("Prestige : ");
					System.out.println(k1.getBrand()+"--"+k1.getColor()+"--"+k1.getCost()+"--"+k1.getCapacity()+"--"+k1.getVoltage());

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

				if(search4.equalsIgnoreCase("Pegion")) {
					Kettle k2 = new Kettle("Pegion", 1990, "Silver", "1.5 liter", "230 voltage");
					System.out.println("Pegion : ");
					System.out.println(k2.getBrand()+"--"+k2.getColor()+"--"+k2.getCost()+"--"+k2.getCapacity()+"--"+k2.getVoltage());

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

				if(search4.equalsIgnoreCase("Havells")) {
					Kettle k3 = new Kettle("Havells", 1290, "Black", "1.5 liter", "230 voltage");
					System.out.println("Havells : ");
					System.out.println(k3.getBrand()+"--"+k3.getColor()+"--"+k3.getCost()+"--"+k3.getCapacity()+"--"+k3.getVoltage());

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

				if(search4.equalsIgnoreCase("WiproVesta")) {
					Kettle k4 = new Kettle("WiproVesta", 2290, "Silver", "1.5 liter", "230 voltage");
					System.out.println("WiproVesta : ");
					System.out.println(k4.getBrand()+"--"+k4.getColor()+"--"+k4.getCost()+"--"+k4.getCapacity()+"--"+k4.getVoltage());

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

				if(search4.equalsIgnoreCase("Brayden")) {
					Kettle k6 = new Kettle("Brayden", 2099, "Black", "1.5 liter", "230 voltage");
					System.out.println("Brayden : ");
					System.out.println(k6.getBrand()+"--"+k6.getColor()+"--"+k6.getCost()+"--"+k6.getCapacity()+"--"+k6.getVoltage());

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
			else {
				System.out.println("OOPS..! Something went wrong.");
			}

//iron
			if(search3.equalsIgnoreCase("Iron")) {
				System.out.println("Orient -- Bajaj -- Calandis -- Philips -- MorphyRichards");


				System.out.println("Search the Iron --> ");
				Scanner sc4 = new Scanner(System.in);
				String search4 = sc4.nextLine();

				if(search4.equalsIgnoreCase("Orient")) {
					Iron i1 = new Iron("Orient", 1190, "Silver", "1.7 liter", "230 voltage");
					System.out.println("Orient : ");
					System.out.println(i1.getBrand()+"--"+i1.getColor()+"--"+i1.getCost()+"--"+i1.getCapacity()+"--"+i1.getVoltage());

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

				if(search4.equalsIgnoreCase("Pegion")) {
					Kettle k2 = new Kettle("Pegion", 1990, "Silver", "1.5 liter", "230 voltage");
					System.out.println("Pegion : ");
					System.out.println(k2.getBrand()+"--"+k2.getColor()+"--"+k2.getCost()+"--"+k2.getCapacity()+"--"+k2.getVoltage());

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

				if(search4.equalsIgnoreCase("Havells")) {
					Kettle k3 = new Kettle("Havells", 1290, "Black", "1.5 liter", "230 voltage");
					System.out.println("Havells : ");
					System.out.println(k3.getBrand()+"--"+k3.getColor()+"--"+k3.getCost()+"--"+k3.getCapacity()+"--"+k3.getVoltage());

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

				if(search4.equalsIgnoreCase("WiproVesta")) {
					Kettle k4 = new Kettle("WiproVesta", 2290, "Silver", "1.5 liter", "230 voltage");
					System.out.println("WiproVesta : ");
					System.out.println(k4.getBrand()+"--"+k4.getColor()+"--"+k4.getCost()+"--"+k4.getCapacity()+"--"+k4.getVoltage());

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

				if(search4.equalsIgnoreCase("Brayden")) {
					Kettle k6 = new Kettle("Brayden", 2099, "Black", "1.5 liter", "230 voltage");
					System.out.println("Brayden : ");
					System.out.println(k6.getBrand()+"--"+k6.getColor()+"--"+k6.getCost()+"--"+k6.getCapacity()+"--"+k6.getVoltage());

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

//AirFryer
//					if(search6.equalsIgnoreCase("AirFryer")) {
//						System.out.println("Prestige -- Pegion -- Havells -- WiproVesta -- Brayden");
//
//
//						System.out.println("Search the AirFryer --> ");
//						Scanner sc6 = new Scanner(System.in);
//						String search6 = sc6.nextLine();
//
//						if(search5.equalsIgnoreCase("Prestige")) {
//							AirFryer a1 = new AirFryer("Prestige", 1190, "Silver", "1.7 liter", "230 voltage");
//							System.out.println("Prestige : ");
//							System.out.println(a1.getBrand()+"--"+a1.getColor()+"--"+a1.getCost()+"--"+a1.getCapacity()+"--"+a1.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc7 = new Scanner(System.in);
//							String search7 = sc7.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("Pegion")) {
//							Kettle k2 = new Kettle("Pegion", 1990, "Silver", "1.5 liter", "230 voltage");
//							System.out.println("Pegion : ");
//							System.out.println(k2.getBrand()+"--"+k2.getColor()+"--"+k2.getCost()+"--"+k2.getCapacity()+"--"+k2.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("Havells")) {
//							Kettle k3 = new Kettle("Havells", 1290, "Black", "1.5 liter", "230 voltage");
//							System.out.println("Havells : ");
//							System.out.println(k3.getBrand()+"--"+k3.getColor()+"--"+k3.getCost()+"--"+k3.getCapacity()+"--"+k3.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("WiproVesta")) {
//							Kettle k4 = new Kettle("WiproVesta", 2290, "Silver", "1.5 liter", "230 voltage");
//							System.out.println("WiproVesta : ");
//							System.out.println(k4.getBrand()+"--"+k4.getColor()+"--"+k4.getCost()+"--"+k4.getCapacity()+"--"+k4.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("Brayden")) {
//							Kettle k6 = new Kettle("Brayden", 2099, "Black", "1.5 liter", "230 voltage");
//							System.out.println("Brayden : ");
//							System.out.println(k6.getBrand()+"--"+k6.getColor()+"--"+k6.getCost()+"--"+k6.getCapacity()+"--"+k6.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//					}
//					else {
//						System.out.println("OOPS..! Something went wrong.");
//					}
//
//					//Induction
//					if(search3.equalsIgnoreCase("Kettle")) {
//						System.out.println("Prestige -- Pegion -- Havells -- WiproVesta -- Brayden");
//
//
//						System.out.println("Search the kettle --> ");
//						Scanner sc4 = new Scanner(System.in);
//						String search4 = sc4.nextLine();
//
//						if(search4.equalsIgnoreCase("Prestige")) {
//							Kettle k1 = new Kettle("Prestige", 1190, "Silver", "1.7 liter", "230 voltage");
//							System.out.println("Prestige : ");
//							System.out.println(k1.getBrand()+"--"+k1.getColor()+"--"+k1.getCost()+"--"+k1.getCapacity()+"--"+k1.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("Pegion")) {
//							Kettle k2 = new Kettle("Pegion", 1990, "Silver", "1.5 liter", "230 voltage");
//							System.out.println("Pegion : ");
//							System.out.println(k2.getBrand()+"--"+k2.getColor()+"--"+k2.getCost()+"--"+k2.getCapacity()+"--"+k2.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("Havells")) {
//							Kettle k3 = new Kettle("Havells", 1290, "Black", "1.5 liter", "230 voltage");
//							System.out.println("Havells : ");
//							System.out.println(k3.getBrand()+"--"+k3.getColor()+"--"+k3.getCost()+"--"+k3.getCapacity()+"--"+k3.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("WiproVesta")) {
//							Kettle k4 = new Kettle("WiproVesta", 2290, "Silver", "1.5 liter", "230 voltage");
//							System.out.println("WiproVesta : ");
//							System.out.println(k4.getBrand()+"--"+k4.getColor()+"--"+k4.getCost()+"--"+k4.getCapacity()+"--"+k4.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("Brayden")) {
//							Kettle k6 = new Kettle("Brayden", 2099, "Black", "1.5 liter", "230 voltage");
//							System.out.println("Brayden : ");
//							System.out.println(k6.getBrand()+"--"+k6.getColor()+"--"+k6.getCost()+"--"+k6.getCapacity()+"--"+k6.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//					}
//					else {
//						System.out.println("OOPS..! Something went wrong.");
//					}
//					//VaccumCleaner
//					if(search3.equalsIgnoreCase("Kettle")) {
//						System.out.println("Prestige -- Pegion -- Havells -- WiproVesta -- Brayden");
//
//
//						System.out.println("Search the kettle --> ");
//						Scanner sc4 = new Scanner(System.in);
//						String search4 = sc4.nextLine();
//
//						if(search4.equalsIgnoreCase("Prestige")) {
//							Kettle k1 = new Kettle("Prestige", 1190, "Silver", "1.7 liter", "230 voltage");
//							System.out.println("Prestige : ");
//							System.out.println(k1.getBrand()+"--"+k1.getColor()+"--"+k1.getCost()+"--"+k1.getCapacity()+"--"+k1.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("Pegion")) {
//							Kettle k2 = new Kettle("Pegion", 1990, "Silver", "1.5 liter", "230 voltage");
//							System.out.println("Pegion : ");
//							System.out.println(k2.getBrand()+"--"+k2.getColor()+"--"+k2.getCost()+"--"+k2.getCapacity()+"--"+k2.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("Havells")) {
//							Kettle k3 = new Kettle("Havells", 1290, "Black", "1.5 liter", "230 voltage");
//							System.out.println("Havells : ");
//							System.out.println(k3.getBrand()+"--"+k3.getColor()+"--"+k3.getCost()+"--"+k3.getCapacity()+"--"+k3.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("WiproVesta")) {
//							Kettle k4 = new Kettle("WiproVesta", 2290, "Silver", "1.5 liter", "230 voltage");
//							System.out.println("WiproVesta : ");
//							System.out.println(k4.getBrand()+"--"+k4.getColor()+"--"+k4.getCost()+"--"+k4.getCapacity()+"--"+k4.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//
//						if(search4.equalsIgnoreCase("Brayden")) {
//							Kettle k6 = new Kettle("Brayden", 2099, "Black", "1.5 liter", "230 voltage");
//							System.out.println("Brayden : ");
//							System.out.println(k6.getBrand()+"--"+k6.getColor()+"--"+k6.getCost()+"--"+k6.getCapacity()+"--"+k6.getVoltage());
//
//							System.out.println("Purchase / GoBack ");
//							Scanner sc5 = new Scanner(System.in);
//							String search5 = sc5.nextLine();
//
//							if(search5.equalsIgnoreCase("Purchase")) {
//								System.out.println("Thanku for purchasing. Item will delivered shortly");
//							}
//							else if(search5.equalsIgnoreCase("GoBack")){
//								System.out.println("Thanks for showing your interest");
//							}
//							else {
//								System.out.println("Oops..! Something went wrong.");
//							}
//						}
//					}
//					else {
//						System.out.println("OOPS..! Something went wrong.");
//					}

				}
			}

		}
	}
}