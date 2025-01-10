package org.example.squidfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ManagerController implements Initializable {

    @FXML
    private Button propertyNav;

    @FXML
    private Button tenantNav;

    @FXML
    private Button hostNav;

    @FXML
    private Button ownerNav;

    @FXML
    private Button rentalAgreementNav;

    @FXML
    private Button profitNav;

    @FXML
    private Button profileNav;

    @FXML
    private AnchorPane manageProperty;

    @FXML
    private AnchorPane manageTenant;

    @FXML
    private AnchorPane manageHost;

    @FXML
    private AnchorPane manageOwner;

    @FXML
    private AnchorPane manageRentalAgreement;

    @FXML
    private AnchorPane viewProfit;

    @FXML
    private AnchorPane userProfile;

    public void switchSceneManager (ActionEvent event) {
        if (event.getSource() == propertyNav) {
            manageProperty.setVisible(true);
            manageTenant.setVisible(false);
            manageHost.setVisible(false);
            manageOwner.setVisible(false);
            manageRentalAgreement.setVisible(false);
            viewProfit.setVisible(false);
            userProfile.setVisible(false);

            propertyNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            tenantNav.setStyle("-fx-background-color:transparent");
            hostNav.setStyle("-fx-background-color:transparent");
            ownerNav.setStyle("-fx-background-color:transparent");
            rentalAgreementNav.setStyle("-fx-background-color:transparent");
            profitNav.setStyle("-fx-background-color:transparent");
            profileNav.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == tenantNav) {
            manageProperty.setVisible(false);
            manageTenant.setVisible(true);
            manageHost.setVisible(false);
            manageOwner.setVisible(false);
            manageRentalAgreement.setVisible(false);
            viewProfit.setVisible(false);
            userProfile.setVisible(false);

            tenantNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            propertyNav.setStyle("-fx-background-color:transparent");
            hostNav.setStyle("-fx-background-color:transparent");
            ownerNav.setStyle("-fx-background-color:transparent");
            rentalAgreementNav.setStyle("-fx-background-color:transparent");
            profitNav.setStyle("-fx-background-color:transparent");
            profileNav.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == hostNav) {
            manageProperty.setVisible(false);
            manageTenant.setVisible(false);
            manageHost.setVisible(true);
            manageOwner.setVisible(false);
            manageRentalAgreement.setVisible(false);
            viewProfit.setVisible(false);
            userProfile.setVisible(false);

            hostNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            propertyNav.setStyle("-fx-background-color:transparent");
            tenantNav.setStyle("-fx-background-color:transparent");
            ownerNav.setStyle("-fx-background-color:transparent");
            rentalAgreementNav.setStyle("-fx-background-color:transparent");
            profitNav.setStyle("-fx-background-color:transparent");
            profileNav.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == ownerNav) {
            manageProperty.setVisible(false);
            manageTenant.setVisible(false);
            manageHost.setVisible(false);
            manageOwner.setVisible(true);
            manageRentalAgreement.setVisible(false);
            viewProfit.setVisible(false);
            userProfile.setVisible(false);

            ownerNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            propertyNav.setStyle("-fx-background-color:transparent");
            tenantNav.setStyle("-fx-background-color:transparent");
            hostNav.setStyle("-fx-background-color:transparent");
            rentalAgreementNav.setStyle("-fx-background-color:transparent");
            profitNav.setStyle("-fx-background-color:transparent");
            profileNav.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == rentalAgreementNav) {
            manageProperty.setVisible(false);
            manageTenant.setVisible(false);
            manageHost.setVisible(false);
            manageOwner.setVisible(false);
            manageRentalAgreement.setVisible(true);
            viewProfit.setVisible(false);
            userProfile.setVisible(false);

            rentalAgreementNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            propertyNav.setStyle("-fx-background-color:transparent");
            tenantNav.setStyle("-fx-background-color:transparent");
            hostNav.setStyle("-fx-background-color:transparent");
            ownerNav.setStyle("-fx-background-color:transparent");
            profitNav.setStyle("-fx-background-color:transparent");
            profileNav.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == profitNav) {
            manageProperty.setVisible(false);
            manageTenant.setVisible(false);
            manageHost.setVisible(false);
            manageOwner.setVisible(false);
            manageRentalAgreement.setVisible(false);
            viewProfit.setVisible(true);
            userProfile.setVisible(false);

            profitNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            propertyNav.setStyle("-fx-background-color:transparent");
            tenantNav.setStyle("-fx-background-color:transparent");
            hostNav.setStyle("-fx-background-color:transparent");
            ownerNav.setStyle("-fx-background-color:transparent");
            rentalAgreementNav.setStyle("-fx-background-color:transparent");
            profileNav.setStyle("-fx-background-color:transparent");

        } else if (event.getSource() == profileNav) {
            manageProperty.setVisible(false);
            manageTenant.setVisible(false);
            manageHost.setVisible(false);
            manageOwner.setVisible(false);
            manageRentalAgreement.setVisible(false);
            viewProfit.setVisible(false);
            userProfile.setVisible(true);

            profileNav.setStyle("-fx-background-color:rgba(255, 255, 255, 0.1)");
            propertyNav.setStyle("-fx-background-color:transparent");
            tenantNav.setStyle("-fx-background-color:transparent");
            hostNav.setStyle("-fx-background-color:transparent");
            ownerNav.setStyle("-fx-background-color:transparent");
            rentalAgreementNav.setStyle("-fx-background-color:transparent");
            profitNav.setStyle("-fx-background-color:transparent");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO
    }
}
