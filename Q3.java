public class Q3 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0, totalCost = 0;
        
        for(int i = 0 ; i<gas.length; i++){
            
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) return -1;
        
        int remainsGas = 0, start = 0;
        for(int i = 0 ; i < gas.length; i++){
           
            remainsGas = remainsGas +(gas[i] - cost[i]);
            if(remainsGas < 0 ){
                start = i+1;
                remainsGas = 0;
            }
        }
        return start;
    }
	public static void main(String[] args){
		int gas[] = {1, 2, 3, 4, 5};
		int cost[] = {3, 4, 5, 1, 2};
		System.out.println("The starting station is : " + canCompleteCircuit(gas , cost));
	}
}