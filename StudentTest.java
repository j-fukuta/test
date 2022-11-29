package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest extends Student {

	@Test
	void testGetName() {
		//オブジェクトを生成
		Student student = new Student("Taro", "Japan");
		//期待値
		String expected = "Taro";
		//実測値
		String actual = student.getName();
		//比較
		assertEquals(actual, expected);

	}

	@Test
	void testGetCountry() {
		//オブジェクトを生成
		Student student = new Student("Taro", "Japan");
		//期待値
		String expected = "Japan";
		//実測値
		String actual = student.getCountry();
		//比較
		assertEquals(actual, expected);
	}
	
	@Test
	public void groupedAssertions() {
		Student student = new Student("Taro", "Japan");
		assertAll("studentTest",
				() -> assertEquals("Taro", student.getName()),
				() -> assertEquals("Japan", student.getCountry())
				);
	}

}
