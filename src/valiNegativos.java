class valiNegativos{
    void valiNegativos( int param ) throws miExcepcion {
        if ( param < 0 )
            throw new miExcepcion("Número negativo");
    }
}
