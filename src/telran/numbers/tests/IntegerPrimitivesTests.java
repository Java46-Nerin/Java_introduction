package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.IntegerPrimitives;

class IntegerPrimitivesTests {

	@Test
	void GetMaxByte() {
		assertEquals(Byte.MAX_VALUE,IntegerPrimitives.GetMaxByte());
	}
	@Test
	void GetMinByte() {
		assertEquals(Byte.MIN_VALUE,IntegerPrimitives.GetMinByte());
	}
	@Test
	void GetLengthByte() {
		assertEquals(1, IntegerPrimitives.GetLengthByte());
	}
	@Test
	void GetMaxChar() {
		assertEquals(Character.MAX_VALUE,IntegerPrimitives.GetMaxChar());
	}
	@Test
	void GetMinChar() {
		assertEquals(Character.MIN_VALUE,IntegerPrimitives.GetMinChar());
	}
	@Test
	void GetLengthChar() {
		assertEquals(2, IntegerPrimitives.GetLengthChar());
	}
	@Test
	void GetMaxShort() {
		assertEquals(Short.MAX_VALUE,IntegerPrimitives.GetMaxShort());
	}
	@Test
	void GetMinShort() {
		assertEquals(Short.MIN_VALUE,IntegerPrimitives.GetMinShort());
	}
	@Test
	void GetLengthShort() {
		assertEquals(2, IntegerPrimitives.GetLengthShort());
	}
	@Test
	void GetMaxInt() {
		assertEquals(Integer.MAX_VALUE,IntegerPrimitives.GetMaxInt());
	}
	@Test
	void GetMinInt() {
		assertEquals(Integer.MIN_VALUE,IntegerPrimitives.GetMinInt());
	}
	@Test
	void GetLengthInt() {
		assertEquals(4, IntegerPrimitives.GetLengthInt());
	}
	@Test
	void GetMaxLong() {
		assertEquals(Long.MAX_VALUE,IntegerPrimitives.GetMaxLong());
	}
	@Test
	void GetMinLong() {
		assertEquals(Long.MIN_VALUE,IntegerPrimitives.GetMinLong());
	}
	@Test
	void GetLengthLong() {
		assertEquals(8, IntegerPrimitives.GetLengthLong());
	}

}
