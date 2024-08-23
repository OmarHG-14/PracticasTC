public class EdadException extends Exception {
    public static final long serialVersionUID=700L;
    
    public EdadException(){

    }

    public EdadException(String mensaje){
        super(mensaje);
    }

    public EdadException(int edad) throws EdadException{
        this.validarEdad(edad);
    }

    public void validarEdad(int edad) throws EdadException{
        if (edad<18 && edad>=0) {
            throw new EdadException("Error de edad");
        }
    }
}