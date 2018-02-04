object AddOneRow {
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  object Direction extends Enumeration {
    val left, right = Value
  }

  def addOneRow(root: TreeNode, v: Int, d: Int): TreeNode = {
    addOneRow(root, v, d, Direction.left)
  }
  def addOneRow(root: TreeNode, v: Int, d: Int, direction: Direction.Value): TreeNode = {
    if(root==null && d>1) {
      null
    }else if(d==1){
      val node = new TreeNode(v)
      if(direction == Direction.left) {
        node.left = root
      } else {
        node.right = root
      }

      node
    }else {
      root.left = addOneRow(root.left, v, d-1, Direction.left)
      root.right = addOneRow(root.right, v, d-1, Direction.right)
      root
    }
  }
}
