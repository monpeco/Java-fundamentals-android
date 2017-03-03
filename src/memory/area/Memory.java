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
