/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.taskmanager.ui;

import com.kodcu.taskmanager.TaskManager;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usta
 */
public class TaskFX extends Application {

    TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {
        launch(args);
    }
    private ListView<Task> taskListView;
    private StackPane stackPane;

    @Override
    public void start(Stage stage) throws Exception {

        this.stackPane = new StackPane();
        this.taskListView = new ListView<>();

        stackPane.getChildren().add(taskListView);

        stage.setScene(new Scene(stackPane, 400, 400));
        stage.show();

        refreshProcessList();

        MenuItem menuItem = new MenuItem("Kill");
        menuItem.setOnAction(this::kill);
        taskListView.contextMenuProperty().set(new ContextMenu(menuItem));
    }

    public void kill(ActionEvent event) {
        MultipleSelectionModel<Task> tasks = taskListView.selectionModelProperty().get();

        Task task = tasks.getSelectedItem();
        long pid = task.getPid();
        taskManager.killProcess(pid);
        refreshProcessList();

    }

    private void refreshProcessList() {

        List<ProcessHandle> processList = taskManager.processList();

        ObservableList<Task> observableArrayList = FXCollections.observableArrayList();

        for (ProcessHandle processHandle : processList) {
            Task task = new Task(processHandle);
            observableArrayList.add(task);
        }

        taskListView.setItems(observableArrayList);
    }

}
