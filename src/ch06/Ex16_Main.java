package ch06;

public class Ex16_Main {

	public static void main(String[] args) {
		Ex16_Product prod1 = new Ex16_Product(101, "노트북", 1200000,"컴퓨터" );
		Ex16_Product prod2 = new Ex16_Product(102, "테스크탑", 1000000,"컴퓨터" );
		Ex16_Product prod3 = new Ex16_Product(103, "모니터", 2000000,"컴퓨터" );
		Ex16_Product prod4 = new Ex16_Product(104, "TV", 1500000,"가전" );
		Ex16_Product prod5 = new Ex16_Product(105, "선풍기", 50000,"가전" );
		System.out.println(prod1);
		
		//배열만들기 array
		String[] productNames = {"노트북","테스크탑","모니터","TV","선풍기"};
		int[] productPrices = {120000, 1000000,2000000, 150000, 500000};
		String[] productCategories = {"컴퓨터", "컴퓨터","컴퓨터", "가전","가전"};
		Ex16_Product[] products = new Ex16_Product[5];
		for (int i=0; i<products.length; i++) {
			products[i] = new Ex16_Product(101+i, productNames[i], productPrices[i], productCategories[i]); 
		}
		for (Ex16_Product product : products)
			System.out.println(product);
	}

}
