import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Pokemon> list;
    public static void main(String[] args) throws Exception {
        CLUtility.clear();
        Scanner scanscan = new Scanner(System.in);
        list = new ArrayList<>();
        while (true) {
            switch (CLUtility.switchValidator("what want do\n0) new pokemon\n1) view collection\n2) view specific pokemon\n3) edit pokemon\n4) exit", 4, scanscan)) {
                case 0:
                    //add pkmn
                    System.out.println("i do not feel like validating input here, enter things properly or youll crash the program");
                    String species, nickname, type;
                    int level;
                    System.out.println("simple or advanced pokemon creation\n(simple starts at level 1 with no nickname)\n(s/a)");
                    String mode = scanscan.next();
                    System.out.println("what species of pokemon do you want");
                    species = scanscan.next();
                    System.out.println("enter the pokemon's type");
                    type = scanscan.next();
                    if (mode.equalsIgnoreCase("s")){
                        list.add(new Pokemon(species, type));
                        break;
                    } else {
                        System.out.println("enter a nickname");
                        nickname = scanscan.next();
                        System.out.println("enter a level");
                        level = scanscan.nextInt();
                        list.add(new Pokemon(species, nickname, type, level));
                    }
                    break;
                case 1:
                    //view list
                    printList();
                    break;
                case 2:
                    //view specific pkmn
                    break;
                case 3:
                    //edit pkmn
                    Pokemon editing = list.get(CLUtility.switchValidator("enter an index to edit", list.size(), scanscan));
                    switch (CLUtility.switchValidator("0)edit nickname\n1)edit species", 3, scanscan)) {

                    }
                    break;
                case 4:
                    //exit
                    System.exit(0);
                    break;
            }
        }
    }

    /**
     * prints all ur pokemon
     */
    static void printList() {
        for (Pokemon pk : list) {
            System.out.print("species: " + pk.getSpecies());
            if (!pk.getNick().equals(null)) {
                System.out.print(" nickname: " + pk.getNick());
            }
            System.out.println(" type: " + pk.getType() + " level: " + pk.getLevel());
        }
    }

}
