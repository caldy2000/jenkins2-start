package jenkins2.providers;

import jenkins2.ApplePrice;

/**
 * wumei shop offer a price for apples.
 */
public class WumeiShopProvider implements ApplePrice{

	@Override
	public double todayPrice() {
		return 20;
	}
	
}
