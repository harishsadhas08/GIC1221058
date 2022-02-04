import java.util.*;
import java.io.IOException;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int num=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
		ArrayList<Address> address=new ArrayList<Address>();
		for(int i=0;i<num;i++)
		{
			String[] info=sc.nextLine().split(",");
			address.add(new Address(info[0],info[1],info[2],Integer.parseInt(info[3])));
		}
		Collections.sort(address);
		System.out.println("User Details:");
		for(Address addr : address)
		{
			System.out.println(addr.getUsername()+","+addr.getAddressLine1()+","+addr.getAddressLine2()+","+addr.getPinCode());
		}
	}
}