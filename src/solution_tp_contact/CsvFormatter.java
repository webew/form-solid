package solution_tp_contact;

import java.lang.reflect.Field;

public class CsvFormatter implements Formatter{
    @Override
    public String format(Form form) {
        String formCsv = "";
        Class<?> formClass = form.getClass();
        Field[] fields = formClass.getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);

            formCsv.concat(field.toString());
        }
        System.out.println(formCsv);
        return null;
    }
}
