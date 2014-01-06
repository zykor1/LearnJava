package clase.primer;
public class TryStatic{
	public static void main(String[] args){

		CharStack  stack = new CharStack(40);
		CharStack  stack1 = new CharStack(40);
		CharStack  stack2 = new CharStack(40);
		System.out.println(CharStack.getInstanceCount());
	}
}