package question_6;

public class speed extends measurement{
	void convert(String fromUnit, String toUnit, double value) {
        double result = 0;
        switch (fromUnit) {
        case "km/s":
            switch (toUnit) {
                case "m/s":
                    result = value*1000/3600;
                    break;
                case "km/s":
                    result = value*3600/1000;
                    break;
            }
            break;
        }
	}

}
