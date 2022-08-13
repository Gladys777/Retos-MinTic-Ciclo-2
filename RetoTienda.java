public class Solution{
    
    public static void main(String[] args) {
        int[] compra = new int[]{2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400};
        reporte(compra);
    
    }
    public static int[] reporte(int [] compra){
        
        int[] array = new int[3];
        int costoTotal = 0;
        int caro;
        int barato;
        
        caro = barato = compra[0];
        
        for (int i = 0; i < compra.length; i++){
            costoTotal += compra[i];
            if (compra[i] > caro){
                caro = compra[i];
            }
            if (compra[i] < barato){
                barato = compra[i];
            }
        }
        
        array[0] = costoTotal;
        array[1] = barato;
        array[2] = caro;
        return array;
        
    }
}