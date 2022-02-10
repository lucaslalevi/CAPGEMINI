public class Ex08 {
	public static void main(String[] args){
	
		int v[];

		v= new int[10];
		boolean temValoresRepitidos;

		v[0] = 1;
		v[1] = 2;
		v[2] = 3;
		v[3] = 4;
		v[4] = 5;
		v[5] = 6;
		v[6] = 7;
		v[7] = 8;
		v[8] = 9;
		v[9] = 10;
		v[10] = 11;


		temValoresRepitidos = false;

		for(int j=1; j<10;j++){
			for(int l=10; l>1;l--){
				if(v[j] == v[l]){

					temValoresRepitidos= true;
				}  
			}
		}
		System.out.println(temValoresRepitidos);

	}
}