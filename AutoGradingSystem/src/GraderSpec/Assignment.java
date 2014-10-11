package GraderSpec;

public class Assignment {
	
	private String _title = "";
	private String _description = "";
	private String _classCode = "";
	private String _sectionCode = "";
	// assignment information file path
	private String _infoFilePath = "";
	//
	private String _officialInputFilePath = "";
	//
	private String _solutionSourceFilePath = "";
	//
	private String _officialOutputFilePath = "";
	private String _commandLineInstruction = "";
	private Rubric _rubric;

	public Assignment(){
		
	}
    
    public void SetTitle(String title){
        _title = title;
    }

    public void SetDescription(String description){
    	_description = description;
    }

    public void SetClassCode(String classCode){
    	_classCode = classCode;
    }

    public void SetSectionCode(String sectionCode){
    	_sectionCode = sectionCode;
    }

    public void SetInfoFilePath(String infoFilePath){
    	_infoFilePath = infoFilePath;
    }

    public void SetOfficialInputFile(String officialInputFilePath){
    	_officialInputFilePath = officialInputFilePath;
    }

    public void SetOfficialOutputFile(String officialOutputFilePath){
    	_officialOutputFilePath = officialOutputFilePath;
    }

    public void SetSolutionSourceFilePath(String solutionSourceFilePath){
    	_solutionSourceFilePath = solutionSourceFilePath;
    }

    public void SetCommandLineInstruction(String commandLineInstruction){
    	_commandLineInstruction = commandLineInstruction;
    }

    public void SetRubric(Rubric rubric){
    	_rubric = rubric;
    }

    public String GetTitle(){
    	return _title;
    }

    public String GetDescription(){
    	return _description;
    }

    public String GetClassCode(){
    	return _classCode;
    }

    public String GetSectionCode(){
    	return _sectionCode;
    }

    public String GetInfoFilePath(){
    	return _infoFilePath;
    }

    public String GetOfficialInputFile(){
    	return _officialInputFilePath;
    }

    public String GetOfficialOutputFile(){
    	return _officialOutputFilePath;
    }

    public String GetSolutionSourceFilePath(){
    	return _solutionSourceFilePath;
    }

    public String GetCommandLineInstruction(){
    	return _commandLineInstruction;
    }

    public Rubric GetRubric(){
    	return _rubric;
    }
	
}
