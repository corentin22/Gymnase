/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author blood
 */
public class ModelPrat extends AbstractTableModel{
    private String[] nomColonnes = {"Reference association", "Sport"};
    private Object[][] data = new Object[10][2];
    
    
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return nomColonnes.length;
    }

    @Override
    public Object getValueAt(int ligne, int colonne) {
        return data[ligne][colonne];
    }
    
    public String getColumnName(int colonne){
        return nomColonnes[colonne];
    }
    
    public void setValueAt (Object valeur, int ligne, int colonne){
        data[ligne][colonne] = valeur;
        fireTableCellUpdated(ligne, colonne);
    }
    
    public void removeRow(int position){
         
        int indice = 0, indice2 = 0, nbRow = this.getRowCount()-1, nbCol = this.getColumnCount();
        Object temp[][] = new Object[nbRow][nbCol];
         
        for(Object[] value : this.data){
            if(indice != position){
                temp[indice2++] = value;
            }
            indice++;
        }
        this.data = temp;
        temp = null;
        //Cette méthode permet d'avertir le tableau que les données ont été modifiées
        //Ce qui permet une mise à jours complète du tableau
        this.fireTableDataChanged();
    }
}
