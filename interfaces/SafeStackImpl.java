class SafeStackImpl extends StackImpl implements ISafeStack{

	public SafeStackImpl(int capacity){
		super(capacity);
	}

	public boolean isEmpty() {
	 	return tos < 0; 
	}

	public boolean isFull(){
		return tos >= stackArray.length-1;
	}

}