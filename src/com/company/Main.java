package com.company;

import com.Address;
import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
//	NumberConverter.toBinary(256);
//	NumberConverter.toHex( 666 );
//	NumberConverter.toBinary( 111);





		Address employeeAddress = new Address("Poland", "Szczecin", "70-356", "Pocztowa",
				48, 7);

		Employee employee = new Employee("Jan",
            "Kowalski",
            employeeAddress,
            26,
            "Male",
            "Kadry",
				LocalDate.of(2017, Month.MARCH, 11),
				LocalDate.of(2020, Month.JANUARY, 30)
		);

				// czy to jest metoda toString ?
		System.out.println("employee name: " + employee.getName() +"\n" +
				"employee surname: " + employee.getSurname() +"\n" +
				"employee address: " + employeeAddress.getCity() +", " +
				employeeAddress.getPostalCode() + " ul." +
				employeeAddress.getStreet() + " " +
				employeeAddress.getHouseNumber() + "/" +
				employeeAddress.getFlatNumber() + "\n" +
				"employee gender: " + employee.getGender() + "\n" +
				"employee departement: " + employee.getDepartement() + "\n" +
				"start of employment: " + employee.getStartOfEmployment() + "\n" +
				"end of employment: " + employee.getEndOfEmployment());

		employee.getEmploymentDuration();


//		Circle circle = new Circle( 8.00, 2, 4);
//
//		circle.calculateArea(); // tu zwracamy pole koła
//
//		System.out.println("obwód koła wynosi: "+ circle.calculateCircumference()); // tu zwracamy jego obwód
//
//		circle.isColliding(6.00, 12,16); // tu liczymy collision ?


	}


}
