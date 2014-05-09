package portugol;
import portugol.parser.*;
import portugol.lexer.*;
import portugol.node.*;
import java.io.*;

public class Compiler
{
 public static void main(String[] arguments)
 {
  try
  {
   System.out.println("Type an arithmetic expression:");


   // Create a Parser instance.
   Parser p =
    new Parser(
    new Lexer(
    new PushbackReader(
    new InputStreamReader(System.in), 1024)));


   // Parse the input.
   Start tree = p.parse();


   // Apply the translation.
   tree.apply(new Translation());
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());
  }
 }
}