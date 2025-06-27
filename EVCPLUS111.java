import java.util.Scanner;
public class EVCPLUS111 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String pinCODE = "*770#";
            int haraaga = 100;

            // Tijaabi Pincode
            System.out.print("Fadlan geli pincode (*770#): ");
            String pincodeEntering = input.next();

            if (!pinCODE.equals(pincodeEntering)) {
                System.out.println("ERROR - Pincode qaldan!");
                return;
            }

            // Tijaabi PIN-ka
            System.out.print("Fadlan Gali PIN-kaaga (e.g. 1234): ");
            int pinCorrect = 1234;
            int pinUser = input.nextInt();
            if (pinUser != pinCorrect) {
                System.out.println("PIN qaldan!");
                return;
            }

            // Menu
            System.out.println("-EVCPLUS-");
            System.out.println("1. Itus Haraagaaga");
            System.out.println("2. Kaarka hadalka");
            System.out.println("3. Uwareeji EVCPLUS");
            System.out.println("4. Warbixin kooban");
            System.out.println("5. Salaam Bank");
            System.out.println("6. Bixi Bill");
            System.out.println("7. Iibso Data Plan");
            System.out.println("8. Samee Payment");
            System.out.println("9. Ka bax");

            System.out.print("Dooro (1-9): ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Haraagaaga waa $" + haraaga);
                    break;

                case 2:
                    System.out.println("-Kaarka hadalka-");
                    System.out.println("1. Ku shubo Airtime");
                    System.out.println("2. Ugu shub qof kale");
                    System.out.println("3. Ku shub Internet");
                    System.out.println("4. Ka noqo");
                    int kaarkaChoice = input.nextInt();

                    if (kaarkaChoice == 1) {
                        System.out.print("Gali lacagta aad shubaneysid: ");
                        int lacag = input.nextInt();
                        if (lacag > haraaga) {
                            System.out.println("Haraaga kugu filan malaha.");
                        } else {
                            System.out.println("Ma hubtaa inaad shubto $" + lacag + "? (1.Haa / 2.Maya)");
                            int confirm = input.nextInt();
                            if (confirm == 1) {
                                System.out.println("Waxaad ku shubtay ku hadal $" + lacag);
                            } else {
                                System.out.println("Waa la joojiyey.");
                            }
                        }
                    } else if (kaarkaChoice == 2) {
                        System.out.print("Gali lacagta: ");
                        int lacag = input.nextInt();
                        System.out.print("Gali nambarka qofka: ");
                        int num = input.nextInt();
                        System.out.println("Ma hubtaa inaad $" + lacag + " ugu shubto " + num + "? (1.Haa/2.Maya)");
                        int confirm = input.nextInt();
                        if (confirm == 1) {
                            System.out.println("Waxaad $" + lacag + " ugu shubtay " + num);
                        } else {
                            System.out.println("Waa la joojiyey.");
                        }
                    } else if (kaarkaChoice == 3) {
                        System.out.println("1. Maalinle\n2. Isbuucle\n3. Bille\n4. Ka noqo");
                        int netChoice = input.nextInt();
                        if (netChoice >= 1 && netChoice <= 3) {
                            System.out.print("Gali lacagta: ");
                            int lacag = input.nextInt();
                            System.out.println("Waxaad ku shubatay xirmo internet ah oo ah doorashada " + netChoice + ", lacag $" + lacag);
                        } else {
                            System.out.println("Waa laga noqday.");
                        }
                    } else {
                        System.out.println("Waa laga baxay kaarka hadalka.");
                    }
                    break;

                case 3:
                    System.out.print("Gali numberka: ");
                    int num = input.nextInt();
                    System.out.print("Gali lacagta: ");
                    int lacag = input.nextInt();
                    if (lacag <= haraaga) {
                        haraaga -= lacag;
                        System.out.println("Waxaad $" + lacag + " u wareejisay " + num + ". Haraagaaga: $" + haraaga);
                    } else {
                        System.out.println("Haraaga kugu filan malaha.");
                    }
                    break;

                case 4:
                    System.out.println("- Warbixin Kooban -");
                    System.out.println("1. Last action\n2. Wareejintii ugu danbeysay\n3. Last 3 action");
                    int wChoice = input.nextInt();
                    System.out.println("Warbixin lama hayo xilligan.");
                    break;

                case 5:
                    System.out.println("- Salaam Bank -");
                    System.out.println("1. Itus haraaga\n2. Lacag dhigasho\n3. Lacag qaadasho\n4. Ka bax");
                    int bankChoice = input.nextInt();
                    if (bankChoice == 1) {
                        System.out.println("Haraaga Salaam Bank: $500");
                    } else {
                        System.out.println("Waa laga baxay Salaam Bank.");
                    }
                    break;

                case 6:
                    System.out.println("- Bixi Bill -");
                    System.out.print("Gali magaca shirkadda: ");
                    input.nextLine();
                    String shirkad = input.nextLine();
                    System.out.print("Gali lacagta: ");
                    int money = input.nextInt();
                    System.out.println("Waxaad $"+money+" si guul leh ugu bixisay "+shirkad+".");
                    break;

                case 7:
                    System.out.println("- Iibso Data Plan -");
                    System.out.println("1. 1GB Maalinle ($1)\n2. 5GB Todobaadle ($4)\n3. 10GB Bille ($10)");
                    int dataChoice = input.nextInt();
                    if (dataChoice >= 1 && dataChoice <= 3) {
                        System.out.println("Waxaad iibsatay xirmo internet ah. Mahadsanid!");
                    } else {
                        System.out.println("Doorasho aan sax ahayn.");
                    }
                    break;

                case 8:
                    System.out.println("- Samee Payment -");
                    System.out.print("Gali lambarka qofka: ");
                    int numPay = input.nextInt();
                    System.out.print("Gali lacagta: ");
                    int amountPay = input.nextInt();
                    System.out.println("Waxaad $"+amountPay+" u dirtay "+numPay+".");
                    break;

                case 9:
                    System.out.println("Macasalaamo!");
                    break;

                default:
                    System.out.println("Xadkaaga ka baxday.");
            }

            input.close();
        }
    }

