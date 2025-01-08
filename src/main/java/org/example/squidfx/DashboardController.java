package org.example.squidfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private AnchorPane viewProperty;

    @FXML
    private AnchorPane viewRentalAgreement;

    @FXML
    private AnchorPane userProfile;

    @FXML
    private Button propertyNav;

    @FXML
    private Button rentalAgreementNav;

    @FXML
    private Button profileNav;

    public void switchScene (ActionEvent event) {
        if (event.getSource() == propertyNav) {
            viewProperty.setVisible(true);
            viewRentalAgreement.setVisible(false);
            userProfile.setVisible(false);

        } else if (event.getSource() == rentalAgreementNav) {
            viewProperty.setVisible(false);
            viewRentalAgreement.setVisible(true);
            userProfile.setVisible(false);

        } else if (event.getSource() == profileNav) {
            viewProperty.setVisible(false);
            viewRentalAgreement.setVisible(false);
            userProfile.setVisible(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO
    }
}
