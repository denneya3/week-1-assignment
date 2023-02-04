public class Polygon {
    //class variables
	private int sides; //priority over shape type
    private double sideLength; 
    private String shape;
	private String secondaryShapeName;
    
	private boolean autoCorrect; // determines whether the program will auto correct invalid shapes/sides when mutated
	
	//utility variables
	final String[] shapeNames = {"triangle","square","pentagon","hexagon"};
    final int[][] sideIndices = {{3,0},{4,1},{5,2},{6,3}}; // {numSides, shapeNames Index}
	
    public Polygon(){
        autoCorrect = true;
		sides = 4;
        sideLength = 1.0;
        classifyShape();
    }

    public Polygon(int numSides, double sideLength, String shape){
		autoCorrect = true;
		sides = numSides;
		this.sideLength = sideLength;
		if (autoCorrect){
			classifyShape(); //String shape is unused for validation
		} else {
			this.shape = shape;
		}
	
    }

	//if shape sides not in array, invalid shape 

	//private utility methods

	private void updateSecondaryShapeName(){
		if (sides==4){
			secondaryShapeName = "rectangle";	
			return;
		}
		secondaryShapeName = null;
	}

	private boolean checkShapeSidesWithName(int numSides, String shapeName){
		for (shapeIndices : int[] l ){
				if (l[0] == numSides){ //are java arrays always in order?
					if (shapeName.equals(shapeNames[l[1]]){
						return true;
					} else {
						return false;
					}
				}					
		}
		
		return false;
	}

    private String classifyShape(){
		updateSecondaryShapeName() //include in javadocs!
		
		for (shapeIndices : int[] l){
			if (l[0]==sides){
					return shapeNames[l[1]];
			}
		}
        return null;
    }
	
	private void classifySides(){
		for (shapeIndices : String s){
			if (shapeNames[l[1]].equals(s)){
				sides = l[0];
				return;
			}
		}
	}

	private double roundTo(int decimalPlaces){
		
		return 2.0;
	}

	//mutators

	public void setShape(String shape){
		if (autoCorrect){
			for (shapeNames : String s){
				if (s.equals(shape)){
					this.shape = shape; //shape exists
					classifySides();
					return;
				}
			}
			return;
		} else {
			this.shape = shape;
		}
	}
	public void setSides(int sides){
		this.sides = sides;
		if (autoCorrect){
			classifyShape();
		}
		
	}
	public void setSideLength(double length){
		sideLength = length;
	}


	// other methods
	public double calculateArea(){
		
		return 2.0;
	}
	
	public double calculatePerimeter(){
		return sides*length;
	}

	public boolean checkForValidity(){
		
		return true;
	}


	//accessors
	
    public int getNumSides(){
        return sides;
    }

    public double getSideLength(){
        return sideLength;
    }

    public String getShapeType(){
        return shape;
    }
	
	public String getSecondaryShapeName(){
		return secondaryShapeName;
	}
	
	public String toString(){
		if (!autoCorrect && !checkForValidity()){
			return "Invalid Shape";
		}
		double perimeter = roundTo(calculatePerimeter());
		return "sides: "+sides+" perimeter: "+perimeter+" shape name: "+shape+" secondary shape name: "+secondaryShapeName;
	} //better tostring?
	
	//boolean correction on?
	
}
