package amazonImplementation;

public class Search {
	public String displayProduct(Product prod)
	{
		if(prod.productlist().contains(prod.getProductName()))
		{
			
			return prod.getProductName();
		}
		return null;
	}

}
