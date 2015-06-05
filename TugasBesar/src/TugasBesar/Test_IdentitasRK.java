package TugasBesar;

import java.io.IOException;
import java.util.Scanner;

public class Test_IdentitasRK {
    
    
    public static void main(String[] args)  throws IOException  {
        Input_IdentitasRK IK = new Input_IdentitasRK(null, null, null);
        IK.analisis_identitasRK();
        
        Input_Jml_kds_pssPrasarana IJ = new Input_Jml_kds_pssPrasarana(null, null, null);
        IJ.analisis_identitasRK();
        IJ.analisis();
    }}
