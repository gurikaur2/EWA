
/* Explain what the following code prints. Draw a picture of the linked list and the iterator position after each step.

LinkedList<String> staff = new LinkedList<>();
ListIterator<String> iterator = staff.listIterator();
iterator.add(“Tom”);
iterator.add(“Diana”);
iterator.add(“Harry”);
iterator = staff.listIterator();
If(iterator.next().equals(“Tom”))
{
    iterator.remove();
}
while(iterator.hasNext()){
    System.out.println(iterator.next());
}
 */