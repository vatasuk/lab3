package com.example.lab3;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OverviewController {
    @FXML
    private TableView<City> cityTable;
    @FXML
    private TableColumn<City,String> citynamecol;

    private MainApp mainApp;
    public OverviewController() {
    }


    @FXML
    private void initialize() {

        citynamecol.setCellValueFactory(new PropertyValueFactory<>("name"));
    }


    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Добавление в таблицу данных из наблюдаемого списка
        cityTable.setItems(mainApp.getCityData());
    }
}
