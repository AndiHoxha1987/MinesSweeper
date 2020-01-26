package MinesSweeper;

import java.util.*;


public class MineMain {
    private static int n = 15;//e vendosa jashte main per ta aksesuar ne te gjitha methodat pasi me duhet disa here
    private static int flags=n*n/4;// numrin e bombave te vendosura
    private static int a=0;//numeron sa location kam chekuar

    public static void main(String[] args) {

        List<Player> players = new LinkedList<>();

        players.add(new Player());

        for (Player pl : players){
            System.out.println(pl.getPlayerName());
        while(n!=1){
        Location[][] Locations = new Location[n][n];// krijova harten me n rreshta dhe n kolona

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    Locations[i][j]= new Location();
                }
            }//krijova objectet ne cdo location te hartes

        for (int i = 0; i < flags; i++) {
            Random in = new Random();
            int x = in.nextInt(n - 1);
            int y = in.nextInt(n - 1);
            Locations[x][y].setValue(9);
        }//vendosa bombat

        /*for (int i = 0; i < 15; i++) {
            Random in = new Random();
            int x = in.nextInt(n - 1);
            int y = in.nextInt(n - 1);
            if (Locations[x][y].getValue() != 9) {
                Locations[x][y].setValue(10);
            }
        }*///ketu vendosa rastesisht frutat por vendosa ti heq dhe ti fus te te gjitha me vlere 0, me thjeshton kodin
        //dhe i jep me shume variacion lojes

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!(Locations[i][j].getValue() == 9 || Locations[i][j].getValue() == 10)) {
                    Locations[i][j].setValue(checkNearby(Locations, i, j));
                }
            }
        }//vendos vlerat ne cdo location

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Locations[i][j].getValue() == 0){
                    Locations[i][j].setValue(10);
                }
            }
        }//vendosa frutat tek kutite me vlere 0

        System.out.println("Make your first move pls");

        Scanner in = new Scanner(System.in);
        System.out.println("x = ");
        int x = in.nextInt();
        x=inNumber(x);
        System.out.println("y = ");
        int y = in.nextInt();
        y=inNumber(y);
        getMove(Locations, x, y);
        }
        }
    }


    private static int checkNearby(Location[][] loc, int x, int y) {
        int a = 0;
        if (x == 0 && y == 0) {

            if (loc[x + 1][y].getValue() == 9) {
                a++;
            }
            if (loc[x][y + 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y + 1].getValue() == 9) {
                a++;
            }

            /*if (loc[x + 1][y].getValue() == 10) {
                a = -1;
            }
            if (loc[x][y + 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y + 1].getValue() == 10) {
                a = -1;
            }*/
            return a;
        } else if (x == 0 && y < n - 1) {
            if (loc[x][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y].getValue() == 9) {
                a++;
            }
            if (loc[x][y + 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y + 1].getValue() == 9) {
                a++;
            }

            /*if (loc[x][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y].getValue() == 10) {
                a = -1;
            }
            if (loc[x][y + 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y + 1].getValue() == 10) {
                a = -1;
            }*/

            return a;
        } else if (x == 0 && y == n - 1) {
            if (loc[x][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y].getValue() == 9) {
                a++;
            }

            /*if (loc[x][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y].getValue() == 10) {
                a = -1;
            }*/
            return a;
        } else if (x == n - 1 && y == 0) {
            if (loc[x - 1][y].getValue() == 9) {
                a++;
            }
            if (loc[x - 1][y + 1].getValue() == 9) {
                a++;
            }
            if (loc[x][y + 1].getValue() == 9) {
                a++;
            }

            /*if (loc[x - 1][y].getValue() == 10) {
                a = -1;
            }
            if (loc[x - 1][y + 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x][y + 1].getValue() == 10) {
                a = -1;
            }*/
            return a;
        } else if (x < n - 1 && y == 0) {
            if (loc[x - 1][y].getValue() == 9) {
                a++;
            }
            if (loc[x - 1][y + 1].getValue() == 9) {
                a++;
            }
            if (loc[x][y + 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y + 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y].getValue() == 9) {
                a++;
            }

            /*if (loc[x - 1][y].getValue() == 10) {
                a = -1;
            }
            if (loc[x - 1][y + 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x][y + 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y + 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y].getValue() == 10) {
                a = -1;
            }*/
            return a;
        } else if (x == n - 1 && y < n - 1) {
            if (loc[x - 1][y].getValue() == 9) {
                a++;
            }
            if (loc[x - 1][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x - 1][y + 1].getValue() == 9) {
                a++;
            }
            if (loc[x][y + 1].getValue() == 9) {
                a++;
            }
            if (loc[x][y - 1].getValue() == 9) {
                a++;
            }

            /*if (loc[x - 1][y].getValue() == 10) {
                a = -1;
            }
            if (loc[x - 1][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x - 1][y + 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x][y + 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x][y - 1].getValue() == 10) {
                a = -1;
            }*/
            return a;
        } else if (x == n - 1 && y == n - 1) {
            if (loc[x - 1][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x - 1][y].getValue() == 9) {
                a++;
            }

            /*if (loc[x - 1][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x - 1][y].getValue() == 10) {
                a = -1;
            }*/
            return a;
        } else if (x < n - 1 && y == n - 1) {
            if (loc[x - 1][y].getValue() == 9) {
                a++;
            }
            if (loc[x - 1][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y].getValue() == 9) {
                a++;
            }
            if (loc[x - 1][y].getValue() == 9) {
                a++;
            }

            /*if (loc[x - 1][y].getValue() == 10) {
                a = -1;
            }
            if (loc[x - 1][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y].getValue() == 10) {
                a = -1;
            }
            if (loc[x - 1][y].getValue() == 10) {
                a = -1;
            }*/
            return a;
        } else {
            if (loc[x - 1][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y - 1].getValue() == 9) {
                a++;
            }
            if (loc[x - 1][y].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y].getValue() == 9) {
                a++;
            }
            if (loc[x - 1][y + 1].getValue() == 9) {
                a++;
            }
            if (loc[x][y + 1].getValue() == 9) {
                a++;
            }
            if (loc[x + 1][y + 1].getValue() == 9) {
                a++;
            }

            /*if (loc[x - 1][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y - 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x - 1][y].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y].getValue() == 10) {
                a = -1;
            }
            if (loc[x - 1][y + 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x][y + 1].getValue() == 10) {
                a = -1;
            }
            if (loc[x + 1][y + 1].getValue() == 10) {
                a = -1;
            }*/
            return a;
        }
    }

    private static String getMove(Location[][] loc, int x, int y) {
        Scanner in = new Scanner(System.in);


        System.out.println("Pres 1 for open\npres 2 for set flag\npres 3 for unSet flag");
        int z=in.nextInt();
        switch (z){
            case 2:{
                setBombFlag(loc, x, y);

                break;
            }
            case 3:{
                unSetBombFlag(loc, x, y);

                break;
            }
            case 1:{
                if(loc[x][y].getFlagDeploy()){
                    System.out.println("Can't open, it's a flag there");
                    break;
                }else {

        loc[x][y].setCheckView();
        if (loc[x][y].getValue() == 9) {
            System.out.println("Game Over");
            printMap(loc);
            return "Game Over";
                }
            }
            }

        }   printMap(loc);
        if(winCondition(loc)){
            System.out.println("Congratulations You Win The Game!");
            n=1;
        }
            System.out.println("Enter new cords pls");
            System.out.println("x = ");
            x = in.nextInt();
            x= inNumber(x);
            System.out.println("y = ");
            y = in.nextInt();
            y=inNumber(y);
            return getMove(loc, x, y);



    }

    private static void printMap(Location[][] loc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (loc[i][j].getCheckView()) {
                    System.out.print(loc[i][j].getValue() + " | ");
                } else if(loc[i][j].getFlagDeploy()){
                    System.out.print(" Flg ");
                }else{
                    System.out.print("  |  ");
                }

            }
            System.out.println();
        }
    }
    private static int inNumber(int z){
        if(z>=0 && z<n){
            return z;
        }else{
            Scanner in = new Scanner(System.in);
            System.out.println("Wrong cord, enter cords pls between 0 and "+(n-1));
            System.out.println("Enter new cords pls :");
            z = in.nextInt();
            return inNumber(z);
        }
    }

    private static void setBombFlag(Location[][] loc, int x, int y){
        loc[x][y].setFlag();

    }
    private static void unSetBombFlag(Location[][] loc, int x, int y){
            loc[x][y].unSetFlag();

    }
    private static boolean winCondition(Location[][] loc){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (loc[i][j].getCheckView()){
                    a++;
                }
            }
        }
        return a == (n * n) - flags;
    }
}



