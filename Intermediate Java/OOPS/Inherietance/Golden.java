public class Golden extends Dog {
    
    String name;

    @Override
    public void setName(String name){
        this.name = "From golden class " + name;
    }

    @Override // This is return here see if you are overriding and havent written overide it is fine it will overred but if you want to override and you havent override it by mistake at that time it checks and throws an error on you 
    public String getName(){
        super.getName(); // super refers to the imediate parent and just super means it is related to the constructor and super.something is the method to get both this method and the super method`
        System.out.println("Name is getting from the Golden class");
        return this.name;
    }

}
