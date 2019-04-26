import java.util.ArrayList;

public class BankCard extends BusinessCard {
    private static final char DOLLAR_BORDER = '$';
    private String bankAccount;
    public BankCard(String name, String surname, String account) {
        super(name, surname);
        bankAccount = account;
    }
    public String getAccount() {
        return bankAccount;
    }

    public void setAccount(String account) {
        this.bankAccount = account;
    }
    @Override
    protected ArrayList<String> getLines() {
        ArrayList<String> lines = super.getLines();
        lines.add(bankAccount);
        return lines;
    }
    @Override
    public char getBorder() {
        return DOLLAR_BORDER;
    }
}

