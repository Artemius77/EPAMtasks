package FifthPractise.FirstTaskString.model.ValidationUtils.validators;


import FifthPractise.FirstTaskString.model.ValidationUtils.interfaces.ValidationStrategy;
import FifthPractise.FirstTaskString.model.entities.RecordClass;

public enum InputValidators implements ValidationStrategy{

    NAMEVALID(TypeValidators.NAME) {
        @Override
        public boolean validate(RecordClass record) {
           return record.getName().matches("^[a-zA-Z]+");
        }
    },

    BIRTHDAYVALID(TypeValidators.BIRTHDAY) {
        @Override
        public boolean validate(RecordClass record) {
            return record.getBirthday().matches("^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$");
        }
    },

    NUMBERVALID(TypeValidators.NUMBER) {
        @Override
        public boolean validate(RecordClass record) {
            return record.getNumber().matches("\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})");
        }
    },

    ADRESSVALID(TypeValidators.ADRESS) {
        @Override
        public boolean validate(RecordClass record) {
            return record.getLocation().matches("^[A-z]+\\s[A-z]+\\.?\\s\\d+");
        }
    },

    LASTNAMEVALID(TypeValidators.LASTNAME) {
        @Override
        public boolean validate(RecordClass record) {
            return record.getLastName().matches("^[a-zA-Z]+");
        }
    };


    private TypeValidators type;


     InputValidators(TypeValidators type) {
        this.type = type;
    }

    @Override
    public TypeValidators getTypeValidators() {
        return type;
    }
}
