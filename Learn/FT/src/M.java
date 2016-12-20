import java.util.Comparator;

 class Checker implements Comparator<Player> {

    @Override
    public int compare(Player y1, Player y2) {
        if((y1.score-y2.score)!=0){
            return y2.score-y1.score;
        }
         if(y1.name.compareTo(y2.name)!=0){
             return y1.name.compareTo(y2.name);
         }
     return 0;   
    }
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}