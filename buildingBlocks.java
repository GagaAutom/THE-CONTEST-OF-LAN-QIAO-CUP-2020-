
public class buildingBlocks {
	static int SUM = 0;
	public static void show(int[] block) {
		System.out.println(" "+" "+" "+block[0]);
		System.out.println(" "+" "+block[1]+" "+block[2]);
		System.out.println(" "+block[3]+" "+block[4]+" "+block[5]);
		System.out.println(block[6]+" "+block[7]+" "+block[8]+" "+block[9]);
	}
	public static void jurge(int[] block) {
		if(block[0]>block[1])  return;
		if(block[0]>block[2])  return;
		if(block[1]>block[3])  return;
		if(block[1]>block[4])  return;
		if(block[2]>block[4])  return;
		if(block[2]>block[5])  return;
		if(block[3]>block[6])  return;
		if(block[3]>block[7])  return;
		if(block[4]>block[7])  return;
		if(block[4]>block[8])  return;
		if(block[5]>block[8])  return;
		if(block[5]>block[9])  return;
		
		show(block);
		SUM++;
	}
	
	public static void building(int[] block,int index) {
		if(index == block.length-1) {
			jurge(block);
			return;
		}
		for(int i = index;i<block.length;i++) {
			int temp = block[index];
			block[index] = block[i];
			block[i] = temp;
			building(block,index+1);
			temp = block[index];
			block[index] = block[i];
			block[i] = temp;
		}

		
	}
	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		
		building(a,0);
		
		System.out.println("sum is"+SUM);
	}
}
