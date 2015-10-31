package evtree;

/**
 * EVTree implementation.
 * @author Jonatan Hamberg
 */
public class EVTree {

    EVNode root;

    /**
     * Initializes the tree.
     * @param root Root node
     */
    public EVTree(EVNode root) {
        this.root = root;
    }

    /**
     * @return Root node
     */
    public EVNode getRoot() {
        return root;
    }
    
    /**
     * Prints a tree of full depth.
     */
    public void print(){
        this.print(Integer.MAX_VALUE);
    }
    
    /**
     * Prints a tree of custom depth.
     * @param depth Depth of traversal
     */
    public void print(int depth) {
        print(root, "", depth);
    }
    
    // Recursively prints the tree as a list
    private void print(EVNode root, String prefix, int depth){
        if(root == null || depth < 0) return;
        System.out.println(prefix 
                + "+- " + root.getSplit() 
                + ": " + root.getValue() 
                + " (" + root.getEv() + ")");
        for(EVNode child : root.getChildren()){
            print(child, prefix+"|  ", depth-1);
        }
    }
}