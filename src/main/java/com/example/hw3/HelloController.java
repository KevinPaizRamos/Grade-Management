package com.example.hw3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class HelloController {
    @FXML
    private Button addGradeTabButton;

    @FXML
    private Tab addTab;

    @FXML
    private TextField categoryTabTf;

    @FXML
    private Tab clearTab;

    @FXML
    private Button clearTabButton;

    @FXML
    private VBox lastActionTf;

    @FXML
    private TextField nameTabTf;

    @FXML
    private TextField queueTypeTf;

    @FXML
    private Tab removeTab;

    @FXML
    private Button removeTabButton;
    @FXML
    private TableColumn<Grade, String> category;

    @FXML
    private TableColumn<Grade, String> name;

    @FXML
    private TableColumn<Grade, Integer> score;

    @FXML
    private TextField scoreTabTf;

    @FXML
    private TabPane tabControls;

    @FXML
    private TableView tableViewGrades;

    //**************************************************
    List<String> lastActionMessage = new ArrayList<>();


    //**************************************************
    public void initialize() {
        //   name.setCellValueFactory(new PropertyValueFactory<Grade,String>("name"));
    }

    Queue<Grade> normalQ = new LinkedList<>();

    // Queue<Grade> priorityQ = new PriorityQueue<>();
    @FXML
    void OpenIntoNormalQ_FromJson(ActionEvent event) {

    }

    @FXML
    void onClose(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void onSaveFile(ActionEvent event) {

    }

    @FXML
    void openIntoPriorityQ_FromJson(ActionEvent event) {

    }

    @FXML
    void onAddGrade(ActionEvent event) {
        name.setCellValueFactory(new PropertyValueFactory<Grade, String>("name"));
        category.setCellValueFactory(new PropertyValueFactory<Grade, String>("category"));
        score.setCellValueFactory(new PropertyValueFactory<Grade, Integer>("score"));

        String name = nameTabTf.getText();
        String category = categoryTabTf.getText();
        int score = Integer.parseInt(scoreTabTf.getText());

        Grade grade = new Grade(name, category, score);
        normalQ.add(grade);
        addtoJson(grade);
        tableViewGrades.getItems().add(grade);



    }

    @FXML
    void onClear(ActionEvent event) {

    }

    @FXML
    void onRemove(ActionEvent event) {

    }

    void addtoJson(Grade grade) {
        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();

            String jsonString = gson.toJson(grade);
            PrintStream ps = new PrintStream("Grades.json");
            ps.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}