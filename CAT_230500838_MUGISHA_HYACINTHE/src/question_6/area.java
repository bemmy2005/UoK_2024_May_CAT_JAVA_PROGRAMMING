package question_6;

public class area extends measurement{
	void convert(String fromUnit, String toUnit, double value) {
        double result = 0;
        switch (fromUnit) {
        case "km*2":
            switch (toUnit) {
                case "m*2":
                    result = value * 1000*2;
                    break;
                case "km*2":
                    result = value*2/1000;
                    break;
            }
            break;
        }
	}

}
