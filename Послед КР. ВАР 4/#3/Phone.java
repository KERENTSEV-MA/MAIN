public class Phone {
    public enum PhoneType {
        STATSIONAR, MOBILE
    }

    private String number;
    private PhoneType type;

    public Phone(String number, PhoneType type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public PhoneType getType() {
        return type;
    }

    public String toString() {
        return number + " (" + type + ")";
    }


}