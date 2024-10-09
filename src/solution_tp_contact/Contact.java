package solution_tp_contact;

public class Contact {
    private String objet;
    private String email;
    private String message;

    public Contact(String objet, String email, String message) {
        this.objet = objet;
        this.email = email;
        this.message = message;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
