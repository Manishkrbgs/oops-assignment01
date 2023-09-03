package org.example;


   import java.util.Scanner;
import java.util.*;

    class CarServiceStation {
        public void generateBill(String carType, String[] serviceCodes) {
            int totalAmount = 0;

            System.out.println("Car Service Bill");
            System.out.println("Type of Car: " + carType);
            //System.out.println("Services:"+ serviceCodes);

            for (String code : serviceCodes) {
                String serviceName=null;
                int price=0;

                switch (code) {
                    case "BS01":
                        serviceName = "Basic Servicing";
                        switch (carType) {
                            case "Hatchback":
                                price = 2000;
                                break;
                            case "Sedan":
                                price = 4000;
                                break;
                            case "SUV":
                                price = 5000;
                                break;
                            default:
                                System.out.println("Invalid car type: " + carType);
                                return;
                        }
                        break;
                    case "EF01":
                        serviceName = "Engine Fixing";
                        switch (carType) {
                            case "Hatchback":
                                price = 5000;
                                break;
                            case "Sedan":
                                price = 8000;
                                break;
                            case "SUV":
                                price = 10000;
                                break;
                            default:
                                System.out.println("Invalid car type: " + carType);
                                return;
                        }
                        break;
                    case "CF01":
                        serviceName = "Clutch Fixing";
                        switch (carType) {
                            case "Hatchback":
                                price = 2000;
                                break;
                            case "Sedan":
                                price = 4000;
                                break;
                            case "SUV":
                                price = 6000;
                                break;
                            default:
                                System.out.println("Invalid car type: " + carType);
                                return;
                        }
                        break;
                    case "BF01":
                        serviceName = "Brake Fixing";
                        switch (carType) {
                            case "Hatchback":
                                price = 1000;
                                break;
                            case "Sedan":
                                price = 1500;
                                break;
                            case "SUV":
                                price = 2500;
                                break;
                            default:
                                System.out.println("Invalid car type: " + carType);
                                return;
                        }
                        break;
                    case "GF01":
                        serviceName = "Gear Fixing";
                        switch (carType) {
                            case "Hatchback":
                                price = 3000;
                                break;
                            case "Sedan":
                                price = 6000;
                                break;
                            case "SUV":
                                price = 8000;
                                break;
                            default:
                                System.out.println("Invalid car type: " + carType);
                                return;
                        }

                        break;
                    default:
                        System.out.println("Invalid service code: " + code);
                        continue;
                }

                totalAmount += price;

                System.out.println("Charge for "+serviceName + " (" + code + "): ₹" + price);

            }

            System.out.println("Total Amount: ₹" + totalAmount);
            if(totalAmount>=10000){
                System.out.println("cleaning is complimentary .no charges as your bill exceeds 10k");
            }
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            CarServiceStation station = new CarServiceStation();

            System.out.print("Enter the type of car (Hatchback/Sedan/SUV): ");
            String carType = scanner.nextLine();

            System.out.print("Enter the service codes (space-separated, e.g. BS01 EF01 CF01 BF01 GF01): ");
            String input = scanner.nextLine();
            String[] serviceCodes = input.split(" ");

            station.generateBill(carType, serviceCodes);

        }
    }
