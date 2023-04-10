package ch02;

public class MyEncoder implements IEncoder {

	@Override
	public String encode(String message) {
		String resultEncode = ">>>" + message + "<<<";
		return resultEncode;
	}

}
