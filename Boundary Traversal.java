class Solution{
  ArrayList <Integer> list=new ArrayList <Integer>();
	ArrayList <Integer> boundary(Node root){
	    if(root==null) return list;
	    if(root.left==null && root.right==null){
	        list.add(root.data);
	        return list;
	    }
	    list.add(root.data);
	    leftBoundry(root.left);
	    inorder(root);
	    rightRevBoundry(root.right);
	    
	    return list;
	    
	}
	void leftBoundry(Node root){
	    if(root==null) return;
	    if(root.left!=null){
	        list.add(root.data);
	        leftBoundry(root.left);
	    }
	    else if(root.right!=null){
	        list.add(root.data);
	        leftBoundry(root.right);
	    }
	}
	void inorder(Node root){
	    if(root==null) return;
	    inorder(root.left);
	    if(root.left==null && root.right==null) list.add(root.data);
	    inorder(root.right);
	    return;

	}
	void rightRevBoundry(Node root){
	    if(root==null) return;
	    if(root.right!=null){
	        rightRevBoundry(root.right);
	        list.add(root.data);
	    }
	    else if(root.left!=null){
	        rightRevBoundry(root.left);
	        list.add(root.data);
	    }
	 }
}
