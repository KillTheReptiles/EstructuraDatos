package upb.edu.co;

public class AVL {

    public Node root;

    public AVL() {
        this.root = null;
    }

    public AVL(int object) {
        this.root = new Node(object);
    }

    public Node search(int ob, Node root) {
        if (this.root == null) {
            return null;
        } else if (root.object == ob) {
            return root;
        } else if (root.object < ob) {
            return search(ob, root.right);
        } else {
            return search(ob, root.left);
        }
    }

    public Node rotacionIzquierda(Node n) {
        if (n != null) {
            Node temp = n.left;
            n.left = temp.right;
            temp.right = n;
            n.peso = Math.max(n.left.peso, n.right.peso) + 1;
            temp.peso = Math.max(n.left.peso, n.right.peso) + 1;
            return temp;
        } else {
            return null;
        }
    }

    public Node rotacionDerecha(Node n) {
        if (n != null) {
            Node temp = n.right;
            n.right = temp.left;
            temp.left = n;
            n.peso = Math.max(n

                    .left.peso, n.right.peso) + 1;
            temp.peso = Math.max(n.left.peso, n.right.peso) + 1;
            return temp;
        } else {
            return null;
        }
    }

    public Node rotacionIzquierdaDoble(Node n) {
        if (n != null) {
            Node temp;
            n.left = rotacionDerecha(n);
            temp = rotacionIzquierda(n);
            return temp;
        } else {
            return null;
        }
    }

    public Node rotacionDerechaDoble(Node n) {
        if (n != null) {
            Node temp;
            n.right = rotacionIzquierda(n.right);
            temp = rotacionDerecha(n);
            return temp;
        } else {
            return null;
        }
    }

    public Node revisarInsertar(Node n, Node root) {
        Node padre = root;
        if (n.object < root.object) {
            if (root.left == null) {
                root.left = n;
            } else {
                root.left = revisarInsertar(n, root.left);
                if ((root.left.peso - root.right.peso) == 2) {
                    if (n.object < root.left.object) {
                        padre = rotacionIzquierda(root);
                    } else {
                        padre = rotacionIzquierdaDoble(root);
                    }
                }
            }
        } else if (n.object > root.object) {
            if (root.right == null) {
                root.right = n;
            } else {
                root.right = revisarInsertar(n, root.right);
                if ((root.right.peso - root.left.peso) == 2) {
                    if (n.object > root.right.object) {
                        padre = rotacionDerecha(root);
                    } else {
                        padre = rotacionDerechaDoble(root);
                    }
                }
            }
        } else {
            System.out.println("En este arbol ya se encuentra el nodo que intenta ingresar");
        }

        if ((root.left == null) && (root.right != null)) {
            root.peso = root.right.peso + 1;
        } else if ((root.right == null) && (root.left != null)) {
            root.peso = root.left.peso + 1;
        } else {
            root.peso = Math.max(root.left.peso, root.right.peso) + 1;
        }
        return padre;
    }

    public void insertar(int n) {
        Node nodoNuevo = new Node(n);
        if (root == null) {
            root = nodoNuevo;
        } else {
            root = revisarInsertar(nodoNuevo, root);
        }
    }

    public String preOrder(Node root) {

        String pre = "";
        Node node = root;
        pre = String.valueOf(node.object);

        if (node.left != null) {
            pre += preOrder(node.left);
        }
        if (node.right != null) {
            pre += preOrder(node.right);
        }
        return pre;

    }

    public String inOrder(Node root) {
        String in = "";
        Node node = root;
        if (node.left != null) {
            in = inOrder(node.left);
        }

        in += String.valueOf(node.object);

        if (node.right != null) {
            in += inOrder(node.right);
        }
        return in;
    }

    public String posOrder(Node root) {
        String pos = "";
        Node node = root;
        if (node.left != null) {
            pos = posOrder(node.left);
        }
        if (node.right != null) {
            pos += posOrder(node.right);
        }
        pos += String.valueOf(node.object);
        return pos;
    }

    @Override
    public String toString() {
        return "BinTree{" +
                "root=" + root +
                '}';
    }
}
