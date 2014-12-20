package model;

public class ColaboradorID {
	
	 private String id;

	    public ColaboradorID(String id) {
	        this.id = id;
	    }
	    
	    public boolean equals(Object obj) {
	        return (obj instanceof ColaboradorID && id.equals(((ColaboradorID)obj).id));
	    }

	    public String toString() {
	    	return id;
	    }
	
}
