/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author Jeferson
 */
public class Tree {

    private TreeNode raiz; //root

    public Tree() {
        raiz = null;
    }

    public void insereNode(int insertValue) {
        if (raiz == null) {
            raiz = new TreeNode(insertValue);
        } else {
            raiz.insereNode(insertValue);
        }
    }

    //começa percurso na pré-ordem
    public void preorderTraversal() {
        preorderHelper(raiz);
    }

    //método recursivo para fazer percurso na pré-ordem
    private void preorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.info + " , ");
        //percorre a subarvore a esquerda
        preorderHelper(node.esquerdaNode);
        //percorre a subarvore a direira
        preorderHelper(node.direitaNode);
    }

    //começa o percurso na ordem
    public void inorderTraversal() {
        inorderHelper(raiz);
    }

    //método recursivo para fazer o percurso na ordem
    private void inorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }
        //percorre a subarvore a esquerda
        inorderHelper(node.esquerdaNode);

        System.out.print(node.info + " , ");

        //percorre a subarvore a direita
        inorderHelper(node.direitaNode);
    }

    //começa o percurso na pós-ordem
    public void postorderTraversal() {
        postorderHelper(raiz);
    }

    //método recursivo para fazer o percurso na pós-ordem
    private void postorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }
        //percorre a subarvore esquerda
        postorderHelper(node.esquerdaNode);
        //percorre a subarvore direita
        postorderHelper(node.direitaNode);

        System.out.print(node.info + " , ");
    }

    public void getFolhas() {
        getFolhas(raiz);
    }

    //método recursivo para pegar as folhas
    private void getFolhas(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.esquerdaNode == null && node.direitaNode == null) {
            System.out.print(node.info + " , ");
        }
        //percorre a subarvore a esquerda
        getFolhas(node.esquerdaNode);
        //percorre a subarvore a direira
        getFolhas(node.direitaNode);
    }

    public void getInternos() {
        getInternos(raiz);
    }

    //método recursivo para pegar os internos
    private void getInternos(TreeNode node) {
        if (node == null) {
            return;
        }
        if ((node.esquerdaNode != node.direitaNode)) {
            System.out.print(node.info + " , ");
        }
        //percorre a subarvore a esquerda
        getInternos(node.esquerdaNode);
        //percorre a subarvore a direira
        getInternos(node.direitaNode);
    }

    public void getGrau() {
        getGrau(raiz);
    }

    //método recursivo para pegar os internos
    private void getGrau(TreeNode node) {
        if (node == null) {
            return;
        }

        int grau = 0;
        if (node.esquerdaNode != null) {
            grau++;
        }
        if (node.direitaNode != null) {
            grau++;
        }
        System.out.print("\nGrau(" + node.info + ") = " + grau);
        //percorre a subarvore a esquerda
        getGrau(node.esquerdaNode);
        //percorre a subarvore a direira
        getGrau(node.direitaNode);
    }

    public void getNivel() {
        getNivel(raiz, 0);
    }

    //método recursivo para pegar os internos
    private void getNivel(TreeNode node, int nivel) {
        if (node == null) {
            return;
        }
        System.out.print(node.info + " nivel: " + nivel + ", ");
        nivel++;
        //percorre a subarvore a esquerda
        getNivel(node.esquerdaNode, nivel);
        //percorre a subarvore a direira
        getNivel(node.direitaNode, nivel);
    }

    public int getAltura() {
        return getAltura(raiz);
    }

    //método recursivo para pegar os internos
    private int getAltura(TreeNode node) {
        if (node.direitaNode == node.esquerdaNode) {
            return 0;
        } else {
            return 1 + Math.max(getAltura(node.esquerdaNode), getAltura(node.direitaNode));
        }
    }
}
