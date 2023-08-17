package com.ejercicios.ejerciciosudemy;

public class DaysOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaysOfTheWeek prueba = new DaysOfTheWeek();

	}

	enum DaysOfWeek {
		MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"),
		SATURDAY("Saturday"), SUNDAY("Sunday");

		private String name;

		DaysOfWeek(String name) {
			this.name = name;
		}

		public String getName() {
			// Write your code here to return the name of the day
			return name;
		}

		public boolean isWeekday() {
			// Write your code here to check if this day is a weekday
			if (name == "Monday" || name == "Tuesday" || name == "Thursday" || name == "Wednesday"
					|| name == "Friday") {
				return true;
			}
			return false;
		}

		public boolean isHoliday() {
			// Write your code here to check if this day is a holiday
			if (name == "Saturday" || name == "Sunday") {
				return true;
			}
			return false;
		}
	}
}