package com.kodedu.taskmanager.ui;

import com.kodedu.taskmanager.Task;
import com.kodedu.taskmanager.TaskManager;
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

import java.util.List;
import java.util.stream.Collectors;

public class TaskFX extends Application {

    TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {
        launch(args);
    }

    private ListView<Task> taskListView;
    private StackPane stackPane;

    @Override
    public void start(Stage stage) {

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

        List<ProcessHandle> processList = taskManager.processList()
                .stream()
                .filter(e -> e.info().command().isPresent())
                .collect(Collectors.toList());

        ObservableList<Task> observableArrayList = FXCollections.observableArrayList();

        for (ProcessHandle processHandle : processList) {
            Task task = new Task(processHandle);
            observableArrayList.add(task);
        }

        taskListView.setItems(observableArrayList);
    }

}
