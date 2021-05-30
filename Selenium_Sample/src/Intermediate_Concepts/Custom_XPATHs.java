package Intermediate_Concepts;

public class Custom_XPATHs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  in chrome
		 *  cntrl + shift +I
		 *  cntrl + F
		 *
		 *1. //input[@class= 'xoxox' and @id = 'ahsgsg']
		 *2. //a[text()='features']    // for links 
		 *3. //a[contains(text(),'features')]
		 *4. 
		 *
		 *
		 *
		 *
		 * Buttons
		 * 1. //button[@type='button' and @class='btn']
		 * 2. //button[contains(text(),'Sign Up')
		 * 3. //div[@class='dropdown']//button[@type='button' and @class='btn btn-secondary dropdown-toggle' and @id='dropdownMenuButton']//button[@id='dropdownMenuButton']
		 * 
		 * 4. ++preceding-sibling:
		 *    //a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input
		 *    
		 *    ++parent & preceding-sibling:
         * 5.  //a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']
		 */



	}

}
