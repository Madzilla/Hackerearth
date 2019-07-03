
import java.io.BufferedReader;
import java.io.InputStreamReader;
  
class DetermineTheWinner {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testCases = br.readLine(); 
        int test = Integer.parseInt(testCases);
        
        while(test-- > 0 ) {
            String game = br.readLine(); 
            String[] values = game.split(" ");
            int totalCards = Integer.parseInt(values[0]);
            int allowedToPick = Integer.parseInt(values[1]);
            if (totalCards%(allowedToPick+1) == 0)
             System.out.println("Dishant");
            else
             System.out.println("Arpa");
            
            
        }
    }
}
