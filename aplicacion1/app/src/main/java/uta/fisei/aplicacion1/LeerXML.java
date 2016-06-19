package uta.fisei.aplicacion1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;


public class LeerXML extends DefaultHandler{
    private List<Forma> forma;
    private Forma FormaActual;
    private StringBuilder strTexto;

    public List<Forma> GetForma()
    {
        return  forma;
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException
    {

        super.characters(ch, start, length);

        if (this.FormaActual != null)
            strTexto.append(ch, start, length);

    }
    @Override
    public void endElement(String uri, String localName, String name)
            throws SAXException {

        super.endElement(uri, localName, name);

        if (this.FormaActual!= null) {

            if (localName.equals("tipo")) {
                FormaActual.SetCategoria(strTexto.toString());
            } else if (localName.equals("instruccion")) {
                FormaActual.SetInstruccion(strTexto.toString());
            } else if (localName.equals("descripcion")) {
                FormaActual.SetDescripcion(strTexto.toString());
            } else if (localName.equals("opcionA")) {
                FormaActual.SetOpcionA(strTexto.toString());
            } else if (localName.equals("opcionB")) {
                FormaActual.SetOpcionB(strTexto.toString());
            } else if (localName.equals("opcionC")) {
                FormaActual.SetOpcionC(strTexto.toString());
            } else if (localName.equals("opcionD")) {
                FormaActual.SetOpcionD(strTexto.toString());
            }else if (localName.equals("respuesta")) {
                FormaActual.SetRespuesta(strTexto.toString());
            }

            strTexto.setLength(0);
        }
    }
    @Override
    public void startDocument() throws SAXException {

        super.startDocument();

        forma = new ArrayList<Forma>();
        strTexto = new StringBuilder();
    }

    @Override
    public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException {

        super.startElement(uri, localName, name, attributes);

        if (localName.equals("pregunta")) {
            FormaActual = new Forma();
        }
    }
}
