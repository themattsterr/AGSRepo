package GraderSpec;

/**
 * @author Matt
 *
 */
public class Module {
	
	private Assignment assignment;
	
	/**
	 * gets info from grader specification module
	 * @return
	 */
	public void GetGraderSpecification(){
		assignment = new Assignment();

		GetAssignmentInfo();
		GetAssignmentFiles();
		GetRubric();
        
        
	}
	
    /**
     * Gets information values from GUI 
     *
     */
	public void GetAssignmentInfo(){
		//get each fields current values in assignment info
        //assignment.SetTitle(titleInputTextBox.GetText());
		
	}
	
	// Assignment aove
	public void GetAssignmentFiles(){
		//get each fields current values in assignment files
	}

	/**
     * Gets rubric values from GUI 
     *
     */
	public void GetRubric(){
		
	}
    
	//Things Here and then some
    public Assignment GetAssignment(){
        return assignment;
    }
	
	
}