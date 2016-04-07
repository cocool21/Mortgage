import java.math.RoundingMode;
import java.text.NumberFormat;

public class Format {
	public Format(){
		
	}
	public String FormatPayment(double payment){
	NumberFormat nf= NumberFormat.getInstance();
	nf.setMaximumFractionDigits(2);
	nf.setMinimumFractionDigits(2);
	nf.setRoundingMode(RoundingMode.HALF_UP);
	return "$"+nf.format(payment);
	}
}
