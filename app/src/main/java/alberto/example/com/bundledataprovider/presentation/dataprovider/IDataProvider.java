package alberto.example.com.bundledataprovider.presentation.dataprovider;

import alberto.example.com.bundledataprovider.presentation.bundle.IDataBundle;

/**
 * Created by Alberto Velo Carrasco on 17/05/15.
 */
public interface IDataProvider {

    String getData();
    void setData(String data);
    void storeToBundle(IDataBundle bundle);
    Object getFromBundle(IDataBundle bundle);
}
