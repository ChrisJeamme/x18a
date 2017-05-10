package interfaceExterne;

import bdd.BDD;
import bdd.InteractionBDD;
import clientExterne.InteractionServeur;
import donnees.Utilisateur;

public class DialogConnexionInfo {
	  private String pseudo, mdp;

	  public DialogConnexionInfo(){}
	  public DialogConnexionInfo(String pseudo, String mdp){
		Utilisateur u = new Utilisateur();
	    u.setPseudo(pseudo);
	    u.setMotDePasse(mdp);
	    
	    /*BDD db = new BDD();

		String redirection;
		String message;
		Utilisateur u = InteractionBDD.verificationConnexion(db, pseudo, mdp);
		if (u != null) //L'utilisateur existe et s'est correctement authentifiť
		{
			message = "Bonjour";
		}
		else 
		{
			message = "Utilisateur inconnu ou mot de passe incorrect.";
		}
		db.disconnect();*/
	    
	    InteractionServeur.currentInteractionServeur.ajoutUtilisateur(u);
	  }
	}