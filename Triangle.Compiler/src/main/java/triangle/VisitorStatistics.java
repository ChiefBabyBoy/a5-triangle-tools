package triangle;

public class VisitorStatistics{

    private static Integer charCount = 0;
    private static Integer intCount = 0;

	public static void visitChar() {
        charCount++;
        printCharStatistics();
	}

	public static void visitInt() {
        intCount++;
        printIntStatistics();
	}

    private static void printCharStatistics(){
        System.out.println();
        System.out.println("Character Expression Count: " + charCount);
    }

    private static void printIntStatistics(){
        System.out.println();
        System.out.println("Integer Expression Count: " + intCount);
    }

}
