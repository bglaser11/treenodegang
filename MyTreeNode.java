public class MyTreeNode {
    public long key;
    public double data;
    public MyTreeNode left;
    public MyTreeNode right;
    public MyTreeNode(long newKey, double newData, MyTreeNode newLeft, MyTreeNode newRight){
        key = newKey;
        data = newData;
        left = newLeft;
        right = newRight;
    }
    public MyTreeNode(int newKey, double newData, MyTreeNode newLeft, MyTreeNode newRight){
        key = (long)newKey;
        data = newData;
        left = newLeft;
        right = newRight;
    }
    public MyTreeNode(int newKey, double newData){
        key = (long)newKey;
        data = newData;
        left = null;
        right = null;
    }
    public void displayMyTreeNode() {
        System.out.print(key + " : " + data);
    }
}