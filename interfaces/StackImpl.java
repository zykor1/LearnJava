class StackImpl implements IStack{
	protected Object[] stackArray;
	protected int tos;

	public StackImpl(int capacity){
		stackArray = new Object[capacity];
		tos = -1;
	}

	public void push(Object item){
		stackArray[++tos] = item;
	}

	public Object pop(){
		Object objRef = stackArray[tos];
		stackArray[tos] = null;
		tos--;
		return objRef;
	}

	public Object peek(){
		return stackArray[tos];
	}

}