package FifthPractise.FirstTaskString.model.ValidationUtils.interfaces;

import FifthPractise.FirstTaskString.model.ValidationUtils.validators.TypeValidators;
import FifthPractise.FirstTaskString.model.entities.RecordClass;

public interface ValidationStrategy {

    boolean validate(RecordClass record);

    TypeValidators getTypeValidators();
}
