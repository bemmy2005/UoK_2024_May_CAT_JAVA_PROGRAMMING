package question_6;

public class weight extends measurement {
	void convert(String fromUnit, String toUnit, double value) {
        double result = 0;
        switch (fromUnit) {
        case "kg":
            switch (toUnit) {
                case "g":
                    result = value * 1000;
                    break;
                case "kg":
                    result = value / 1000;
                    break;
            }
            break;
        }
	}

}
