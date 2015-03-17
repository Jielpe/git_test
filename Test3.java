// variables : conv = soit CF soit FC; reponseProg; reponseConv = si l'utilisateur s'est trompé; cel = valeur degrés celsius; fah = val deg fahren
String conv;
char reponseProg, reponseConv;
double cel, fah;
// Notre objet Scanner
Scanner sc = new Scanner(System.in);
// Début du programme
do{
	System.out.println("Bonjour et bienvenue dans le programme de conversion !")
	do{
		System.out.println("Au choix, conversion de degrés Celsius en degrés Fahrenheit (tapez : CF) ou bien degrés Fahrenheit en degrés Celsius (tapez : FC). Alors ?");
		conv = sc.nextLine();
		// Test de la réponse de l'utilisateur
		while (conv != CF && conv != FC) 
			{
				System.out.println("Vous avez mal tapé votre réponse (rappel, soit CF soit FC). Alors ?");
				conv = sc.nextLine();	
			}

		// Cas où elle est correcte, on rappel son choix...
		switch (conv) {
						case "CF":
							System.out.println("Vous avez choisi de convertir en degrés Fahrenheit des degrés Celsius.");
							break;
						case "FC":
							System.out.println("Vous avez choisi de convertir en degrés Celsius des degrés Fahrenheit.");
							break;
						default:
							System.out.println("Erreur...");
						}
		// ... en le vérifiant
		System.out.println("Êtes-vous d'accord ? (O/N)");
		reponseConv = sc.nextLine().charAt(0);
	}while (reponseConv == 'N');
	// On a le choix de la conv vérifié, cas 1: CF , cas 2: FC
	if (conv == CF) {
		System.out.println("Entrez votre valeur à convertir :");
		cel = sc.nextDouble();
		fah = cel+1;
		System.out.println( cel + " °C en donnent " + fah + " °F.")
	}
	else{
		System.out.println("Entrez votre valeur à convertir :");
		fah = sc.nextDouble();
		cel = fah + 1;
		System.out.println( fah + " °F en donnent " + cel + " °C.")
	}
	 do{
	    System.out.println("Voulez-vous réessayer ? (O/N)");
	    // On vide la ligne
	    sc.nextLine();
	    reponseProg = sc.nextLine().charAt(0);
	  }while(reponseProg != 'O' && reponseProg != 'N');
}while (reponseProg == 'O');

System.out.println("Au revoir et merci d'avoir utilisé ce programme");

