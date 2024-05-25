package question6;

public class WEIGHT {

public class weight extends measurement {
    double convert(String fromUnit, String toUnit, double value) {
        double result = 0;
        switch (fromUnit) {
            case "kg":
                switch (toUnit) {
                    case "g":
                        result = value * 1000;
                        break;
                    case "lb":
                        result = value * 2.20462;
                        break;
                }
                break;
        }
        return result;
    
}

	

	

}

}
