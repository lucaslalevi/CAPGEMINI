public class Ex11 {
	public static void main(String[] args){
	

		Metodo m=new Metodo();
		System.out.println(m.f(5));
		
		

	}

	
}


class Metodo {

	public int f(int n){
		if( n <2){
			return n;
				
		} else{
			return f(n-1) + f(n -2);
		}
	}

}