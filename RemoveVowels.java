import java.util.Scanner;
public class RemoveVowels {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter word");
		String str=s.nextLine();
		String[] a=str.split("");
		String result="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equalsIgnoreCase("a")||a[i].equalsIgnoreCase("e")||a[i].equalsIgnoreCase("i")||a[i].equalsIgnoreCase("o")||a[i].equalsIgnoreCase("u"))
			{
				continue;
			}
			result=result+a[i];
		}
		System.out.println("After removing vowels");
System.out.println(result);
	}

}
