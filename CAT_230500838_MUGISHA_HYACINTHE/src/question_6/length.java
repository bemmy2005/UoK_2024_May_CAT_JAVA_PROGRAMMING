package question_6;



public class length extends measurement {
	void convert(String fromUnit, String toUnit, double value) {
        double result = 0;
        switch (fromUnit) {
        case "km":
            switch (toUnit) {
                case "m":
                    result = value * 1000;
                    break;
                case "km":
                    result = value / 1000;
                    break;
            }
            break;
            
        }
	}
	

}
