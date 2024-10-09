package solution_tp_contact;

public class FormFormatter {

    private ContactForm form;

    public FormFormatter(ContactForm form) {
        this.form = form;
    }

    public String format(Formatter formatter) {
        String formattedForm = formatter.process(form);

//        System.out.println("Inside format method : " + formattedForm);
        return formattedForm;
    }
}
