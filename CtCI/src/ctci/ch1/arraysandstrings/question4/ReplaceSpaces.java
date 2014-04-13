package ctci.ch1.arraysandstrings.question4;

public class ReplaceSpaces {

	public String replaceSpaces(String string, int trueLength) {
		if (trueLength == 0) {
			return string;
		}
		
		char[] contents = string.toCharArray();
		int wordEnd = contents.length - (contents.length - trueLength) - 1;
		int paddingEnd = contents.length - 1;
		
		for (int i = wordEnd; i >= 0; i--) {
			if (isSpace(contents[i])) {
				shiftRight(contents, i + 1, paddingEnd, wordEnd);
				int wordLength = wordEnd - i;
				paddingEnd -= wordLength;
				wordEnd = i - 1;
				contents[i] = '%';
				contents[i + 1] = '2';
				contents[i + 2] = '0';
			}
		}
		System.out.println(new String(contents));
		return new String(contents);
		
	}
	
	private boolean isSpace(char c) {
		if (c == ' ') {
			return true;
		}
		return false;
	}
	
	private void shiftRight(char[] contents, int wordStart, int paddingEnd, int wordEnd) {
		for (int i = wordEnd; i >= wordStart; i--) {
			contents[paddingEnd] = contents[i];
			paddingEnd--;
		}
	}
}
