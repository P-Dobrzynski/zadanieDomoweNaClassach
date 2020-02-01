package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	NumberConverter.toBinary(256);
	NumberConverter.toHex( 666 );
	NumberConverter.toBinary( 111);



		System.out.println("\n ****************************************************************** \n");


		Address employeeAddress = new Address("Poland ", "Szczecin ", "70-356 ", "ul. Pocztowa ",
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


		System.out.println(employee.toString(employeeAddress.getCountry() + employeeAddress.getCity() +
				employeeAddress.getPostalCode() + employeeAddress.getStreet() + employeeAddress.getHouseNumber() +
				"/" + employeeAddress.getFlatNumber()));

		employee.getEmploymentDuration();

		System.out.println("\n ****************************************************************** \n");


		Circle circle = new Circle( 8.00, 2, 4);

		circle.calculateArea(); // tu zwracamy pole koła

		System.out.println("obwód koła wynosi: "+ circle.calculateCircumference()); // tu zwracamy jego obwód

		System.out.println(circle.isColliding(6.00, 12,16)); // tu liczymy collision ?


	}


}
