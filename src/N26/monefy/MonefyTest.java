package N26.monefy;

import N26.monefy.screens.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

public class MonefyTest extends GenericMethods {

    public static void main(String[] args) throws Exception {

        AndroidDriver<AndroidElement> driver = null;
        try {
            driver = capabilities();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert driver != null;
        final AndroidDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        printMsg("Enter a Income");
        String incomeAmount = readValue();
        while (!isNumeric(incomeAmount)) {
            printMsg("This value is not numeric!, try again: ");
            incomeAmount = readValue();
        }

        printMsg("Enter a Expense");
        String expenseAmount = readValue();
        while (!isNumeric(expenseAmount)) {
            printMsg("This value is not numeric!, try again: ");
            expenseAmount = readValue();
        }

        // Adding new Income:
        Main main = new Main(driver);
        main.incomeButton.click();

        NewIncomes newIncomes = new NewIncomes(driver);
        typeAmountId(incomeAmount, driver);
        newIncomes.categoryButton.click();

        CategoryIncomes categoryIncomes = new CategoryIncomes(driver);
        categoryIncomes.deposit.click();

        // Adding new Expense:
        main.expenseButton.click();
        typeAmountId(expenseAmount, driver);

        NewExpenses newExpenses = new NewExpenses(driver);
        newExpenses.categoryButton.click();

        CategoryExpenses categoryExpenses = new CategoryExpenses(driver);
        categoryExpenses.bills.click();

        /* Validating balance against income - expense: */
        //Getting balance:
        new Main(driver).balanceButton.click();
        Balances balances = new Balances(driver);
        String balance = balances.balanceButton.getText();
        balance = removeChar(balance, "Balance $,");
        BigDecimal newBalance = str2BigDecimal(balance);

        //Getting back to main screen
        balances.balanceButton.click();
        main.rightPanelButton.click();

        //Validating total incomes minus total expenses:
        BigDecimal validation = Balances.incomesMinusExpenses(balances.amount.size(), balances.category, balances.amount);
        printMsg("Incomes minus Expenses is: " + validation + " and the Balances is: " + newBalance);

        //Obtained result in test execution:
        if (areEqual(validation, newBalance)) {
            printMsg("Successful calculation!");
        } else {
            printMsg("Failed calculation!");
        }
        closeDriver();


    }
}