public class Ex07{
	public static void main(String[] args){
		int i, aux;
		int v[];

		v= new int[5];

		aux = 1;
		for(int j=1; j<5;j++){

			aux = aux * (j +1);

			v[j] = (int)(aux /2);
		}

		System.out.println(v[3]);

	}
}