package Task03FirmData;

import java.util.Scanner;

/*3.  Дадена фирма има име, адрес, телефонен номер, факс номер, уеб сайт и мениджър.
 Мениджърът има име, фамилия и телефонен номер. Напишете програма, която чете информацията
 за компанията и нейния мениджър и я отпечатва след това на конзолата.
 */
public class Task03FirmData {

    public static void main(String[] args) {
        String firmName;
        String address;
        String firmPhoneNumber;
        String fax;
        String webSite;
        String managerFName;
        String managerLName;
        String managerPhoneNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Insert firm's data:");
        System.out.print("name: ");
        firmName = input.next();
        System.out.print("address: ");
        address = input.next();
        System.out.print("phone number: ");
        firmPhoneNumber = input.next();
        System.out.print("fax: ");
        fax = input.next();
        System.out.print("web site: ");
        webSite = input.next();

        System.out.println("");
        System.out.println("Insert manager's data:");
        System.out.print("first name: ");
        managerFName = input.next();
        System.out.print("last name: ");
        managerLName = input.next();
        System.out.print("phone number: ");
        managerPhoneNumber = input.next();

        System.out.println("");
        System.out.printf("Firm data:%n\t%s%n\t%s%n\t%s%n\t%s%n\t%s%n",
                firmName,
                address,
                firmPhoneNumber,
                fax,
                webSite);
        System.out.printf("Manager's data: %n\t%s%n\t%s%n\t%s%n",
                managerFName,
                managerFName,
                managerPhoneNumber);

    }

}
