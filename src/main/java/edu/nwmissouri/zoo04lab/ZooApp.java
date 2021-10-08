package edu.nwmissouri.zoo04lab;

import java.util.Scanner;

/**
 * ZooApp is a Zoo simulation created by 542 Section 05.
 *
 * @author Dr. Case and others
 */
public class ZooApp {

    // Specify welcome message
    private static final String GREETING_MESSAGE = "Welcome to our 542 Zoo!";

    // Specify how to exit message
    private static final String ESCAPE_MESSAGE = "Hit Q to exit.";

    // Specify goodbye string
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our zoo!";

    // specify number of  animal types available 
    private static final int NUMBER_ANIMAL_TYPES = 59;

    /**
     * This main() method is the entry point for our application.
     *
     * @param args - inputs provided to the program (none required)
     */
    public static void main(String[] args) {

        // output welcome
        System.out.println(GREETING_MESSAGE);

        // output how to escape 
        System.out.println(ESCAPE_MESSAGE);

        // construct Scanner and begin interaction
        var scanner = new Scanner(System.in);

        // Prompt for topic: ask if they want to see animals
        System.out.println("Do you want to see animals (y/n)?");
        var animalInterestInput = scanner.next();

        // if yes, show list
        if (animalInterestInput.toUpperCase().startsWith("Y")) {

            // declare an int for the animal type number input
            int typeNumberInput;

            // declare a boolean for isValid
            boolean isValid;

            // do the list prompt for the first time, loop back while valid
            do {
                // Prompt for type: ask if they want to see animals
                // TODO: NEED TO AUTOUPDATE THE MENU *************
                System.out.println("What animals would you like to see?");
                System.out.println("Enter a number to choose, 0 to exit.");

                System.out.println("1. Aardvark");
                System.out.println("2. Abyssinian");
                System.out.println("3. Arvicolinae");
                System.out.println("4. Asp");
                System.out.println("5. Bearcat");
                System.out.println("6. BengalTiger");
                System.out.println("7. BlackJaguar");
                System.out.println("8. BlackPanther");
                System.out.println("9. Brachiosaurus");
                System.out.println("10. Buffalo");
                System.out.println("11. Cat");
                System.out.println("12. Cheetah");
                System.out.println("13. CongoLion");
                System.out.println("14. Cow");
                System.out.println("15. Crocodile");
                System.out.println("16. Dalmatian");
                System.out.println("17. Deer");
                System.out.println("18. Dinosaur");
                System.out.println("19. Duck");
                System.out.println("20. ElephantBird");
                System.out.println("21. Elephant");
                System.out.println("22. Emu");
                System.out.println("23. FerociousTiger");
                System.out.println("24. Floppy");
                System.out.println("25. Gerenuk");
                System.out.println("26. Giraffe");
                System.out.println("27. Glyptodon");
                System.out.println("28. Goat");
                System.out.println("29. Griffin");
                System.out.println("30. HarpSeal");
                System.out.println("31. Hippopotamus");
                System.out.println("32. Kangaroo");
                System.out.println("33. Kangaroov");
                System.out.println("34. Koala");
                System.out.println("35. Liger");
                System.out.println("36. Lioness");
                System.out.println("37. Lion");
                System.out.println("38. MightyLion");
                System.out.println("39. MuleDeer");
                System.out.println("40. Okapi");
                System.out.println("41. Panda");
                System.out.println("42. Panthera");
                System.out.println("43. PolarBear");
                System.out.println("44. ProngHorn");
                System.out.println("45. Puma");
                System.out.println("46. Rabbit");
                System.out.println("47. RelayHorse");
                System.out.println("48. RoaringLion");
                System.out.println("49. Shoebill");
                System.out.println("50. SiberianTiger");
                System.out.println("51. Squirrel");
                System.out.println("52. Stag");
                System.out.println("53. StringRay");
                System.out.println("54. SunBear");
                System.out.println("55. TauntingTiger");
                System.out.println("56. Unicorn");
                System.out.println("57. Walrus");
                System.out.println("58. Xraytetra");
                System.out.println("59. YukonMoose");

                try {
                    typeNumberInput = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput = 0;
                }

                // set isValid if >= 1 and <= number of animal types
                isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_ANIMAL_TYPES;

                // switch by animal type - autogenerate with ZooBuildSwitch.java
                switch (typeNumberInput) {

                    case 1 -> {
                        AardvarkGroup.create();
                        AardvarkGroup.run();
                    }
                    case 2 -> {
                        AbyssinianGroup.create();
                        AbyssinianGroup.run();
                    }
                    case 3 -> {
                        ArvicolinaeGroup.create();
                        ArvicolinaeGroup.run();
                    }
                    case 4 -> {
                        AspGroup.create();
                        AspGroup.run();
                    }
                    case 5 -> {
                        BearcatGroup.create();
                        BearcatGroup.run();
                    }
                    case 6 -> {
                        BengalTigerGroup.create();
                        BengalTigerGroup.run();
                    }
                    case 7 -> {
                        BlackJaguarGroup.create();
                        BlackJaguarGroup.run();
                    }
                    case 8 -> {
                        BlackPantherGroup.create();
                        BlackPantherGroup.run();
                    }
                    case 9 -> {
                        BrachiosaurusGroup.create();
                        BrachiosaurusGroup.run();
                    }
                    case 10 -> {
                        BuffaloGroup.create();
                        BuffaloGroup.run();
                    }
                    case 11 -> {
                        CatGroup.create();
                        CatGroup.run();
                    }
                    case 12 -> {
                        CheetahGroup.create();
                        CheetahGroup.run();
                    }
                    case 13 -> {
                        CongoLionGroup.create();
                        CongoLionGroup.run();
                    }
                    case 14 -> {
                        CowGroup.create();
                        CowGroup.run();
                    }
                    case 15 -> {
                        CrocodileGroup.create();
                        CrocodileGroup.run();
                    }
                    case 16 -> {
                        DalmatianGroup.create();
                        DalmatianGroup.run();
                    }
                    case 17 -> {
                        DeerGroup.create();
                        DeerGroup.run();
                    }
                    case 18 -> {
                        DinosaurGroup.create();
                        DinosaurGroup.run();
                    }
                    case 19 -> {
                        DuckGroup.create();
                        DuckGroup.run();
                    }
                    case 20 -> {
                        ElephantBirdGroup.create();
                        ElephantBirdGroup.run();
                    }
                    case 21 -> {
                        ElephantGroup.create();
                        ElephantGroup.run();
                    }
                    case 22 -> {
                        EmuGroup.create();
                        EmuGroup.run();
                    }
                    case 23 -> {
                        FerociousTigerGroup.create();
                        FerociousTigerGroup.run();
                    }
                    case 24 -> {
                        FloppyGroup.create();
                        FloppyGroup.run();
                    }
                    case 25 -> {
                        GerenukGroup.create();
                        GerenukGroup.run();
                    }
                    case 26 -> {
                        GiraffeGroup.create();
                        GiraffeGroup.run();
                    }
                    case 27 -> {
                        GlyptodonGroup.create();
                        GlyptodonGroup.run();
                    }
                    case 28 -> {
                        GoatGroup.create();
                        GoatGroup.run();
                    }
                    case 29 -> {
                        GriffinGroup.create();
                        GriffinGroup.run();
                    }
                    case 30 -> {
                        HarpSealGroup.create();
                        HarpSealGroup.run();
                    }
                    case 31 -> {
                        HippopotamusGroup.create();
                        HippopotamusGroup.run();
                    }
                    case 32 -> {
                        KangarooGroup.create();
                        KangarooGroup.run();
                    }
                    case 33 -> {
                        KangaroovGroup.create();
                        KangaroovGroup.run();
                    }
                    case 34 -> {
                        KoalaGroup.create();
                        KoalaGroup.run();
                    }
                    case 35 -> {
                        LigerGroup.create();
                        LigerGroup.run();
                    }
                    case 36 -> {
                        LionessGroup.create();
                        LionessGroup.run();
                    }
                    case 37 -> {
                        LionGroup.create();
                        LionGroup.run();
                    }
                    case 38 -> {
                        MightyLionGroup.create();
                        MightyLionGroup.run();
                    }
                    case 39 -> {
                        MuleDeerGroup.create();
                        MuleDeerGroup.run();
                    }
                    case 40 -> {
                        OkapiGroup.create();
                        OkapiGroup.run();
                    }
                    case 41 -> {
                        PandaGroup.create();
                        PandaGroup.run();
                    }
                    case 42 -> {
                        PantheraGroup.create();
                        PantheraGroup.run();
                    }
                    case 43 -> {
                        PolarBearGroup.create();
                        PolarBearGroup.run();
                    }
                    case 44 -> {
                        ProngHornGroup.create();
                        ProngHornGroup.run();
                    }
                    case 45 -> {
                        PumaGroup.create();
                        PumaGroup.run();
                    }
                    case 46 -> {
                        RabbitGroup.create();
                        RabbitGroup.run();
                    }
                    case 47 -> {
                        RelayHorseGroup.create();
                        RelayHorseGroup.run();
                    }
                    case 48 -> {
                        RoaringLionGroup.create();
                        RoaringLionGroup.run();
                    }
                    case 49 -> {
                        ShoebillGroup.create();
                        ShoebillGroup.run();
                    }
                    case 50 -> {
                        SiberianTigerGroup.create();
                        SiberianTigerGroup.run();
                    }
                    case 51 -> {
                        SquirrelGroup.create();
                        SquirrelGroup.run();
                    }
                    case 52 -> {
                        StagGroup.create();
                        StagGroup.run();
                    }
                    case 53 -> {
                        StringRayGroup.create();
                        StringRayGroup.run();
                    }
                    case 54 -> {
                        SunBearGroup.create();
                        SunBearGroup.run();
                    }
                    case 55 -> {
                        TauntingTigerGroup.create();
                        TauntingTigerGroup.run();
                    }
                    case 56 -> {
                        UnicornGroup.create();
                        UnicornGroup.run();
                    }
                    case 57 -> {
                        WalrusGroup.create();
                        WalrusGroup.run();
                    }
                    case 58 -> {
                        XraytetraGroup.create();
                        XraytetraGroup.run();
                    }
                    case 59 -> {
                        YukonMooseGroup.create();
                        YukonMooseGroup.run();
                    }
                    default -> {
                    }

                }

                // while the input is valid, we loop back
            } while (isValid);

            // close the if loop
        } // Prompt for adventures: ask if they want to try an adventure
        //        System.out.println("Do you want to go on an adventure (y/n)?");
        //        var adventureInterestInput = scanner.next();
        //        if (adventureInterestInput.toUpperCase().startsWith("Y")) {
        //            System.out.println("Sorry - this option is not yet available.");
        //        }
        // output goodbye
        System.out.println(GOODBYE_MESSAGE);

    }

}
