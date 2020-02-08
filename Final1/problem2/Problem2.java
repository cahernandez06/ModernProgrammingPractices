package problem2;

import helperclasses.Book;
import helperclasses.CheckoutRecord;
import helperclasses.LibraryMember;
import helperclasses.LibrarySystemException;
import helperclasses.TestData;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class Problem2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem2 p = new Problem2();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		p.books = TestData.INSTANCE.getAllBooks().iterator();

	}

	Iterator<Book> books;

	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems) {

		return mems.stream()
				.filter(member -> helperMethod(member)// call the
																	// helper
																	// method
												.getCheckoutRecordEntries().size() == 10)
				.findFirst().orElse(null);

		// return null;
		// fix this
		// return mems.stream().filter(mem ->
		// mem.checkout(books.next().getNextAvailableCopy(), LocalDate.now(),
		// LocalDate.of(2015, 9, 1))
		// .getCheckoutRecordEntries().size() == 10)
		// .findFirst().orElse(null);

	}

	// generating helper method
	public CheckoutRecord helperMethod(LibraryMember mem) {
		CheckoutRecord cr = null;
		try {
			cr = mem.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1));
		} catch (LibrarySystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cr;
	}
}