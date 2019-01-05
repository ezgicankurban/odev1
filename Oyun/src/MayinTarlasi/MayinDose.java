package MayinTarlasi;

public class MayinDose extends Arazi {
	
    public void dose() {
    	int [][] arazi = new int [5][5];
    	int count =0;
     while (count != 10) {
        r = generator.nextInt(5);
        c = generator.nextInt(5);
        if (arazi[r][c] != -1) {
           arazi[r][c] = -1;
           count = count + 1;
        }
    }
     
     for (int i = 0; i < 5; i ++) {
         for (int j = 0; j < 5; j ++) {
            if (arazi[i][j] != -1)
               System.out.print(" ");
            System.out.print(arazi[i][j] + " ");
         }
         System.out.println();
      }
     
		}
}
