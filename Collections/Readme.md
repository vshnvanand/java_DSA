## Collection

What ?
- A grouped bunch of objects which shares same nature
- It is very much similar not same or equal similar to the interfaces 

Why? 
- So that instead of modifying and building same function of all instance variable or data types you can buch all of them at one and apply 

Collection
List - Ordered collection and can store duplicates 
Set - Unorded and no duplicates
Queue - Fifo
Deque Double ended queue pronounced as deck not de-Q
Map 




Collection 
- List
    - ArrayList
    - LinkedList
    - Vector
    - Stack
    - CopyOnWriteArrayList

- Set
    - HashSet
    - LinkedHashSet
    - TreeSet
    - EnumSet
    - ConcurrentSkipListSet
    - SortedSet
    - CopyOnWriteArraySet

- Queue
    - LinkedSet
    - PriortyQueue
    - Deque
        - Array Deque
        - Linked List
        - ConcurrentLinkedDeque
    - BlockingQueue
    - ArrayBlockingQueue
    - LinkedBlockingQueue
    - PriortyBlockingQueue
    - SynchronousQueue
    - DelayQueue
    - ConcurrentLinkedQueue


--------------------------------------------------------------------------------
- Arraylist : is same as array but is flexible like elongate and shrink as per the use

size vs capacity size is the number of the elements exist in the array and capacity is the amount of items it can store in the beggining
The initial size of an ArrayList is 10 

Working:
Step 1: First it check is there space or not, is resizing required or not 
Step 2: Then if we need to resize an new array is create of it 1.5 past times and copy all the element from the old one to the new one 
Step 3: Add the new element and the size is increased

var.add(value) - add new value
var.get(index) - by index
var.remove(Object) : use Wrapper like Integer.valueOf() // Mota mota yeh hai ki if you put an integer it will remove index and value in thing like string then value 

var.contains() - 
var.size() - not many elements are there in the list not the storage or space occupied by the list 
