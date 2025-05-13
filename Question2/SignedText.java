public class SignedText {
    private String firstName;
    private String lastName;

    public SignedText(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getSignature() {
        if (firstName.length() == 0) {
            return lastName;
        } else {
            return firstName.substring(0, 1) + "-" + lastName;
        }
    }

    public String addSignature(String add) {
        String sig = getSignature();
        String sigLen = getSignature().length();


        if (sig.indexOf(add) == 0) {
            return + add.substring(sigLen) + sig;
        } else if (sig.indexOf(add) == sig.length() - add.length()) {
            return add;
        }

        return add + sig;
    }
}
