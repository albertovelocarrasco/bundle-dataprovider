package alberto.example.com.bundledataprovider.presentation.presenter;

import alberto.example.com.bundledataprovider.presentation.dataprovider.IDataBundle;

/**
 * Created by Alberto Velo Carrasco on 17/05/15.
 */
public interface IActivityPresenter {
    void setViewModel(IActivityViewModel viewModel);
    void onSaveInstance(IDataBundle bundle);
    void onRestoreInstance(IDataBundle bundle);
}
