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

	/**
	 * Empty Assignment constructor
	 */
	public Assignment(){
		_title = "Empty Assignment";
		_rubric = new Rubric();
	}
	
	/**
	 * Constructor for Assignment without rubric and I/O stuff
	 * @param title
	 * @param description
	 * @param classCode
	 * @param sectionCode
	 */
	public Assignment(String title, String description, String classCode, String sectionCode){
		_title = title;
		_description = description;
		_classCode = classCode;
		_sectionCode = sectionCode;
		_rubric = new Rubric();
	}
	
	/**
	 * Constructor for Assignment without rubric
	 * @param title
	 * @param description
	 * @param classCode
	 * @param sectionCode
	 * @param inputFilePath
	 * @param sourceFilePath
	 * @param outputFilePath
	 * @param commandLineInstruction
	 */
	public Assignment(String title, String description, String classCode, String sectionCode, String infoFilePath, String inputFilePath, String sourceFilePath, String outputFilePath, String commandLineInstruction){
		_title = title;
		_description = description;
		_classCode = classCode;
		_sectionCode = sectionCode;
		_infoFilePath = infoFilePath;
		_officialInputFilePath = inputFilePath;
		_officialOutputFilePath = sourceFilePath;
		_solutionSourceFilePath = outputFilePath;
		_commandLineInstruction = commandLineInstruction;
		_rubric = new Rubric();
	}
	
	/**
	 * Constructor for Assignment
	 * @param title
	 * @param description
	 * @param classCode
	 * @param sectionCode
	 * @param inputFilePath
	 * @param sourceFilePath
	 * @param outputFilePath
	 * @param commandLineInstruction
	 * @param rubric
	 */
	public Assignment(String title, String description, String classCode, String sectionCode, String infoFilePath, String inputFilePath, String sourceFilePath, String outputFilePath, String commandLineInstruction, Rubric rubric){
		_title = title;
		_description = description;
		_classCode = classCode;
		_sectionCode = sectionCode;
		_infoFilePath = infoFilePath;
		_officialInputFilePath = inputFilePath;
		_officialOutputFilePath = sourceFilePath;
		_solutionSourceFilePath = outputFilePath;
		_commandLineInstruction = commandLineInstruction;
		_rubric = rubric;
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
