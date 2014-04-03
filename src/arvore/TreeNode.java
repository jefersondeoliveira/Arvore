/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author Jeferson
 */
public class TreeNode {

    TreeNode esquerdaNode;
    int info;
    int altura;
    TreeNode direitaNode;

    public TreeNode(int nodeInfo) {
        info = nodeInfo;
        esquerdaNode = direitaNode = null;
    }

    public void insereNode(int insertValue) {
        if (insertValue < info) {
            if (esquerdaNode == null) {
                esquerdaNode = new TreeNode(insertValue);
            } else {
                esquerdaNode.insereNode(insertValue);
            }
        } else if (insertValue > info) {
            if (direitaNode == null) {
                direitaNode = new TreeNode(insertValue);
            } else {
                direitaNode.insereNode(insertValue);
            }
        }
    }
}
