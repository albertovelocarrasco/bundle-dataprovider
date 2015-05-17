package alberto.example.com.bundledataprovider.presentation.dataprovider;

import android.content.Context;

/**
 * Created by Alberto Velo Carrasco on 17/05/15.
 */
public class DataProvider implements IDataProvider {

    // Context to get access to shared preferences
    Context mContext;
    String data;

    public DataProvider(Context context) {
        mContext = context;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void storeToBundle(IDataBundle bundle) {
        bundle.saveDataToBundle(data, "key");
    }

    @Override
    public Object getFromBundle(IDataBundle bundle) {
        return bundle.getDataFromBundle("key");
    }
}
