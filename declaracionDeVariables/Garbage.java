import java.util.Date;

 class CheckGc{
	static int seq=1;
	int id =seq++;
	public void finalize(){
		System.out.println("Objeto eliminado :"+id);

	}
	public static void main (String[]args){
		Runtime rt= Runtime.getRuntime();
		System.out.println("Total JMV memory:"+rt.totalMemory());
		System.out.println("Before Memory:"+rt.freeMemory());
		CheckGc d=null;
		for (int i=0;i<1000 ;i++ ) {
			d=new CheckGc();
			d=null;
			
		}
		System.out.println("After Memory ="+rt.freeMemory());
		rt.gc();
		System.out.println("affeter memory:"+rt.freeMemory());

	}
}