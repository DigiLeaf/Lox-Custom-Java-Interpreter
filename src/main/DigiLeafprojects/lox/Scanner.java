package main.DigiLeafprojects.lox;


import java.util.ArrayList;
import java.util.List;
import static main.DigiLeafprojects.lox.TokenType.*;

public class Scanner {
    private int start = 0;
    private int current = 0;
    private int line = 1;

    private final String source;
    private final List<Token> tokens = new ArrayList<>();

    Scanner(String source){
        this.source = source;
    }

    List<Token> scanToken(){
        while(!isAtEnd()){
            start = current;
            scanToken();
        }
        tokens.add(new Token(EOF, "", null, line));
        return tokens;
    }

    private boolean isAtEnd(){
        return current >= source.length();
    }
}
