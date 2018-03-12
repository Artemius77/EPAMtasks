package SecondPractise.FirstTask.controller;

import SecondPractise.FirstTask.model.ModelClass;
import SecondPractise.FirstTask.view.ShapeView;
import SecondPractise.FirstTask.model.abstracts.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class Controller {

    private ShapeView view;
    private ModelClass model;

    public Controller(ShapeView view, ModelClass model) {
        this.view = view;
        this.model = model;
    }

    public double sumArea(){
        return  model.sumArea();
    }

    public double sumArea(String shapeName){
        return  model.sumArea(shapeName);
    }

    public  Shape[] sortByArea() {
        return model.sortByArea();
    }

    public  Shape[] sortByColor() {
        return model.sortByColor();
    }

    public  Shape[] getAll() {
        return model.getAll();
    }


    public ShapeView getView() {
        return view;
    }

    public ModelClass getModel() {
        return model;
    }


}
