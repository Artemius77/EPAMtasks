package FifthPractise.FirstTaskString.model.ValidationUtils.context;

import FifthPractise.FirstTaskString.model.ValidationUtils.interfaces.ValidationStrategy;
import FifthPractise.FirstTaskString.model.ValidationUtils.validators.TypeValidators;
import FifthPractise.FirstTaskString.model.entities.RecordClass;

import java.util.*;

public class ValidationContext {

    private Set<ValidationStrategy> recordsValidators;

    public ValidationContext(Set<ValidationStrategy> recordsValidators) {
        this.recordsValidators = recordsValidators;
    }

    public TypeValidators singleCheck(RecordClass record) {

        for (ValidationStrategy recordValidation: recordsValidators
             ) {
            if (!recordValidation.validate(record))
                return recordValidation.getTypeValidators();
        }

        return TypeValidators.SUCCEED;
    }

    public List<TypeValidators> multipleCheck(RecordClass record) {

        List<TypeValidators> resultList = new ArrayList<>();
        for (ValidationStrategy recordValidation: recordsValidators
                ) {
            if (!recordValidation.validate(record))
                 resultList.add(recordValidation.getTypeValidators());
        }

        if (resultList.isEmpty()) {
            resultList.add(TypeValidators.SUCCEED);
            return resultList;
        }
        else return  resultList;
    }



}
