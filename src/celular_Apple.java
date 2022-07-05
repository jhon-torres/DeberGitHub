public class celular_Apple {
    //ATRIBUTOS
    private String modelo;
    private String color;
    private int memoria;
    private int m_ram;

    //CONSTRUCTORES
    public celular_Apple(String modelo, String color, int memoria, int m_ram){
        this.modelo=modelo;
        this.color=color;
        this.memoria=memoria;
        this.m_ram=m_ram;
    }

    //METODOS setter y getter Alt+Insert

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getM_ram() {
        return m_ram;
    }

    public void setM_ram(int m_ram) {
        this.m_ram = m_ram;
    }

    //Metodos
    @Override
    public String toString(){
        return "- El celular marca Apple, modelo: "+modelo+", de color "+color+", con memoria de almacenamiento de "+memoria+" GB y con "+m_ram+" GB de RAM.";
    }
}
