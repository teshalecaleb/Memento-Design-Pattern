/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Helen
 */
class AssembledPuzzle 
{
   
    private String title;
    private String description;
     
    public AssembledPuzzle( String title, String description) {
        super();
        this.title = title;
        this.description = description;
    }
          
    public AssembledPuzzledMemento createMemento()
    {
    AssembledPuzzledMemento  d = new AssembledPuzzledMemento ( title,description);
        return d;
    }
     
    public void restore(AssembledPuzzledMemento  d) {
        
        this.title = d.getTitle();
    
        this.description = d.getDescription();
    }
 
    @Override
    public String toString() {
        return "Puzle Game Started =>" +  title + "=>" + description ;
    }

	public void setContent(String description) {
		this.description = description;
	}
}

final class AssembledPuzzledMemento 
{

    private final String title;

    private final String description;
     
    public AssembledPuzzledMemento (String title, String description) {
        super();
    
        this.title = title;
    
        this.description = description;
    }
 
   
 
    public String getTitle() {
        return title;
    }


 
    public String getDescription() {
        return description;
    }
}



public class MementoDesignPattern {
	
	public static void main(String[] args)
    {
        AssembledPuzzle puzzle = new AssembledPuzzle ("State of my puzzle", "Build1");
        puzzle.setContent("Build 1");    
        System.out.println(puzzle);
         
    AssembledPuzzledMemento  memento = puzzle.createMemento(); 
         
        puzzle.setContent("Build 2");      
        System.out.println(puzzle);
         
        puzzle.restore(memento);       
        System.out.println(puzzle);    
    }
}
