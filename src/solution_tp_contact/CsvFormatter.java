package solution_tp_contact;

public class CsvFormatter implements Formatter {
    @Override
    public String process(ContactForm form) {
        String entete = "objet,email,message\n";
        String data = form.getObjet() + "," + form.getEmail() + "," + form.getMessage() + "\n";
        return entete + data;
    }
}
