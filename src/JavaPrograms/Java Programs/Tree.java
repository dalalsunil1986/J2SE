/**
  * Calls the levelOrder helper method and prints out in levelOrder.
  */
 public void levelOrder()
 {
  q = new QueueList();
  treeHeight = height();
  levelOrder(myRoot, q, myLevel);
 }
  /**
  * Helper method that uses recursion to print out the tree in 
  * levelOrder
  */
 private void levelOrder(TreeNode root, QueueList q, int curLev)
 {
  System.out.print(curLev);
  if(root == null)
  {
   return;
  }
   if(q.isEmpty())
  {
   System.out.println(root.getValue());
  }
  else
  {
   System.out.print((String)q.dequeue()+", ");
  }
   if(root.getLeft() != null)
  {
   q.enqueue(root.getLeft().getValue());
   System.out.println();
  }
  if(root.getRight() != null)
  {
   q.enqueue(root.getRight().getValue());
   System.out.println();
   curLev++;
  }
   levelOrder(root.getLeft(),q, curLev);
  levelOrder(root.getRight(),q, curLev);
 }