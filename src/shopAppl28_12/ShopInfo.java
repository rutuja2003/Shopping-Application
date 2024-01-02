package shopAppl28_12;
import java.util.*;
public class ShopInfo {
	double total=0;
	double cgst=0;
	double sgst=0;
	double finaltotal=0;
	private Bill billobj;

	public Customer create(){
		//		Address addr = new Address("Pune", "Mh",417202);
		//		Product prod = new Product(1, "Laptop",3000, 2);
		//		Customer cust = new Customer(101, "Rutuja", "789032", addr, prod);
		//		return cust;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer id");
		int custId=sc.nextInt();
		System.out.println("Enter Customer Name");
		String custName=sc.next();
		System.out.println("Enter Mobile No.");
		int mobNo=sc.nextInt();



		System.out.println("Enter customer City");
		String city=sc.next();
		System.out.println("Enter customer State");
		String state=sc.next();
		System.out.println("Enter customer pincode");
		int pincode=sc.nextInt();



		System.out.println("how many elements do you want");
		int n= sc.nextInt();
		Product prodarr[]=new Product[n];
		for(int i=0; i<prodarr.length; i++) {
			System.out.println("Enter Product Id");
			int prodId=sc.nextInt();
			System.out.println("Enter Product Name");
			String prodName=sc.next();
			System.out.println("Enter Product Price");
			double prodPrice=sc.nextDouble();
			System.out.println("Enter product Qty");
			int prodQty=sc.nextInt();

			Product prod=new Product(prodId, prodName, prodPrice, prodQty);
			prodarr[i]=prod;

		}
		Address addr=new Address(city, state, pincode);
		Customer cust = new Customer(custId, custName, state, addr, prodarr);
		return cust;

	}
	public void display( Customer cust ,Bill billobj) {
		System.out.println("Customer Id: "+cust.getCustId());
		System.out.println("Customer Name: "+cust.getCustName());
		System.out.println("Customer mob No: "+cust.getMobNo());
		System.out.println("------------Address-----------");
		System.out.println("Customer city"+cust.getAddr().getCity());
		System.out.println("Customer State"+cust.getAddr().getState());
		System.out.println("Customer pincode"+cust.getAddr().getPincode());
		System.out.println("----------------Product-----------");
		Product prodarr[]=cust.getProd();
		for(int i=0; i<prodarr.length;i++) {
			System.out.println("Customer ProdId:"+prodarr[i].getProdId());
			System.out.println("Customer Prodname:"+cust.getProd()[i].getProdName());
			System.out.println("Customer ProdPrice:"+cust.getProd()[i].getProdPrice());
			System.out.println("Customer ProdQty:"+cust.getProd()[i].getProdQty());
		}
		System.out.println("------------BILL---------- ");
		System.out.println("Date :"+billobj.getDate());
		System.out.println("Total Bill :"+billobj.getTotal());
		System.out.println("CGST :"+billobj.getCgst());
		System.out.println("SGST :"+billobj.getSgst());
		System.out.println("Final Toatl :"+billobj.getFinalTotal());
		System.out.println("---------Thank You----------");


	}

	public Bill CalculateBill(Customer cust) {
		Product prodarr[] =cust.getProd();
		for(int i=0; i<prodarr.length;i++) {
			total = total+prodarr[i].getProdPrice()*prodarr[i].getProdQty();
		}
		cgst=total*0.06;
		sgst=total*0.06;
		finaltotal=total+cgst+sgst;

		Bill billobj=new Bill(total, new Date(), cgst, sgst, finaltotal);
		return billobj;
	}
	public void printBill() {
		System.out.println("Total Amount: "+total);
		System.out.println("CGST: "+cgst);
		System.out.println("SGST: "+sgst);
		System.out.println("Final Bill: "+finaltotal);
	}
}
