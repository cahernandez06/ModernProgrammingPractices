package Day5.Ex1;

import java.awt.Component;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private static final double MINCDPRICE = 0.49;
	private CDWindow cd;

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		cd=(CDWindow) ob;
		valNoEmpty();
		valPrice();
	}
	public void valNoEmpty() throws RuleException {
		if (cd.getArtistValue()==null||cd.getTitleValue()==null||cd.getPriceValue()==null||
		    cd.getArtistValue().isEmpty()||cd.getTitleValue().isEmpty()||cd.getPriceValue().isEmpty())
			throw new RuleException("CD fields cannot be empty");
	}
	public void valPrice() throws RuleException {
		String strPrice = cd.getPriceValue();
		float numPrice=0;
		
		try{
			numPrice=Float.parseFloat(strPrice);
		}catch (NumberFormatException n) {
			throw new RuleException("CD price has to be floating point number");
		}
		if (!strPrice.matches("[-+]?[0-9]*\\.[0-9]{2}"))
			throw new RuleException("CD price has to be floating point number with two decimal places");
		if (numPrice < MINCDPRICE)
			throw new RuleException("CD price must be a number greater than " + MINCDPRICE);
	}
}
