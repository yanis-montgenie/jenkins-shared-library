// src/org/exemple/utils/MonUtilitaire.groovy
package org.exemple.utils

class MonUtilitaire implements Serializable {
    static void saluer(script, nom) {
        script.echo "Bonjour de la Shared Library, ${nom} !"
        script.echo "Modification partie 5 de , ${nom} !"
    }

    static void partie5(script, nom) {
        script.echo "Nouvelle méthode partie 5 de , ${nom} !"
    }
    
    static String genererMessage(String type) {
        if (type == "succes") {
            return "Opération réussie !"
        } else {
            return "Opération échouée."
        }
    }
}
