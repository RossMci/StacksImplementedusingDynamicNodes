package Nodespackage;

/**
 *
 * @author Ross Mcinerney
 */
public class Node
{

	private Node next;
	private String element;

	public Node()
	{
		this(null, null);
	}

	public Node(String e, Node n)
	{
		element = e;
		next = n;
	}

	public void setElement(String newElem)
	{
		element = newElem;
	}

	public void setNext(Node newNext)
	{
		next = newNext;
	}
	
	  public String getElement( ) 
  { 	return element; 		}

	  public Node getNext( ) 
  { 	return next; 		}



}
