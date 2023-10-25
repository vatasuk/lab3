package com.example.lab3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CityEditDialogController {

    @FXML
    private TextField nameTF,popTF;
    private City city;
    private boolean okClicked = false;
    private Stage dialogStage;
    @FXML
    private void initialize() {
    }
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
    public void setPerson(City city) {
        this.city = city;

        nameTF.setText(city.getName());

        popTF.setText(Integer.toString(city.getPop()));

    }

    public boolean isOkClicked() {
        return okClicked;
    }

    @FXML
    private void handleOk() {
        if (isInputValid()) {
            city.setName(nameTF.getText());
            city.setPop(Integer.parseInt(popTF.getText()));
            okClicked = true;
            dialogStage.close();
        }
    }

    @FXML
    private void handleCancel() {
        dialogStage.close();
    }

    private boolean isInputValid() {
        String errorMessage = "";

        if (nameTF.getText() == null || nameTF.getText().isEmpty()) {
            errorMessage += "Неправильное имя!\n";
        }

        if (popTF.getText() == null || popTF.getText().isEmpty()) {
            errorMessage += "Неправильное население\n";
        } else {

            try {
                Integer.parseInt(popTF.getText());
            } catch (NumberFormatException e) {
                errorMessage += "No valid postal code (must be an integer)!\n";
            }
        }

        if (errorMessage.isEmpty()) {
            return true;
        } else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
}
