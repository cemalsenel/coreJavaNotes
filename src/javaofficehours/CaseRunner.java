package javaofficehours;

public class CaseRunner {
	/*
     * Create CaseRunner class
     * actualCase=Covid 19
     * isTested=true
     * conclusion=Tested Negative
     *
     * if conclusion contains "negative" print "You can go to work"
     * otherwise print "15 days quarantine"
     */

	public static void main(String[] args) {
		
		Case case1 = new Case();
		case1.setActualCase("Covid-19");
		case1.setTested(true);
		case1.setConclusion("Tested Negative");
		if(case1.getConclusion().toLowerCase().contains("negative")){
			System.out.println("You can go to work");
		}else {
			System.out.println("15 days quarantine");
		}
		
		 Patient patient = new Patient();
	        
	        patient.setFirstName("Cemal");
	        patient.setLastName("Senel");
	        System.out.println("Firstname : "+patient.getFirstName());
	        
	        
	        patient.setCaseOptions(case1);
	        
	        System.out.println(patient.getCaseOptions().getActualCase());
	        System.out.println(patient.getCaseOptions().getConclusion());
	        System.out.println(patient.getCaseOptions().isTested());

	}

}
