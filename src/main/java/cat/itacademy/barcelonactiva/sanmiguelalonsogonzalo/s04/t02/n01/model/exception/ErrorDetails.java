package cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t02.n01.model.exception;


public class ErrorDetails extends Message {

    private Integer status;

    public ErrorDetails(Integer status, String message) {
        super(message);
        this.status = status;
    }

    public Integer getStatus() {

        return status;
    }

    public String getMessage() {

        return super.getMessage();
    }

}
