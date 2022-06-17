package telran.numbers;


public class IntegerPrimitives {

	
	public static byte GetMaxByte() {
		byte res = 1;
		while (res > 0)
			res = (byte) (res * 2);

		return (byte) (res - 1);
	}
	
	public static byte GetMinByte() {
		
		return (byte) (GetMaxByte() + 1);
	}

	public static int GetLengthByte() {
		byte a = 0;
		
		return GetLength(a);
	}

	public static char GetMaxChar() {
		char res = 1;
		while (res > 0)
			res = (char) (res * 2);

		return (char) (res - 1);
	}

	public static char GetMinChar() {
		
		return (char) (GetMaxChar() + 1);
	}

	public static int GetLengthChar() {
		char a = 0;
		
		return GetLength(a);
	}

	public static short GetMaxShort() {
		
		return (short)(GetMinShort() - (1));
	}

	public static short GetMinShort() {
		short res = 1;
		while (res > 0)
			res = (short)(res * 2);

		return (short)(res);
	}

	public static int GetLengthShort() {
		short a = 0;
		
		return GetLength(a);
	}

	public static int GetMaxInt() {
		
		return GetMinInt() - 1;
	}

	public static int GetMinInt() {
		int res = 1;
		while (res > 0)
			res = res * 2;

		return res;
	}

	public static int GetLengthInt() {
		int a = 0;
		
		return GetLength(a);
	}

	public static long GetMaxLong() {
		
		return GetMinLong() + 1;
	}

	public static long GetMinLong() {
		int res = 1;
		while (res > 0)
			res = res * 2;

		return res;
	}

	public static int GetLengthLong() {
		long a = 0;
		
		return GetLength(a);
	}

	/**
	 * 
	 * @param x you should understand what x is
	 * @return length of any type in accordance to the x length is number of bytes
	 *         for any type
	 */
//------------------------------------------------------------------------------------------------------------

	private static int GetLength(long x) {
		long res = 1;
		int bytes = 1;
		while (res > 0)
		{
			res = res * 2;
			++bytes;
		}
		
		bytes /= 8;

		return bytes;
	}

	private static int GetLength(int x) {
		int res = 1;
		int bytes = 1;
		while (res > 0)
		{
			res = res * 2;
			++bytes;
		}

		bytes /= 8;

		return bytes;
	}

	private static int GetLength(short x) {
		short res = 1;
		int bytes = 1;
		while (res > 0)
		{
			res = (short)(res * 2);
			++bytes;
		}

		bytes /= 8;

		return bytes;
	}

	private static int GetLength(char x) {
		char res = 1;
		int bytes = 1;
		while (res > 0)
		{
			res = (char)(res * 2);
			++bytes;
		}

		bytes /= 8;

		return bytes;
	}

	private static int GetLength(byte x) {
		byte res = 1;
		int bytes = 1;
		while (res > 0)
		{
			res = (byte)(res * 2);
			++bytes;
		}

		bytes /= 8;

		return bytes;
	}

}
