package FifthPractise.FirstTaskString.model;

import FifthPractise.FirstTaskString.model.ValidationUtils.context.ValidationContext;
import FifthPractise.FirstTaskString.model.ValidationUtils.interfaces.ValidationStrategy;
import FifthPractise.FirstTaskString.model.ValidationUtils.validators.InputValidators;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainModel {

    private Set<ValidationStrategy> strategies;
    private ValidationContext context;

    public MainModel() {
        strategies =  new HashSet<>(Arrays.asList(InputValidators.BIRTHDAYVALID,
                InputValidators.NAMEVALID, InputValidators.ADRESSVALID, InputValidators.LASTNAMEVALID,
                InputValidators.NUMBERVALID));
        context = new ValidationContext(strategies);
    }


    public ValidationContext getAllValidations() {
       return context;
    }


    public ValidationContext getNamesValidation() {
        strategies =  new HashSet<>(Arrays.asList(
                InputValidators.NAMEVALID, InputValidators.LASTNAMEVALID,
                InputValidators.NUMBERVALID));

        context = new ValidationContext(strategies);
        return context;
    }


}
