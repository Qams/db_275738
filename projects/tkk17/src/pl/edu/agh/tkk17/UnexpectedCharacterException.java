package pl.edu.agh.tkk17;

public class UnexpectedCharacterException extends OutputableException
{
    public UnexpectedCharacterException(char character, String location)
    {
        super("Unexpected character '" + character + "' at " + location + ".");
    }
}
