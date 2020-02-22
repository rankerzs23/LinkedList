public class LinkedList{
 Node head;
 Node tail;
 int count;
 
 //determine whether the list is empty
 public boolean isEmpty(){
  return count == 0;
 }
 
 public String toString(){
  StringBuffer sb = new StringBuffer();
  sb.append("{");
  Node p = head;
  while(p != null){
   sb.append(p.getItem() + " ");
   p = p.getNext();
  }
  sb.append("}");
  return sb.toString();
 }
 
 public void addFirst(int item){
  Node temp = new Node(item,head);
  if(isEmpty())
   tail = head = temp;
  else
  head = temp;
  count++;
 }
 
 public void addLast(int item){
 //
 }
 //output the list - ok
 //find the length of the list
 //retrieve the item contained in the first node
 public int getFirstElement(){
  if(!isEmpty())
   return head.getItem();
  return 0;
 }
 //retrieve the item contained in the last node
 public int getLastElement(){
  if(!isEmpty())
   return tail.getItem();
  return 0;
 }
 //search the list for a given item
 //public boolean isFound(int item){
 //}
 //insert an item in the list
 //delete an item from the list
 //public void delete(int item){
 //do this
 //}
 
 public static void main(String [] args){
  LinkedList list = new LinkedList();
  list.addFirst(5);
  list.addFirst(6);
  list.addFirst(7);
  System.out.println("list contains: " + list);
  System.out.println("The first element is :  " + list.getFirstElement());
  System.out.println("The first element is :  " + list.getLastElement());
 
 }
}