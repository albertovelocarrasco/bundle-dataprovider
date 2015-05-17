package alberto.example.com.bundledataprovider.presentation.presenter;

import alberto.example.com.bundledataprovider.presentation.dataprovider.IDataBundle;
import alberto.example.com.bundledataprovider.presentation.dataprovider.IDataProvider;

/**
 * Created by Alberto Velo Carrasco on 17/05/15.
 */
public class ActivityPresenter implements IActivityPresenter {

    IActivityViewModel viewModel;
    IDataProvider dataProvider;
    String data;

    public ActivityPresenter(
            IDataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    @Override
    public void setViewModel(IActivityViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void onSaveInstance(IDataBundle bundle) {
        dataProvider.storeToBundle(bundle);
    }

    @Override
    public void onRestoreInstance(IDataBundle bundle) {
        data = dataProvider.getData();
    }
}
