package com.cmax;


    import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {
            ArrayList<Task> AB = new ArrayList<Task>();
            String userInput;
            userInput = "6";
            while (((int) Double.parseDouble(userInput)) != 0) {
                System.out.println("Menu");
                System.out.println("1) Add a task.");
                System.out.println("2) Remove a task.");
                System.out.println("3) Update a task.");
                System.out.println("4) List all tasks.");
                System.out.println("5) List all tasks of a certain priority.");
                System.out.println("0) Exit.");
                System.out.println("Choose an Option.");
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                userInput = scanner.nextLine();

                try { int x = ((int) Double.parseDouble(userInput));}
                catch(NumberFormatException nfe){userInput = "6";};

                switch ((int) Double.parseDouble(userInput)) {
                    case 1:
                        PriList.add();
                        break;
                    case 2:
                        PriList.remove();
                        break;

                    case 3:
                        PriList.update();
                    break;

                    case 4:
                        PriList.list();
                        break;
                    case 5:
                        PriList.listpri();
                        break;

                    case 0:
                        break;
                    default:
                        System.out.println("Invalid Entry, Please try again...");
                        break;
                }
            }
        }
    }

