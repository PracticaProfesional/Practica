// Los tipos enteros estan por definirse si se quedaran asi o se cambiaran
package entidad;

/**
 * Esta clase representa los Signos Vitales
 * @author QUINCHO
 * @version 1.0, 04/12/2015
 */
public class SignosVitales {
    private double peso;
    private int frecuenciaCardiaca;
    private String presionArterial;
    private double indiceMasaCorporal;
    private double indiceMetabolicoBasal;
    private double aguaCorporal;
    private double masaCorporal;
    private double grasaCorporal;
    private int alimentacionSaludable;
    private int actividadFisica;
    private int saludSexual;
    private int papanicolaou;
    private int tratamientoIntramuscular;
    private int tratamientoIntravenoso;
    private int tratamientoSubcutaneo;
    private int glicemiaMicroMetodo;
    private int cuidadoPrenatal;
    private int entornoSaludable;
    private int prevencionAdicciones;
    private int examenMama;
    private int curaciones;
    private double temperatura;
    private double talla;
    
    /**
     * Obtiene la "alimentación saludable" de Signos Vitales
     * @return un entero que representa la "alimentación saludable" de Signos Vitales
     */
    public int getAlimentacionSaludable() {
        return alimentacionSaludable;
    }

    /**
     * Establece la "alimentación saludable" de Signos Vitales
     * @param alimentacionSaludable de tipo entero que representa la "alimentación saludable" de Signos Vitales
     */
    public void setAlimentacionSaludable(int alimentacionSaludable) {
        this.alimentacionSaludable = alimentacionSaludable;
    }

    /**
     * Obtiene la "actividad física" de Signos Vitales
     * @return un entero que representa la "actividad física" de Signos Vitales
     */
    public int getActividadFisica() {
        return actividadFisica;
    }

    /**
     * Establece la "actividad física" de Signos Vitales
     * @param actividadFisica de tipo entero que representa la "actividad física" de Signos Vitales
     */
    public void setActividadFisica(int actividadFisica) {
        this.actividadFisica = actividadFisica;
    }

    /**
     * Obtiene la "salud sexual" de Signos Vitales
     * @return un entero que representa la "salud sexual" de Signos Vitales
     */
    public int getSaludSexual() {
        return saludSexual;
    }

    /**
     * Establece la "salud sexual" de Signos Vitales
     * @param saludSexual de tipo entero que representa la "salud sexual" de Signos Vitales
     */
    public void setSaludSexual(int saludSexual) {
        this.saludSexual = saludSexual;
    }

    /**
     * Obtiene el "papanicolau" de Signos Vitales
     * @return un entero que representa el "papanicolau" de Signos Vitales
     */
    public int getPapanicolaou() {
        return papanicolaou;
    }

    /**
     * Establece el "papanicolau" de Signos Vitales
     * @param papanicolaou de tipo entero que representa el "papanicolau" de Signos Vitales
     */
    public void setPapanicolaou(int papanicolaou) {
        this.papanicolaou = papanicolaou;
    }

    /**
     * Obtiene el "tratamiento intramuscular" de Signos Vitales
     * @return un entero que representa el "tratamiento intramuscular" de Signos Vitales
     */
    public int getTratamientoIntramuscular() {
        return tratamientoIntramuscular;
    }

    /**
     * Establece el "tratamiento intramuscular" de Signos Vitales
     * @param tratamientoIntramuscular de tipo entero que representa el "tratamiento intramuscular" de Signos Vitales
     */
    public void setTratamientoIntramuscular(int tratamientoIntramuscular) {
        this.tratamientoIntramuscular = tratamientoIntramuscular;
    }

    /**
     * Obtiene el "tratamiento intravenoso" de Signos Vitales
     * @return un entero que representa el "tratamiento intravenoso" de Signos Vitales
     */
    public int getTratamientoIntravenoso() {
        return tratamientoIntravenoso;
    }

    /**
     * Establece el "tratamiento intravenoso" de Signos Vitales
     * @param tratamientoIntravenoso de tipo entero que representa el "tratamiento intravenoso" de Signos Vitales
     */
    public void setTratamientoIntravenoso(int tratamientoIntravenoso) {
        this.tratamientoIntravenoso = tratamientoIntravenoso;
    }

    /**
     * Obtiene el "tratamiento subcutaneo" de Signos Vitales
     * @return un entero que representa el "tratamiento subcutaneo" de Signos Vitales
     */
    public int getTratamientoSubcutaneo() {
        return tratamientoSubcutaneo;
    }

    /**
     * Establece el "tratamiento subcutaneo" de Signos Vitales
     * @param tratamientoSubcutaneo de tipo entero que representa el "tratamiento subcutaneo" de Signos Vitales
     */
    public void setTratamientoSubcutaneo(int tratamientoSubcutaneo) {
        this.tratamientoSubcutaneo = tratamientoSubcutaneo;
    }

    /**
     * Obtiene el "glicemia micrometodo" de Signos Vitales
     * @return un entero que representa el "glicemia micrometodo" de Signos Vitales
     */
    public int getGlicemiaMicroMetodo() {
        return glicemiaMicroMetodo;
    }

    /**
     * Establece el "glicemia micrometodo" de Signos Vitales
     * @param glicemiaMicroMetodo de tipo entero que representa el "glicemia micrometodo" de Signos Vitales
     */
    public void setGlicemiaMicroMetodo(int glicemiaMicroMetodo) {
        this.glicemiaMicroMetodo = glicemiaMicroMetodo;
    }

    /**
     * Obtiene el "cuidado prenatal" de Signos Vitales
     * @return un entero que representa el "cuidado prenatal" de Signos Vitales
     */
    public int getCuidadoPrenatal() {
        return cuidadoPrenatal;
    }

    /**
     * Establece el "cuidado prenatal" de Signos Vitales
     * @param cuidadoPrenatal de tipo entero que representa el "cuidado prenatal" de Signos Vitales
     */
    public void setCuidadoPrenatal(int cuidadoPrenatal) {
        this.cuidadoPrenatal = cuidadoPrenatal;
    }

    /**
     * Obtiene el "entorno saludable" de Signos Vitales
     * @return un entero que representa el "entorno saludable" de Signos Vitales
     */
    public int getEntornoSaludable() {
        return entornoSaludable;
    }

    /**
     * Establece el "entorno saludable" de Signos Vitales
     * @param entornoSaludable de tipo entero que representa el "entorno saludable" de Signos Vitales
     */
    public void setEntornoSaludable(int entornoSaludable) {
        this.entornoSaludable = entornoSaludable;
    }

    /**
     * Obtiene la "prevención de adicciones" de Signos Vitales
     * @return un entero que representa la "prevención de adicciones" de Signos Vitales
     */
    public int getPrevencionAdicciones() {
        return prevencionAdicciones;
    }

    /**
     * Establece la "prevención de adicciones" de Signos Vitales
     * @param prevencionAdicciones de tipo entero que representa la "prevención de adicciones" de Signos Vitales
     */
    public void setPrevencionAdicciones(int prevencionAdicciones) {
        this.prevencionAdicciones = prevencionAdicciones;
    }

    /**
     * Obtiene el "examen de mama" de Signos Vitales
     * @return un entero que representa el "examen de mama" de Signos Vitales
     */
    public int getExamenMama() {
        return examenMama;
    }

    /**
     * Establece el "examen de mama" de Signos Vitales
     * @param examenMama de tipo String que representa el "examen de mama" de Signos Vitales
     */
    public void setExamenMama(int examenMama) {
        this.examenMama = examenMama;
    }

    /**
     * Obtiene las "curaciones" de Signos Vitales
     * @return un entero que representa las "curaciones" de Signos Vitales
     */
    public int getCuraciones() {
        return curaciones;
    }

    /**
     * Establece las "curaciones" de Signos Vitales
     * @param curaciones de tipo entero que representa las "curaciones" de Signos Vitales
     */
    public void setCuraciones(int curaciones) {
        this.curaciones = curaciones;
    }
    
    /**
     * Obtiene el "peso" de Signos Vitales
     * @return un double que representa el "peso" de Signos Vitales
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Establece el "peso" de Signos Vitales
     * @param peso de tipo double que representa el "peso" de Signos Vitales
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Obtiene la "frecuencia cardiaca" de Signos Vitales
     * @return un entero que representa la "frecuencia cardiaca" de Signos Vitales
     */
    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    /**
     * Establece la "frecuencia cardiaca" de Signos Vitales
     * @param frecuenciaCardiaca de tipo entero que representa la "frecuencia cardiaca" de Signos Vitales
     */
    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    /**
     * Obtiene la "presión arterial" de Signos Vitales
     * @return un String que representa la "presión arterial" de Signos Vitales
     */
    public String getPresionArterial() {
        return presionArterial;
    }

    /**
     * Establece la "presión arterial" de Signos Vitales
     * @param presionArterial de tipo String que representa la "presión arterial" de Signos Vitales
     */
    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    /**
     * Obtiene el "indice de masa corporal" de Signos Vitales
     * @return un double que representa el "indice de masa corporal" de Signos Vitales
     */
    public double getIndiceMasaCorporal() {
        return indiceMasaCorporal;
    }

    /**
     * Establece el "indice de masa corporal" de Signos Vitales
     * @param indiceMasaCorporal de tipo double que representa el "indice de masa corporal" de Signos Vitales
     */
    public void setIndiceMasaCorporal(double indiceMasaCorporal) {
        this.indiceMasaCorporal = indiceMasaCorporal;
    }

    /**
     * Obtiene el "indice metabolico basal" de Signos Vitales
     * @return un double que representa el "indice metabolico basal" de Signos Vitales
     */
    public double getIndiceMetabolicoBasal() {
        return indiceMetabolicoBasal;
    }

    /**
     * Establece el "indice metabolico basal" de Signos Vitales
     * @param indiceMetabolicoBasal de tipo double que representa el "indice metabolico basal" de Signos Vitales
     */
    public void setIndiceMetabolicoBasal(double indiceMetabolicoBasal) {
        this.indiceMetabolicoBasal = indiceMetabolicoBasal;
    }

    /**
     * Obtiene el "agua corporal" de Signos Vitales
     * @return un double que representa el "agua corporal" de Signos Vitales
     */
    public double getAguaCorporal() {
        return aguaCorporal;
    }

    /**
     * Establece el "agua corporal" de Signos Vitales
     * @param aguaCorporal de tipo double que representa el "agua corporal" de Signos Vitales
     */
    public void setAguaCorporal(double aguaCorporal) {
        this.aguaCorporal = aguaCorporal;
    }

    /**
     * Obtiene la "masa corporal" de Signos Vitales
     * @return un double que representa la "masa corporal" de Signos Vitales
     */
    public double getMasaCorporal() {
        return masaCorporal;
    }

    /**
     * Establece la "masa corporal" de Signos Vitales
     * @param masaCorporal de tipo double que representa la "masa corporal" de Signos Vitales
     */
    public void setMasaCorporal(double masaCorporal) {
        this.masaCorporal = masaCorporal;
    }

    /**
     * Obtiene la "grasa corporal" de Signos Vitales
     * @return un double que representa la "grasa corporal" de Signos Vitales
     */
    public double getGrasaCorporal() {
        return grasaCorporal;
    }

    /**
     * Establece la "grasa corporal" de Signos Vitales
     * @param grasaCorporal de tipo double que representa la "grasa corporal" de Signos Vitales
     */
    public void setGrasaCorporal(double grasaCorporal) {
        this.grasaCorporal = grasaCorporal;
    }

    /**
     * Obtiene la "talla" de Signos Vitales
     * @return un double que representa la "talla" de Signos Vitales
     */
    public double getTalla() {
        return talla;
    }

    /**
     * Establece la "talla" de Signos Vitales
     * @param talla de tipo double que representa la "talla" de Signos Vitales
     */
    public void setTalla(double talla) {
        this.talla = talla;
    }

    /**
     * Obtiene la "temperatura" de Signos Vitales
     * @return un double que representa la "temperatura" de Signos Vitales
     */
    public double getTemperatura() {
        return temperatura;
    }

    /**
     * Establece la "temperatura" de Signos Vitales
     * @param temperatura de tipo double que representa la "temperatura" de Signos Vitales
     */
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
}
