public class Node {
	
	
	// class programming recursively (without the usage of while of for loops) binary search tree 
	int value = 0;

	
	public Node(int value) {
		this.value = value;
	}

	
	// default value for a node is to have nor right of left child nodes
	public Node rightChild = null;
	public Node leftChild = null;

	
	// method inserting the new node with a given value to it's right place 
	public void insert(int a) {
		if (this.value > a) {
			if (this.leftChild == null) {
				this.leftChild = new Node(a);
			} else {
				this.leftChild.insert(a);
			}
		} else {
			if (this.value == 0) {
				this.value = a;
			} else {
				if (this.rightChild == null) {
					this.rightChild = new Node(a);
				} else {
					this.rightChild.insert(a);
				}
			}
		}
	}

	// method produces a string representation of all the nodes in a tree in an increasing order
	public String toString() {
		String string = Integer.toString(this.value);
		if (this.rightChild != null & this.leftChild != null) {
			return this.leftChild.toString() + " " + string + " " + this.rightChild.toString();
		} else if (this.rightChild != null) {
			return string + " " + this.rightChild.toString();
		} else if (this.leftChild != null) {
			return this.leftChild.toString() + " " + string;
		} else {
			return string;
		}
	}

	
	// method return true is the tree contains the node 
	public Boolean contains(int a) {

		if (this.value == a) {
			return true;
		} else {
			if (this.value < a) {
				if (this.rightChild != null) {
					return this.rightChild.contains(a);
				} else {
					return false;
				}
			} else {
				if (this.leftChild != null) {
					return this.leftChild.contains(a);
				} else {
					return false;
				}
			}
		}
	}
	
	// method return the size of a tree (the number of all the nodes)
	public int size() {
		int i = 0;
		if (this.value != 0) {
			i++;
			if(this.leftChild != null) {
				i = i + this.leftChild.size();
			}
			if(rightChild != null){
				i = i + this.rightChild.size();
			}
		}
		return i; 
	}

	
	// the method 
	// done to be used in the remove method 
	public Node findRL(Node n) {
		if (n.rightChild == null) {
			return n; 
		} else { 
			return findRL(n.rightChild);
		}
	}
	
	
	// method removes a node with a given value from the tree and puts the remaining ones in a new proper order
	// if the node with a given value does not exist the function simply returns false
	// if the node to be removed is the only node in the tree the method changes its value to 0 
	// if the tree has multiple nodes with the value to be removed the method removes only one of them 
	public boolean remove(int a) {
		if (contains(a)) {
			if (this.value == a) {
				if (this.leftChild != null) {
					this.value = this.leftChild.value; 
					findRL(this.leftChild).rightChild = this.rightChild;
					if (this.leftChild.rightChild != null) {
						this.rightChild = this.leftChild.rightChild;
					}
					if (this.leftChild.leftChild != null) {
						this.leftChild = this.leftChild.leftChild;
					} else {
						this.leftChild = this.leftChild.leftChild;
					}
				} else if (this.rightChild != null) {
					this.value = this.rightChild.value;
					if (this.rightChild.rightChild != null) {
						this.rightChild = this.rightChild.rightChild;
					} else {
						this.rightChild = this.rightChild.rightChild;
					}
					if (this.rightChild.leftChild != null) {
						this.leftChild = this.rightChild.leftChild;
					} 
				} else {
					this.value = 0; 
				}
				return true;
			}
			if (this.value < a) {
				if (this.rightChild != null) {
					if (this.rightChild.value == a) {
						if (this.rightChild.leftChild != null) {
							findRL(this.rightChild.leftChild).rightChild = this.rightChild.rightChild;
							this.rightChild = this.rightChild.leftChild;
						} else if (this.rightChild.rightChild != null) {
							this.rightChild = this.rightChild.rightChild;
						} else {
							this.rightChild = null; 
						}
					} else {
						this.rightChild.remove(a);
					}
				}
			} else {
				if (this.leftChild != null) {
					if (this.leftChild.value == a) {
						if (this.leftChild.leftChild != null) {
							findRL(this.leftChild.leftChild).rightChild = this.leftChild.rightChild; 
							this.leftChild = this.leftChild.leftChild;
						} else if (this.leftChild.rightChild != null) {
							this.leftChild = this.leftChild.rightChild;			
						} else {
							this.leftChild = null;
						}
					} else {
						this.leftChild.remove(a);
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
}
