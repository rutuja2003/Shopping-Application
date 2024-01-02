package shopAppl28_12;

public class Shopmain {

	public static void main(String[] args) {
		ShopInfo sinfo = new ShopInfo();
		Customer cust=sinfo.create();
		Bill billobj=sinfo.CalculateBill(cust);
		sinfo.display(cust,billobj);

		sinfo.printBill();


	}

}
