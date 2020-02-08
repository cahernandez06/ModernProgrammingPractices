package Day5.Ex1;

import java.awt.Component;
/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private static final double MINBOOKPRICE = 0.49;
	private BookWindow book;

	@Override
	public void applyRules(Component obj) throws RuleException {
		// TODO Auto-generated method stub
		book = (BookWindow) obj;
		valNoEmpty();
		valIsbnNum();
		valPrice();
	}
	public void valNoEmpty() throws RuleException {
		if (book.getIsbnValue()==null||book.getTitleValue()==null||book.getPriceValue()==null||
		    book.getIsbnValue().isEmpty()||book.getTitle().isEmpty()||book.getPriceValue().isEmpty())
			throw new RuleException("Book fields cannot be empty");
	}
	public void valIsbnNum() throws RuleException {
		float numIsbn=0;
		String strIsbn=book.getIsbnValue();
		try{
			numIsbn=Float.parseFloat(strIsbn);
		}catch (NumberFormatException n) {
			throw new RuleException("Book Isbn has to be numeric");
		}
		if (strIsbn.length() != 10&&strIsbn.length() != 13)
			throw new RuleException("Book Isbn has to be 10 or 13 digits");
		if (strIsbn.length() == 10&&(!strIsbn.substring(0,1).equals("0")||!strIsbn.substring(0,1).equals("1")))
			throw new RuleException("Book Isbn 10 digits Isbns has to begin with 0 or 1");
		if (strIsbn.length() == 13&&(!strIsbn.substring(0,3).equals("978")||!strIsbn.substring(0,3).equals("979")))
			throw new RuleException("Book Isbn 13 digits Isbns has to begin with 978 or 979");			
	}
	public void valPrice() throws RuleException {
		String strPrice = book.getPriceValue();
		float numPrice=0;
		
		try{
			numPrice=Float.parseFloat(strPrice);
		}catch (NumberFormatException n) {
			throw new RuleException("Book price has to be floating point number");
		}
		if (!strPrice.matches("[-+]?[0-9]*\\.[0-9]{2}"))
			throw new RuleException("Book price has to be floating point number with two decimal places");
		if (numPrice < MINBOOKPRICE)
			throw new RuleException("Book price must be a number greater than " + MINBOOKPRICE);
	}
}
