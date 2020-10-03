/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodespackage;

/**
 *
 * @author Ross Mcinerney
 */
public class Stack 
{

	private Node top;
	private int size;
	
	public Stack(){
		top=null;
		size=0;
	}

	public boolean isEmpty()
						
	{
		if (top == null)
		{
			return true;
		} else
		{
			return false;
		}

	}


	public void push(String s)
	{   //# Push a new object on the stack
		Node n = new Node();
		n.setElement(s);
		n.setNext(top);
		top = n;
		size++;
	}

	public String pop() throws stackAcception
	{   //# Pop off the top stack element
		String temp;
		if (isEmpty())
		{
			throw new stackAcception("Stack is empty.");
		}
		temp = top.getElement();
		top = top.getNext();            // link-out the top node
		size--;
		return temp;
	}

	public String top() throws stackAcception
	{  //  Return the top stack element
		if (isEmpty())
		{
			throw new stackAcception("Stack is empty.");
		}
		return top.getElement();
	}

	public int size()
	{              //# Returns the current stack size
		return size;
	}

	
	// search
	public Boolean search(String target)throws stackAcception{
		Node current=top;
		
		if(isEmpty()){
			throw new stackAcception("Error Stack is Empty");
		}else{
			while(current!=null){
				if(current.getElement().equalsIgnoreCase(target)){
					return true;
					
				}else{
					current=current.getNext();
				}
			}
		}
		return true;
		
	}
	

//Delete
//	public void Delete()throws stackAcception{
//		if(isEmpty()){
//			throw new stackAcception("Error Stack is Empty");
//		}else{
//			while (!isEmpty()){
//			top= top.getNext();
//			size--;
//		}
//		}
//	}
	
//
	
	public String Display()throws stackAcception{
		Node current =top;
		String message="";
		while (current != null){
			String e =current.getElement()+"";
			current =current.getNext();
			message+=e+",";
		} 
		return message;
	}
	
//	@Override
//	public String toString(){
//		
//		return 
//	}

		}

