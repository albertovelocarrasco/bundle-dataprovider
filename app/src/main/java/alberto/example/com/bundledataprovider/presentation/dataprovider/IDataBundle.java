package alberto.example.com.bundledataprovider.presentation.dataprovider;

/**
 * Created by Alberto Velo Carrasco on 17/05/15.
 */
public interface IDataBundle {

    void saveDataToBundle(Object data, String key);
    Object getDataFromBundle(String key);
}
