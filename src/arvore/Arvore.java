/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author Jeferson
 */
public class Arvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tree Arvore1 = new Tree();
        Tree Arvore2 = new Tree();
        Tree Arvore3 = new Tree();

        Arvore1.insereNode(7);       Arvore1.insereNode(11);
        Arvore1.insereNode(17);      Arvore1.insereNode(25);
        Arvore1.insereNode(31);      Arvore1.insereNode(43);
        Arvore1.insereNode(44);      Arvore1.insereNode(47);
        Arvore1.insereNode(65);      Arvore1.insereNode(68);
        Arvore1.insereNode(77);      Arvore1.insereNode(93);
        
        Arvore2.insereNode(47);      Arvore2.insereNode(25);
        Arvore2.insereNode(77);      Arvore2.insereNode(11);
        Arvore2.insereNode(43);      Arvore2.insereNode(7);
        Arvore2.insereNode(17);      Arvore2.insereNode(31);
        Arvore2.insereNode(44);      Arvore2.insereNode(65);
        Arvore2.insereNode(93);      Arvore2.insereNode(68);
        
        
        Arvore3.insereNode(20);      Arvore3.insereNode(10);
        Arvore3.insereNode(5);       Arvore3.insereNode(15);
        Arvore3.insereNode(32);


        System.out.println("Preorder traversal");
        System.out.print("Arvore1 ");
        Arvore1.preorderTraversal();
        System.out.print("\nArvore2 ");
        Arvore2.preorderTraversal();

        System.out.println("\n\nPosorder traversal");
        System.out.print("Arvore1 ");
        Arvore1.postorderTraversal();
        System.out.print("\nArvore2 ");
        Arvore2.postorderTraversal();

        System.out.println("\n\nInorder traversal");
        System.out.print("Arvore1 ");
        Arvore1.inorderTraversal();
        System.out.print("\nArvore2 ");
        Arvore2.inorderTraversal();
        
        System.out.println("\n\nFolhas");
        System.out.print("Arvore1 ");
        Arvore1.getFolhas();
        System.out.print("\nArvore2 ");
        Arvore2.getFolhas();
        
        System.out.println("\n\nExternos");
        System.out.print("Arvore1 ");
        Arvore1.getInternos();
        System.out.print("\nArvore2 ");
        Arvore2.getInternos();
        
        
        System.out.println("\n\nGrau");
        System.out.print("Arvore1 ");
        Arvore1.getGrau();
        System.out.print("\nArvore2 ");
        Arvore2.getGrau();
        
        System.out.println("\n\nNivel");
        System.out.print("Arvore1 ");
        Arvore1.getNivel();
        System.out.print("\nArvore2 ");
        Arvore2.getNivel();
        
        System.out.println("\n\nAltura");
        System.out.print("\nArvore3 \n"+Arvore3.getAltura());

    }
}
