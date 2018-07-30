package Jeux;

import java.util.Scanner;
  
public class Pendu {
   
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char mot[] = {'d','e','v','i','n','e'}; //Tableau comportant les lettres du mot "devine"
        
        char mot2[] = new char[mot.length]; // longueur du tableau rendue "automatique" grace a l'extention .length
        char caractere = ' ';
        Scanner lettre = new Scanner(System.in);
          
        while (mot2[0] != mot[0] || mot2[1] != mot[1] || mot2[2] != mot[2] || mot2[3] != mot[3] || mot2[4] != mot[4] || mot2[5] != mot[5])
        {
          System.out.println("Entrez une lettre:");
          caractere = lettre.next().charAt(0);
         
          for (int i=0;i < mot.length;i++)
          {
             if (caractere == mot[i])
             {
                 System.out.println(mot[i]);
                 mot2[i] = mot[i];
             }
              
             else
             {
                 System.out.println("*");
                 System.out.println(mot2);
             }
          }
            
         }
          
        System.out.println("bravo! Le mot était: " + mot2[0] + mot2[1] + mot2[2] + mot2[3]+ mot2[4]+ mot2[5]);
        
    }
    
}
