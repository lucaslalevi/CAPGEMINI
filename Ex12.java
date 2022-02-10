public class Ex12{
	public static void main(String[] args){
		int resultado;
		Metodo m=new Metodo();
		resultado=m.func(9,3);
	
		
		System.out.println(resultado);
		
		

	}

	
}

class Metodo {

	public int func(int x,int y){
		if(y==0){
			return x; 	
		}else{
			return func(y,x%y);
		}
	
	}
}

