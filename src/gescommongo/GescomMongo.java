/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gescommongo;

import controleur.ControleurCategorie;
import modele.Categorie;
import modele.CategorieDao;
import modele.Connexion;
import vue.CategorieVue;

/**
 *
 * @author Formation
 */
public class GescomMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   //     Connexion.getConnexion();
       // Categorie cat = new Categorie(2,"CD"); //création de l'objet catégorie
        //CategorieDao catDao = new CategorieDao();//création de l'objet DaoCat 
        
        //insertion du l'objet cat à la collection categorie;
  //      catDao.addCategorie(cat);
        ///catDao.deleteCategorie(cat);
        //System.out.println(catDao.getOneCategorie(2));
        
        //CategorieVue catVue = new CategorieVue();
       // catVue.setVisible(true);
       
        ControleurCategorie controlCat = new ControleurCategorie();
      }
    
}
