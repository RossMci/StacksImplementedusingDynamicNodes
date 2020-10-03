package Nodespackage;

/**
 *
 * @author Ross Mcinerney
 */
public class LinkedStringStack
{

	private Node top;
	private int size;

	public LinkedStringStack()
	{
		top = null;
		size = 0;
	}

	public boolean isEmpty()
	{
		return top == null;
	}

	public boolean isFull()
	{
		return size == Integer.MAX_VALUE;
		//https://stackoverflow.com/questions/22849687/java-linked-stack-implementation-cant-figure-out-why-same-number-is-always-p/22849804
		//https://introcs.cs.princeton.edu/java/43stack/ArrayStackOfStrings.java.html
		//Linked list has no upper limit without adding a hard limit
	}

	/**
	 * //# Push a new object on the stack
	 *
	 * @param s
	 */
	public void push(String s)
	{
		if (isFull())
		{
			throw new IllegalStateException("Stack is full");//https://stackoverflow.com/questions/18141596/which-exception-to-throw-when-user-tries-to-add-to-a-full-container
		}
		Node n = new Node(s, top);
		top = n;
		size++;
	}

	public void clearStack()
	{
		top = null;
		size = 0;
	}

	/**
	 * Pop off the peek stack element
	 *
	 * @return
	 * @throws EmptyStackException
	 */
	public String pop() throws EmptyStackException
	{
		String temp = peek();

		top = top.getNext();
		size--;
		return temp;
	}

	public String peek() throws EmptyStackException
	{
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		return top.getElement();
	}

	public int size()
	{
		return size;
	}

	public Boolean contains(String target)
	{
		for (Node i = top; i != null; i = i.getNext())
		{
			if (i.getElement().equalsIgnoreCase(target))
			{
				return true;
			}
		}
		return false;

	}

	@Override
	public String toString()
	{
		String message = "";

		Node iterator = top;
		if (iterator != null)
		{
			message += iterator.getElement();
			iterator = iterator.getNext();
		}
		for (; iterator != null; iterator = iterator.getNext())
		{
			message += ", " + iterator.getElement();
		}
		return message;
	}
}
