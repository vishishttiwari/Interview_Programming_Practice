package binary;

public class Convert_Decimal_to_Binary {
	public int convert1(int num) {
        String bin = "";
        while (num >= 1) {
            bin += Integer.toString(num % 2);
            num /= 2;
        }
        int output = Integer.parseInt(bin);
        return output;
    }
	
	public String convert2(int num) {
        String bin = "";
        while (num >= 1) {
            bin += Integer.toString(num % 2);
            num /= 2;
        }
        return bin;
    }
}
