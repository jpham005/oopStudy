package visitor;

public class FileTreatmentException extends RuntimeException {

  public FileTreatmentException() {
    super("default file treatment exception");
  }

  public FileTreatmentException(String message) {
    super(message);
  }
}
