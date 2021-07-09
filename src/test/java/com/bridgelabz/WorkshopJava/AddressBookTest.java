import org.junit.Test;

import com.bridgelabz.WorkshopJava.PersonData;
import static com.bridgelabz.WorkshopJava.AddressBookService.IOService.DB_IO;
import static com.bridgelabz.WorkshopJava.AddressBookService.IOService.FILE_IO;

import java.rmi.AccessException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;

public class AddressBookTest {

	@Test
	public void givenAddressBookInDB_WhenRetrieved_ShouldMatchAddressBookCount() throws AccessException {
		AddressBookService addressBookService = new AddressBookService();
		List<PersonData> addressBookData = addressBookService.readPersonData(DB_IO);
		Assert.assertEquals(3, addressBookData.size());
	}
}