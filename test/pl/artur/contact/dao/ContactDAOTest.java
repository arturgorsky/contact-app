package pl.artur.contact.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import pl.artur.contact.model.Contact;

class ContactDAOTest {
	private DriverManagerDataSource dataSource;
	private ContactDAO dao;
	
	@BeforeEach
	void setupBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb?serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");
		
		dao = new ContactDAOImpl(dataSource);
	}

	@Test
	void testSave() {
		Contact contact = new Contact("Steve Jobs", "steve@apple.com", "Cupertino, CA", "1700123456789");
		int result = dao.save(contact);
		
		assertTrue(result>0);
	}

	@Test
	void testUpdate() {
		Contact contact = new Contact(1, "Steve Jobs", "steve.jobs@apple.com", "Cupertino, CA", "1700123456789");
		int result = dao.update(contact);
		
		assertTrue(result>0);
	}

	@Test
	void testGet() {
		Integer id = 1;
		Contact contact = dao.get(id);
		assertNotNull(contact);
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testList() {
		fail("Not yet implemented");
	}

}
