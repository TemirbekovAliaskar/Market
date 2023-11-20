public class Card {

    protected String firstName;
    protected String lastName;
    protected int cardNumber;
    protected int balans;
    protected String password;

    public Card(String firstName, String lastName, int cardNumber, int balans, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.balans = balans;
        this.password = password;
    }

    public boolean checkPassword(String pass){
        return password.equals(pass);
    }
}
