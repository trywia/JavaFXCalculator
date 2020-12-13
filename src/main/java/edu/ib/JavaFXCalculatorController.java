package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JavaFXCalculatorController {
    MethodsCalculator calculator = new MethodsCalculator();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField display; // enter numbers, display results

    @FXML
    private Button clear; // clear display

    @FXML
    private Button changeSign; // changing sign from + to -

    @FXML
    private Button percent; // divide by 100

    @FXML
    private Button divide;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button multiply;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button subtract;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button add;

    @FXML
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button equal;


    @FXML
    void onChangeSignClicked(ActionEvent event) {
        calculator.onChangeSignClicked(display);
    }

    @FXML
    void onAddClicked(ActionEvent event) {
        calculator.onAddClicked(display);
    }

    @FXML
    void onClearClicked(ActionEvent event) {
        calculator.onClearClicked(display);
    }

    @FXML
    void onDivideClicked(ActionEvent event) {
        calculator.onDivideClicked(display);
    }

    @FXML
    void onDotClicked(ActionEvent event) {
        calculator.onDotClicked(display);
    }

    @FXML
    void onEightClicked(ActionEvent event) {
        calculator.onEightClicked(display);
    }

    @FXML
    void onEqualClicked(ActionEvent event) {
        calculator.onEqualClicked(display);
    }

    @FXML
    void onFiveClicked(ActionEvent event) {
        calculator.onFiveClicked(display);
    }

    @FXML
    void onFourClicked(ActionEvent event) {
        calculator.onFourClicked(display);
    }

    @FXML
    void onMultiplyClicked(ActionEvent event) {
        calculator.onMultiplyClicked(display);
    }

    @FXML
    void onNineClicked(ActionEvent event) {
        calculator.onNineClicked(display);
    }

    @FXML
    void onOneClicked(ActionEvent event) {
        calculator.onOneClicked(display);
    }

    @FXML
    void onPercentClicked(ActionEvent event) {
        calculator.onPercentClicked(display);
    }

    @FXML
    void onSevenClicked(ActionEvent event) {
        calculator.onSevenClicked(display);
    }

    @FXML
    void onSixClicked(ActionEvent event) {
        calculator.onSixClicked(display);
    }

    @FXML
    void onSubtractClicked(ActionEvent event) {
        calculator.onSubtractClicked(display);
    }

    @FXML
    void onThreeClicked(ActionEvent event) {
        calculator.onThreeClicked(display);
    }

    @FXML
    void onTwoClicked(ActionEvent event) {
        calculator.onTwoClicked(display);
    }

    @FXML
    void onZeroClicked(ActionEvent event) {
        calculator.onZeroClicked(display);
    }

    @FXML
    void initialize() {
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'calculator.fxml'.";
        assert clear != null : "fx:id=\"clear\" was not injected: check your FXML file 'calculator.fxml'.";
        assert changeSign != null : "fx:id=\"changeSign\" was not injected: check your FXML file 'calculator.fxml'.";
        assert percent != null : "fx:id=\"percent\" was not injected: check your FXML file 'calculator.fxml'.";
        assert divide != null : "fx:id=\"divide\" was not injected: check your FXML file 'calculator.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'calculator.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'calculator.fxml'.";
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'calculator.fxml'.";
        assert multiply != null : "fx:id=\"multiply\" was not injected: check your FXML file 'calculator.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'calculator.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'calculator.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'calculator.fxml'.";
        assert subtract != null : "fx:id=\"subtract\" was not injected: check your FXML file 'calculator.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'calculator.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'calculator.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'calculator.fxml'.";
        assert add != null : "fx:id=\"add\" was not injected: check your FXML file 'calculator.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'calculator.fxml'.";
        assert dot != null : "fx:id=\"dot\" was not injected: check your FXML file 'calculator.fxml'.";
        assert equal != null : "fx:id=\"equal\" was not injected: check your FXML file 'calculator.fxml'.";
    }
}
