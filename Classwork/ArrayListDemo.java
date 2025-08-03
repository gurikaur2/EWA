import java.util.ArrayList;
class ArrayListDemo{
public static void main(String[] args) 
{
    ArrayList<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("World!");
    list.add("Java");
    list.add("Programming");

    //Print the arraylist
    //System.out.println("ArrayList: "+ list); 

    //Printing arraylist using FOR loop
   /*  System.out.println("Using FOR loop:");
    for(int i=0; i<list.size();i++)
    {
        System.out.println(list.get(i));
    } */

    //printing arraylists using for-each loop
    /* System.out.println("USing for-each loop:");
    for(String value: list)
    {
        System.out.println(value);
    } */

    //update an element 
    /* list.set(2,"Python");
    System.out.println(list);
 */

    //remove an element
   /*  list.remove(1);
    System.out.println("After removing index 1:" + list);

    list.remove("Hello");
    System.out.println(list); */

    //create a new arraylist of type integer
    /* ArrayList<Integer> intList=new ArrayList<>();
    intList.add(10);
    intList.add(20);
    System.out.println(intList);
 */

 //checking if list contains an element
 /* boolean containsPython= list.contains("Python");
 System.out.println("Does the list contain 'Python'?"+ containsPython); */

 //checking if list is empty
/*  boolean isEmpty= list.isEmpty();
 System.out.println(isEmpty); */

//new list
ArrayList<String> newList= new ArrayList<>();

newList.add("Initial");
System.out.println("New ArrayList with Initial capacity : "+newList);

//convert ArrayList to array
String[] array = new String[newList.size()];
newList.toArray(array);
System.out.println("Array converted from array list:");
for(String str:array)
{
    System.out.println(str);
}







}
}