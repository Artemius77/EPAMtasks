package businesslogic;

import java.text.DecimalFormat;

public class MainAction {

    private double transform(String param, double value){

        if (param.equals("Rad")) return Math.toRadians(value);
        else return Math.toDegrees(value);

    }


   /* DecimalFormat df = new DecimalFormat("#.####");
df.setRoundingMode(RoundingMode.CEILING);
for (Number n : Arrays.asList(12, 123.12345, 0.23, 0.1, 2341234.212431324)) {
        Double d = n.doubleValue();
        System.out.println(df.format(d));
    }*/
    private String roundingNumber(String precision, double value){
        int pointing = Integer.parseInt(precision);
        StringBuilder builder = new StringBuilder("#.");
        for (int i = 0; i < pointing; i++) {
            builder.append("#");
        }

        DecimalFormat df = new DecimalFormat(builder.toString());
        return (df.format(value));
    }

    public String calculate(String param, String function, double value, String precision){
        value = transform(param,value);
        double result = 0;
        switch (function) {
            case "sin": result =  Math.sin(value); break;
            case "cos": result = Math.cos(value);break;
            case "tg": result = Math.tan(value);break;
            case "ctg": result = 1.0 / Math.tan(value);break;
        }

        return roundingNumber(precision,result);
    }

}
