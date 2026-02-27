## Is java is a pure object oriented language ?

No, java is object oriented language but it also have primitives 8 other primative datatype 
namely int, bool, double, float, etc.

--------------------------------------------------------------------------------
## Int vs int

Integer is a wrapper class based on the primitive int making it a class object

--------------------------------------------------------------------------------
### Autoboxing

Automatically converting a primiative into classes
Integer b = Integer.valueOf(1); // in reality this is what it is 
but java automatically does is 
Integer b = 1;

### Autounboxing

int c = b.intValue(); 
b.intValue(); // unneccessry 

you can do 
int c = b;
This is autounboxing 


--------------------------------------------------------------------------------
### Methods

Math.max(a, b);
Math.min(a, b);
Math.abs(c);
Math.ceil(d); Smallest integer "greater" than d
Math.floor(d); Largest integer "smaller" than d
Math.round(d); closest integer
Math.sqrt(e);
Math.pow(a,b); a^b
Math.log(x); base e
Math.log10(x); base x
Math.PI
Math.sin();
Math.cos();
Math.E
Math.random(); 0-1 exculding 1
Math.toDegrees();
Math.toRadians();

Math.nextAfter(1,2); next number after 1 in the direction of 2 : 1.0000001
Math.nextAfter(1,0); next number after 1 in the direction of 0 : 0.9999999
Same with before
--------------------------------------------------------------------------------

## Enums

- Enumeration : Categorization