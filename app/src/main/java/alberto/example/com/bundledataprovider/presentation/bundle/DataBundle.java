package alberto.example.com.bundledataprovider.presentation.bundle;

import android.os.Bundle;

import alberto.example.com.bundledataprovider.presentation.bundle.IDataBundle;

/**
 * Created by Alberto Velo Carrasco on 17/05/15.
 */
public class DataBundle implements IDataBundle {

    Bundle mBundle;

    public DataBundle(Bundle bundle) {
        mBundle = bundle;
    }

    @Override
    public void saveDataToBundle(Object data, String key) {
        mBundle.putString(key, (String) data);
    }

    @Override
    public Object getDataFromBundle(String key) {
        return null;
    }
}
