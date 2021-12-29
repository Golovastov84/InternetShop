package ForCompany;

public class Main {
    public static void main(String[] args) {
        BankDetails details = new BankDetails();
        details.setBillNumber("4079547487947");
        Company company = new Company("Смарт Экспресс", details);
        // some code
        details.setBillNumber("5089547487947");
        System.out.println(company);

        BankDetails copy = new BankDetails(details.getBillNumber(),
                details.getCorrespondenceBill(),
                details.getBikNumber(),
                details.getBankName(),
                details.getCity());
        System.out.println(copy);

    }
}
