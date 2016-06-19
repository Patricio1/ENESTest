package uta.fisei.aplicacion1;

/**
 * Created by Lio on 19/06/2016.
 */
public class Forma {
    private String Categoria;
    private String Instruccion;
    private String Descripcion;
    private String OpcionA;
    private String OpcionB;
    private String OpcionC;
    private String OpcionD;
    private String Respuesta;

    public String GetCategoria()
    {
        return Categoria;
    }
    public String GetInstruccion()
    {
        return Instruccion;
    }
    public String GetDescripcion()
    {
        return  Descripcion;
    }
    public String GetOpcionA()
    {
        return OpcionA;
    }
    public String GetOpcionB()
    {
        return OpcionB;
    }
    public String GetOpcionC()
    {
        return  OpcionC;
    }
    public String GetOpcionD()
    {
        return  OpcionD;
    }
    public String GetRespuesta()
    {
        return Respuesta;
    }
    public void SetCategoria(String Categoria)
    {
        this.Categoria=Categoria;
    }
    public void SetInstruccion(String Instruccion)
    {
         this.Instruccion = Instruccion;
    }
    public void SetDescripcion(String Descripcion)
    {
        this.Descripcion = Descripcion;
    }
    public void SetOpcionA(String OpcionA)
    {
        this.OpcionA = OpcionA;
    }
    public void SetOpcionB(String OpcionB)
    {
        this.OpcionB = OpcionB;
    }
    public void SetOpcionC(String OpcionC)
    {
        this.OpcionC = OpcionC;
    }
    public void SetOpcionD(String OpcionD)
    {
        this.OpcionD = OpcionD;
    }
    public void SetRespuesta(String Respuesta)
    {
        this.Respuesta = Respuesta;
    }
}
