package jenkins2;

/**
 * interface to offer abstract definition.
 */
public interface ApplePrice {

	/**
	 * price of today
	 * @return price of double type.
	 */
	double todayPrice();
	
	/**
	 * persistent price record, default implementation does nothing.
	 */
	default void recordPrice() {
	};
}
