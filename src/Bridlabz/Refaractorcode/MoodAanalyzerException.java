package Bridlabz.Refaractorcode;

public class MoodAanalyzerException extends Exception {
    public String message;
    static ExceptionType type;

    enum ExceptionType {
        EMPTY, NULL;
    }


    public MoodAnalyzerException(ExceptionType type, String message) {
        this.message = message;
        this.type = type;
    }
}