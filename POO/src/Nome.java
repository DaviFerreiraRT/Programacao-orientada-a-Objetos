
public class Nome {
	public static int novoSomar(int x, int y) {
		int s = x + y;
		return s;
	}

	public static void somar(int x, int y) {
		int s = x + y;
		imprimir(s);
	}

	public static void imprimir(int x) {
		System.out.println("Parametro recebido: " + x);
	}

	public static void main(String[] args) {
		int a = 10;
		System.out.println("Antes de chamar o metodo imprimir");
		imprimir(5);
		System.out.println("Depois de chamar pela primeira vez");
		imprimir(a);
		System.out.println("Depois de chamar pela segunda vez");
		System.out.println("Antes de chamar o m�todo somar pela primeira vez");
		somar(10, 30);
		System.out.println("Antes de chamar o m�todo somar pela segunda vez");
		int b = 15;
		int c = 25;
		System.out.println("Antes de chamar o m�todo somar pela segunda vez");
		somar(b, c);
		System.out.println("Depois de chamar o m�todo somar pela segunda vez");
		int soma = novoSomar(b, c);
		System.out.println(soma);

	}
}