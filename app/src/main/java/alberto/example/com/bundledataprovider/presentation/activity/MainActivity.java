package alberto.example.com.bundledataprovider.presentation.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import alberto.example.com.bundledataprovider.R;
import alberto.example.com.bundledataprovider.presentation.dataprovider.DataBundle;
import alberto.example.com.bundledataprovider.presentation.dataprovider.DataProvider;
import alberto.example.com.bundledataprovider.presentation.presenter.ActivityPresenter;
import alberto.example.com.bundledataprovider.presentation.presenter.IActivityPresenter;
import alberto.example.com.bundledataprovider.presentation.presenter.IActivityViewModel;

public class MainActivity extends ActionBarActivity implements IActivityViewModel{

    private IActivityPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mPresenter.onRestoreInstance(new DataBundle(savedInstanceState));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mPresenter.onSaveInstance(new DataBundle(outState));
    }

    @Override
    public IActivityPresenter getActivityPresenter() {
        return mPresenter;
    }

    private void initPresenter() {
        mPresenter = new ActivityPresenter(new DataProvider(this));
        mPresenter.setViewModel(this);
    }
}
