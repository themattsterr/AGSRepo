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
     *
     *
     */
	public void AssignmentInfo(){
		//get each fields current values in assignment info
        assignment.SetTitle(titleInputTextBox.GetText());
		
	}
	
	public void AssignmentFiles(){
		//get each fields current values in assignment files
	}

	public void GetRubric(){
		
	}
    
    public Assignment GetAssignment(){
        return assignment;
    }
	
	
}