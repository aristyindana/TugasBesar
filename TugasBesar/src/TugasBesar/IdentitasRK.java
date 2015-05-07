package TugasBesar;

abstract public class IdentitasRK {
    
    private String namaRK;
    private String lokasiRK;
    private String programstudi_fakultas;

    public String getNamaRK() {
        return namaRK;
    }

    public void setNamaRK(String namaRK) {
        this.namaRK = namaRK;
    }

    public String getLokasiRK() {
        return lokasiRK;
    }

    public void setLokasiRK(String lokasiRK) {
        this.lokasiRK = lokasiRK;
    }

    public String getProgramstudi_fakultas() {
        return programstudi_fakultas;
    }

    public void setProgramstudi_fakultas(String programstudi_fakultas) {
        this.programstudi_fakultas = programstudi_fakultas;
    }
            
    abstract void analisis ();
    }
