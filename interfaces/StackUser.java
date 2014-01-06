public class StackUser{
	public static void main(String[]args){
		SafeStackImpl safeStackRef = new SafeStackImpl(10);
		StackImpl stackRef = safeStackRef;
		ISafeStack isafeStackRef = safeStackRef;
		IStack istackRef = safeStackRef;

		Object objRef = safeStackRef;
		safeStackRef.push("Dollars");
		stackRef.push("Kroner");
		System.out.println(isafeStackRef.pop());
		System.out.println(istackRef.pop());
		System.out.println(objRef.getClass());
	}
}