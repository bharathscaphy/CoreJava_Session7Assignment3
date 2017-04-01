public class ExceptionNullPointer {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println("Length of string is: " + str.length());
		} catch (NullPointerException ne) {
			System.out.println("Null Pointer Exception: " + ne);
		} catch (Exception e) {
			System.out.println("Some exception in the code: " + e);
		}

	}

}
