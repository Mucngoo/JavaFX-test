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
    private AnchorPane viewProfit;

    @FXML
    private AnchorPane userProfile;

    @FXML
    private Button propertyNav;

    @FXML
    private Button rentalAgreementNav;

    @FXML
    private Button profitNav;

    @FXML
    private Button profileNav;

    public void switchSceneTenant (ActionEvent event) {
        if (event.getSource() == propertyNav) {
            viewProperty.setVisible(true);
            viewRentalAgreement.setVisible(false);
            userProfile.setVisible(false);

            propertyNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            rentalAgreementNav.setStyle("-fx-background-color:transparent");
            profileNav.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == rentalAgreementNav) {
            viewProperty.setVisible(false);
            viewRentalAgreement.setVisible(true);
            userProfile.setVisible(false);

            rentalAgreementNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            propertyNav.setStyle("-fx-background-color:transparent");
            profileNav.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == profileNav) {
            viewProperty.setVisible(false);
            viewRentalAgreement.setVisible(false);
            userProfile.setVisible(true);

            profileNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            rentalAgreementNav.setStyle("-fx-background-color:transparent");
            propertyNav.setStyle("-fx-background-color:transparent");
        }
    }

    public void switchSceneHost (ActionEvent event) {
        if (event.getSource() == propertyNav) {
            viewProperty.setVisible(true);
            viewRentalAgreement.setVisible(false);
            viewProfit.setVisible(false);
            userProfile.setVisible(false);

            propertyNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            rentalAgreementNav.setStyle("-fx-background-color:transparent");
            profileNav.setStyle("-fx-background-color:transparent");
            profitNav.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == rentalAgreementNav) {
            viewProperty.setVisible(false);
            viewRentalAgreement.setVisible(true);
            viewProfit.setVisible(false);
            userProfile.setVisible(false);

            rentalAgreementNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            propertyNav.setStyle("-fx-background-color:transparent");
            profileNav.setStyle("-fx-background-color:transparent");
            profitNav.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == profileNav) {
            viewProperty.setVisible(false);
            viewRentalAgreement.setVisible(false);
            viewProfit.setVisible(false);
            userProfile.setVisible(true);

            profileNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            rentalAgreementNav.setStyle("-fx-background-color:transparent");
            propertyNav.setStyle("-fx-background-color:transparent");
            profitNav.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == profitNav) {
            viewProperty.setVisible(false);
            viewRentalAgreement.setVisible(false);
            viewProfit.setVisible(true);
            userProfile.setVisible(false);

            profitNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            rentalAgreementNav.setStyle("-fx-background-color:transparent");
            propertyNav.setStyle("-fx-background-color:transparent");
            profileNav.setStyle("-fx-background-color:transparent");
        }
    }

    public void switchSceneOwner (ActionEvent event) {
        if (event.getSource() == propertyNav) {
            viewProperty.setVisible(true);
            userProfile.setVisible(false);

            propertyNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            profileNav.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == profileNav) {
            viewProperty.setVisible(false);
            userProfile.setVisible(true);

            profileNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            propertyNav.setStyle("-fx-background-color:transparent");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO
    }
}
