package memory.area;

/**
 * Created by M on 02-03-2017.
 */
public class Memory {
    public static void main(String[] args){
        int i = 1;  // Stack memory
        Object obj = new Object();  //Object => Heap, obj => Stack (this is a reference)
        Memory mem = new Memory();  //Memory => Heap, mem => Stack
        mem.foo(obj); //another area in the stack
                        // with reference to Object (in Heap)

    }
    private void foo(Object param){     //param => Stack and reference same Object (in Heap)
        String str = param.toString();  //Pool of string in the Heap
        System.out.println(str);
    }
}

//garbage collector reclaims heap memory

/*  Java Heap Space

        • Java Heap space is used by java runtime to
        allocate memory to Objects and JRE classes.
        • Garbage Collection runs on the heap memory
        to free the memory used by objects that
        doesn’t have any reference.
        • Any object created in the heap space has
        global access and can be referenced from
        anywhere of the application.


    Java Stack Memory

        • Java Stack memory is used for execution of a
        thread.
        • They contain method specific values that are
        short-lived and references to other objects in
        the heap that are getting referred from the
        method.
        • Stack memory is always referenced in LIFO
*/