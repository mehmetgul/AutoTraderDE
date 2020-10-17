public class TestClass {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.setProperty("browser","chrome");
		String browserParamFromEnv = System.getProperty("browser");
		System.out.println(browserParamFromEnv);
	}
}
