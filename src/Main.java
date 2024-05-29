//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Employee bill = new Employee("Bill", "01/01/1990",  "12/19/2023");
        System.out.println(bill);
        System.out.println("Age = " + bill.getAge());
        System.out.println("Pay = " + bill.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "12/12/1999", "12/01/2020", 40000.0);
        System.out.println(joe);

        System.out.println("Joes Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joes pension checks= $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary" , "05/05/2001", "01/03/2021", 15.0);
        System.out.println(mary);
        System.out.println("Marys Paycheck = $" + mary.collectPay());
        System.out.println("Marys holiday pay is $" + mary.getDoublePay()
                + ". Her age is " + mary.getAge()
        );
    }
}