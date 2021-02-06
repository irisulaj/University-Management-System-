
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iri_s
 */
public class Functions {
    // function that adds elements to our lists
        public static void AddElementToList(JList lst, String data ){
    
           //add elements to the list
        int size = lst.getModel().getSize();
        DefaultListModel dm = new DefaultListModel();
        
        for(int i=0; i<size; i++){
        dm.addElement(lst.getModel().getElementAt(i));
        }
        
        dm.addElement(data);
        lst.setModel(dm);
    }
    
   //function that clears input fields when we cancel input or after we have added a set of inputs
        
        public static void ClearTextFields(JLabel label, JTextField inputText1, JTextField inputText2){
        
     
        inputText1.setText("");
        inputText2.setText("");
        inputText1.requestFocus();
        label.setVisible(false);
        }
        
         //function that clears input fields when we cancel input or after we have added a set of inputs for Courses
        
        public static void ClearTextFieldsCourses(JLabel label, JTextField inputText1, JTextField inputText2, JTextField inputText3){
        
     
        inputText1.setText("");
        inputText2.setText("");
        inputText3.setText("");
        inputText1.requestFocus();
        label.setVisible(false);
        }
        
       //delete elements from the list
        
        public static void DeleteElementsFromList(JList lst, JLabel label) {
        
                 int SelectedIndex = lst.getSelectedIndex();
        
        if(SelectedIndex >=0) {
        DefaultListModel dm = new DefaultListModel();
        
        int size = lst.getModel().getSize();
        
        for(int i=0; i<size; i++){
            
           if(lst.getSelectedIndex() !=i){
             dm.addElement(lst.getModel().getElementAt(i));
          }  
        }
       lst.setModel(dm);
        }
        else {
        label.setText("Please select an item to delete");
        label.setVisible(true);
        }
     }
        
        
        public static void DeleteSelectedListElements(JList lst, int [] Array) {
        
            DefaultListModel dm = new DefaultListModel();
            int size = lst.getModel().getSize();
            
            for(int i=0; i<size; i++){
             boolean present = false;
             
             for(int j=0; j<Array.length; j++){
             
             if(lst.getModel().getElementAt(i).equals(lst.getModel().getElementAt(Array[j]))){
             present=true;
              break;
             }
            
            }          
             if(!present){
             dm.addElement(lst.getModel().getElementAt(i));
             
             }
         }
           lst.setModel(dm);
     }
        
}
