package Same1;
// package with default modifier 


import Same.Geek;

// This class is having 
// default access modifier 
class GeekNew { 
    public static void main(String args[]) { 
      
        // Accessing class Geek from package p1 
        Geek o = new Geek(); 

        o.display(); 
    } 
}