import java.util.Random; 
import java.util.ArrayList;

public class punto5{
    
    public ArrayList<Integer> DevolverVec(int a){
    int matriz[][]=new int[a][a];
    ArrayList<Integer> matrizV = new ArrayList<>();
    Random random=new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
        
                matriz[i][j] = random.nextInt(99);
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
        
                matrizV.add(matriz[i][j]);
            }
        }
    return matrizV;
    }
}