package question_6;

public class temperature extends measurement{
	void convert(String fromUnit, String toUnit, double value) {
        double result = 0;
        switch (fromUnit) {
        case "f":
            switch (toUnit) {
                case "c":
                    result = value+32*9/5;
                    break;
                
            }
            break;
        }
	}

}
