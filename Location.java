package MinesSweeper;

public class Location {
    //private int[][] locationOfSquare;
    private boolean checkView= false;
    private int value;
    private static int flag= 69;
    private boolean flagDeploy=false;

    public Location(){

    }

        public void setValue(int value){
            this.value=value;
        }

        public void setCheckView(){
            checkView=true;
        }



        public int getValue(){
            return value;
        }

        public boolean getCheckView(){
            return checkView;

        }
        public void setFlag(){
        if(!checkView && flag>0){
            flag--;
            flagDeploy=true;}
        }

        public void unSetFlag(){
            if(!checkView && flag<69){
            flag++;
            flagDeploy=false;
            }
        }

        public boolean getFlagDeploy(){
        return flagDeploy;
        }

        public int getFlag(){
        return flag;
        }

        public void getInfo(){
            System.out.println(checkView +" "+ value);
        }
}
