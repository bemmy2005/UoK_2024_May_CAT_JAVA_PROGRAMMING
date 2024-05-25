package question_6;

public class volume extends measurement {
	void convert(String fromUnit, String toUnit, double value) {
        double result = 0;
        switch (fromUnit) {
        case "l":
            switch (toUnit) {
                case "cl":
                    result = value * 10;
                    break;
                case "l":
                    result = value / 10;
                    break;
            }
            break;
        }
	}

}
