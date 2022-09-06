package view;

import javafx.scene.layout.Region;
import viewmodel.ViewModelFactory;

public abstract class ViewController {
    private Region root;
    private ViewHandler viewHandler;
    private ViewModelFactory viewModel;

    protected abstract void init();

    public abstract void reset();

    public void init(ViewHandler viewHandler, ViewModelFactory viewModel, Region root) {
        this.root = root;
        this.viewHandler = viewHandler;
        this.viewModel = viewModel;
        init();
    }


    public Region getRoot() {
        return root;
    }

    public ViewHandler getViewHandler() {
        return viewHandler;
    }

    public ViewModelFactory getViewModel() {
        return viewModel;
    }
}
