package acedt.mngbeans;

import acedt.persistence.entity.Idioma;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
@ManagedBean
@SessionScoped
public class TesteBean implements Serializable {
    private final List<Idioma> idiomas = Arrays.asList(
            new Idioma(1, "Inglês"),
            new Idioma(2, "Espanhol"),
            new Idioma(3, "Francês"),
            new Idioma(4, "Alemão"));

    private final ListDataModel<Idioma> dataModel = new ListDataModel<>(idiomas);
    
    public TesteBean() {
    }

    public List<Idioma> getIdiomas() {
        return idiomas;
    }
    
    public ListDataModel<Idioma> getDataModel() {
        return dataModel;
    }
}
