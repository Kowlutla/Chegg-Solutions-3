package com.chegg.sportsclub;
	
	import java.util.ArrayList;
	
	public class Club {
	
		private String name;
		private String city;
		private Administrator chairPerson;
	
		ArrayList<Person> members;
		ArrayList<Sport> sportList;
	
		/**
		 * @param name
		 * @param city
		 * @param chairPerson
		 */
		public Club(String name, String city, Administrator chairPerson) {
			super();
			this.name = name;
			this.city = city;
			this.chairPerson = chairPerson;
			this.members = new ArrayList<Person>();
			this.sportList = new ArrayList<Sport>();
		}
	
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
	
		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}
	
		/**
		 * @return the chairPerson
		 */
		public Administrator getChairPerson() {
			return chairPerson;
		}
	
		/**
		 * @return the members
		 */
		public ArrayList<Person> getMembers() {
			return members;
		}
	
		/**
		 * @return the sportList
		 */
		public ArrayList<Sport> getSportList() {
			return sportList;
		}
	
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
	
		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}
	
		/**
		 * @param chairPerson the chairPerson to set
		 */
		public void setChairPerson(Administrator chairPerson) {
			this.chairPerson = chairPerson;
		}
	
		public void addMember(Person p) {
	
			if (p instanceof Player || p instanceof Coach) {
				members.add(p);
			}
	
		}
	
		public Person findMember(int id) {
	
			for (Person p : members) {
				if (p.getId() == id) {
					return p;
				}
			}
			return null;
		}
	
		public void removeMember(Person p) {
			members.remove(p);
	
		}
	
		public void addSport(Sport sport) {
			sportList.add(sport);
		}
	
	}
