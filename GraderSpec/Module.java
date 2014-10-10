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
		GetAssignmentInfo();
		GetAssignmentFiles();
		GetRubric();
        
        assignment = new Assignment();
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