import java.util.Scanner;

public class SiebDesEratosthenes {

	boolean[] durchgestrichen;
	
	public static void main(String[] args) {
		SiebDesEratosthenes sde = new SiebDesEratosthenes();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		sde.durchgestrichen = new boolean[n];
		int a = 1;
		
		sde.durchstreichen(0);
		while(a<=n-1) {
			if(sde.istDurchgestrichen(a)!= true) {
				sde.hinschreiben(a);
				sde.durchstreichenVielfache(a, n);
			}
			a++;
		}
		scan.close();
	}
	
	public void hinschreiben(int a) {
		System.out.print(a+1);
		System.out.print(", ");
	}
	
	public void durchstreichen(int a) {
		this.durchgestrichen[a] = true;
	}
	
	public void durchstreichenVielfache(int a, int n) {
		int count = 2;
		int x = (a+1)*count;
		while(x <= n) {
			this.durchstreichen(x-1);
			count++;
			x = (a+1)*count;
		}
	}
	
	public boolean istDurchgestrichen(int a) {
		boolean durchgestrichen = false;
		if(this.durchgestrichen[a] == true) {
			durchgestrichen = true;
		}
		return durchgestrichen;
	}
}