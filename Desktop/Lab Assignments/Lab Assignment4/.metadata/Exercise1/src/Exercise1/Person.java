package Exercise1;

public class Person {

	/**
	 * declaring the variables
	 */
          private String name;
          private float age;
          /**
           * parameterised constructor
           * @param name
           * @param age
           */

          public Person(String name,float age) {
        	  super();
        	  this.name=name;
        	  this.age=age;
          }
          /**
           * getters and setters
           * @return
           */
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getAge() {
			return age;
		}

		public void setAge(float age) {
			this.age = age;
		}
          
	

}