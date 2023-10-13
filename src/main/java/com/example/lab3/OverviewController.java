package com.example.lab3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OverviewController {
    @FXML
    private TableView<City> cityTable;
    @FXML
    private TableColumn<City,String> citynamecol;
    @FXML
    private Label cName,cPop,pName,pS,pW,pDate;

    private MainApp mainApp;
    public OverviewController() {
    }


    @FXML
    private void initialize() {

        citynamecol.setCellValueFactory(new PropertyValueFactory<>("name"));
        cityTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showCityDetails(newValue));
    }


    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        cityTable.setItems(mainApp.getCityData());
    }
    private void showCityDetails(City city){
        if (city != null)
        {
            cName.setText(city.getName());
            cPop.setText(Integer.toString(city.getPop()));
        }
    }
    @FXML
    private void handleDeleteCity() {
        int selectedIndex = cityTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            cityTable.getItems().remove(selectedIndex);
        } else {
            // Ничего не выбрано.
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("Ничего не выбрано");
            alert.setHeaderText("Не выбран город");
            alert.setContentText("Выберите город в таблице для удаления");

            alert.showAndWait();
        }
    }
    @FXML
    private void handleNewCity() {
        City tempcity = new City();
        boolean okClicked = mainApp.showCityEditDialog(tempcity);
        if (okClicked) {
            mainApp.getCityData().add(tempcity);
        }
    }

    /**
     * Вызывается, когда пользователь кликает по кнопка Edit...
     * Открывает диалоговое окно для изменения выбранного адресата.
     */
    @FXML
    private void handleEditCity() {
        City selectedcity = cityTable.getSelectionModel().getSelectedItem();
        if (selectedcity != null) {
            boolean okClicked = mainApp.showCityEditDialog(selectedcity);
            if (okClicked) {
                showCityDetails(selectedcity);
            }

        } else {
            // Ничего не выбрано.
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("No Selection");
            alert.setHeaderText("No Person Selected");
            alert.setContentText("Please select a person in the table.");

            alert.showAndWait();
        }
    }
}
