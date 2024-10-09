package solution_tp_contact;

public class JsonFormatter implements Formatter {
    @Override
    public String process(ContactForm form) {
        return "{" +
                "\"objet\":\"" + form.getObjet() +
                "\",\"email\":\"" + form.getEmail() +
                "\",\"message\":\"" + form.getMessage() +
                "\"}";
    }
}
