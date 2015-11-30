class miExcepcion extends Exception {
    miExcepcion(){
        super(); // constructor por defecto de Exception
    }

    miExcepcion( String cadena ){
        super( cadena ); // constructor param. de Exception
    }
}