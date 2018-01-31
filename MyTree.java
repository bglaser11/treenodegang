import java.util.Scanner;
public class MyTree{
    //protected MyTreeNode root;
    public MyTreeNode root;
    public MyTree(){
        root=null;
    }
    public MyTree(MyTreeNode ueet){
        root=ueet;
    }
    public boolean add(MyTreeNode n){
        if (root == null)
            root=n;
        else 
            root=add(root,n);
        return true;
    }
    public MyTreeNode add(MyTreeNode r, MyTreeNode n){
        if (r == null){
            r=n;
        } else if (n.key == r.key){
            r.data=n.data;
        } else if (n.key < r.key){
            if(r.left!=null)
                r.left=add(r.left,n);
            else
                r.left=n;
        } else if (n.key > r.key){
            if(r.right!=null)
                r.right=add(r.right,n);
            else
                r.right=n;
        }
        return r;
    }
    public void get(long k){
        MyTreeNode temp=root;
        boolean out=false;
        do{
            if (temp == null){
                System.out.println("Not in tree");
                out=true;
            } else if (k == temp.key){
                System.out.println(temp.key + ":" + temp.data);
                out=true;
            } else if (k < temp.key){
                temp=temp.left;
            } else if (k > root.key){
                temp=temp.right;
            }
        } while (out == false);
    }
    public void remove(long k, MyTreeNode n){
        if(this==null);
        else if(n.key==k){
            MyTreeNode replacement;
            replacement = n.right;
            while(replacement.left!=null){
               replacement = replacement.left;
            }
            n.key = replacement.key;
            n.data = replacement.data;
            replacement = null;
        }
        else{
            remove(k,n.left);
            remove(k,n.right);
        }
    }
    public void preO(){
        preO(root);
    }
    public void preO(MyTreeNode r){
        if(r!=null){
            String out=r.key + ":" + r.data+", ";
            System.out.print(out);
            if(r.left!=null)
                preO(root.left);
            if(r.right!=null)
                preO(root.right);
        }
    }
    public void postO(){
        postO(root);
    }
    public void postO(MyTreeNode r){
        if(r!=null){
            String out=r.key + ":" + r.data+", ";
            if(r.left!=null)
                postO(root.left);
            if(r.right!=null)
                postO(root.right);
            System.out.print(out);
        }
    }
    public void inO(){
        inO(root);
    }
    public void inO(MyTreeNode r){
        if(r!=null){
            String out=r.key + ":" + r.data+", ";
            if(r.left!=null)
                inO(root.left);
            System.out.print(out);
            if(r.right!=null)
                inO(root.right);
        }
    }
    public void revO(){
        revO(root);
    }
    public void revO(MyTreeNode r){
        if(r!=null){
            String out=r.key + ":" + r.data+", ";
            if(r.right!=null)
                revO(root.right);
            System.out.print(out);
            if(r.left!=null)
                revO(root.left);
        }
    }
    public static void main(String[] args){
        int out=0;
        MyTreeNode t1=new MyTreeNode(1,1.1);
        MyTreeNode t3=new MyTreeNode(3,3.1);
        MyTreeNode t2=new MyTreeNode((long)2,2.1,t1,t3);
        MyTree ueet=new MyTree(t2);
        
        
        
        System.out.println("\nFinding key=1");
        ueet.get((long)1);
        /*
        System.out.println("\nAdding (4:4.1)");
        ueet.add(new MyTreeNode(4,4.1));
        ueet.inO();
        */
        do{
            do{
                Scanner ask=new Scanner(System.in);
                System.out.println("1: Add");
                System.out.println("2: Get");
                System.out.println("3: Remove");
                System.out.println("4: Print in Preorder");
                System.out.println("5: Print in Postorder");
                System.out.println("6: Print in Inorder");
                System.out.println("7: Print in Reverse order");
                System.out.println("8: Exit/Quit");
                Boolean temp=false;
                do{
                    System.out.println("Which option would you like to do? (#)");
                    try{
                        out=ask.nextInt();
                        temp=true;
                    } catch (Exception e){
                        ask.nextLine();
                    }
                } while (temp == false);
            } while (1 > out || out > 8);
            switch (out){
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        } while (out != 8);
    }
}