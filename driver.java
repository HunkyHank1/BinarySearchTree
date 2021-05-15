/*
Henry Johnson
5/14/21
The purpose of this program is to test the binary search tree
 */

public class driver {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("should return true: "+ bst.isEmpty());
        bst.put("KeyOne","one");
        System.out.println("should return false: "+bst.isEmpty());
        System.out.println("should return one: "+bst.size());
        bst.put("KeyTwo","two");
        bst.put("KeyThree", "three");
        System.out.println("should print true: "+bst.contains("KeyTwo"));
        System.out.println("should print false: "+bst.contains("mmmmmmmmmmmm"));
        System.out.println("should print two: "+bst.get("KeyTwo"));
        System.out.println("should print KeyOne: "+bst.min());
        System.out.println("should print three: "+bst.max());
        //min
        //max
        //remove
        //contains
        //get(node,key)
        //put(node,key,value)
        //isempty
        //size(node)
    }
}
