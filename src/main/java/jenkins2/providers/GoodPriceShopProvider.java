package jenkins2.providers;

import jenkins2.ApplePrice;

/**
 * good price shop offer a price for apples
 */
public class GoodPriceShopProvider implements ApplePrice{

	@Override
	public double todayPrice() {
		return 15;
	}
}
