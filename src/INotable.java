
//interface INotable
interface INotable
{
	/**
	 * First method next_todo()
	 * which takes no parameters and
	 * @return a Note Object
	 */
    Note next_todo();
    
    /**
     * Second method save() which takes single string
     * @param filename and 
     * @return boolean indicating success or failure 
     */
    boolean save(String filename);
}


class Note
{
	
}
