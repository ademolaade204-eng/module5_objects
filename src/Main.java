import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
 public static void main(String[] args) throws BatteryExhaustedException {
  JavaStudent victor = new JavaStudent("victor", "Java");
  JavaStudent praise = new JavaStudent("praise", "python");
  FrontendDev kemi = new FrontendDev("Kemi");
  System.out.println("---- Starting Work Day ----");
  ArrayList<Programmer> team = new ArrayList<>();
  team.add(kemi);
  team.add(praise);
  team.add(victor);

  for (Programmer dev : team){
   System.out.println("---" + dev.getName() + " is starting work ---");
   dev.usePhone();
   dev.usePhone();
  }

  try {
   System.out.println("\n---🚀 Smart Server SHIFT ---");
   for (Programmer dev : team) {
    dev.writeCode();
   }
  } catch (BatteryExhaustedException e) {
   System.out.println(e.getMessage());
   Programmer brokenDev = e.getOffender();
   System.out.println("⚡️ [SYSTEM FIX] Triggering emergency backup power... ");
   brokenDev.recharge();

   try {
    System.out.println("🔄 Retrying work after emergency charge...");
    victor.writeCode();
    kemi.writeCode();
   } catch (BatteryExhaustedException ex) {
    System.out.println("Still failed: " + ex.getMessage());
   }
   System.out.println("--- System Check: Polymorphism in Action ---");
   try {
    victor.writeCode();
    kemi.writeCode();

   } catch (BatteryExhaustedException ex) {
    System.out.println(ex.getMessage());
   }
   System.out.println("\n---- 🔋Recharge Session ----");

   ItelPowerBank myPowerBank = new ItelPowerBank();
   System.out.println("=== 🔋 Mass Charging Session ===\n");
   victor.recharge();
   System.out.println();
   myPowerBank.recharge();

   System.out.println("\n=== 🚀 UPRGRADING TO MODULE 6: COLLECTIONS ===");
   ArrayList<Chargeable> chargingStation = new ArrayList<>();
   chargingStation.add(victor);
   chargingStation.add(praise);
   chargingStation.add(kemi);

   chargingStation.add(myPowerBank);
   for (Chargeable device : chargingStation) {
    device.recharge();
    System.out.println("-------------");
   }
   findLowBatteryDevices(chargingStation);
  }
 }


 public static void findLowBatteryDevices(ArrayList<Chargeable> list) throws BatteryExhaustedException {
  System.out.println("\n[ALERT]  Checking for devices below 20%...");

  boolean foundAny = false;
  StringBuilder alert = new StringBuilder();
  for (Chargeable item : list) {

   if (item.getBatteryLife() < 101) {
    alert.append(" -> CRITICAL: ");
    alert.append(item.getName());
    alert.append(" is at ");
    alert.append(item.getBatteryLife());
    alert.append("%\n");
    foundAny = true;
   }
  }

  if (!foundAny) {
   System.out.println("All devices are safely charged above 20%.");
  }

  if (alert.length() > 0) {
   System.out.println("\n=== WHITE ALERTS ===");
   System.out.println(alert.toString());

   try (BufferedWriter writer = new BufferedWriter(new FileWriter("simulation_log.txt", true))) {
    writer.write("--- Log Entry---\n");
    writer.write(alert.toString());
    System.out.println("✅ Alerts permanently logged to simulation_log.txt!");
   } catch (IOException e) {
    System.out.println(" ❌ Could not save to log file: " + e.getMessage());
   }
  }
 }
}