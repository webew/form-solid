package solution_tp_contact;

public class Main {
    public static void main(String[] args){
        ContactForm cf = new ContactForm("un objet", "toto@toto.fr", "un message");
        FormFormatter f = new FormFormatter(cf);
        String csvFormattedForm = f.format(new CsvFormatter());
        System.out.println("In Main class : " + csvFormattedForm);

        String JsonFormattedForm = f.format(new JsonFormatter());
        System.out.println("In Main class : " + JsonFormattedForm);
    }
}
