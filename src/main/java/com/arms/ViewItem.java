package com.arms;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class ViewItem extends GridPane {

    public ViewItem() {

        // Set the height and vertical gap to 10 each.
        this.setHgap(10);
        this.setVgap(10);

        // Padding for every item of 10 all four directions.
        this.setPadding(new Insets(10,10,10,10));

        // Creates four new columns.
        ColumnConstraints idColumn = new ColumnConstraints();
        ColumnConstraints nameColumn = new ColumnConstraints();
        ColumnConstraints priceColumn = new ColumnConstraints();
        ColumnConstraints imageColumn = new ColumnConstraints();

        // Columns are both set to their respective portion of the real estate of the page.
        idColumn.setPercentWidth(15);
        nameColumn.setPercentWidth(25);
        priceColumn.setPercentWidth(10);
        imageColumn.setPercentWidth(50);

        this.getColumnConstraints().add(idColumn);
        this.getColumnConstraints().add(nameColumn);
        this.getColumnConstraints().add(priceColumn);
        this.getColumnConstraints().add(imageColumn);

        // String list for description of items.
        ObservableList<Integer> orderIDList = FXCollections.observableArrayList();

        ObservableList<String> orderNameList = FXCollections.observableArrayList();

        ObservableList<String> orderPriceList = FXCollections.observableArrayList();

        ObservableList<String> orderImageList = FXCollections.observableArrayList();

        // Create view panes for each list.
        ListView<Integer> idPane = new ListView<>(orderIDList);
        ListView<String> namePane = new ListView<>(orderNameList);
        ListView<String> pricePane = new ListView<>(orderPriceList);
        ListView<String> photoPane = new ListView<>(orderImageList);

        // Creates four new labels, one for each column.
        Label orderId = new Label("Item ID:");
        Label orderTime = new Label("Item Name:");
        Label orderStatus = new Label("Item Price:");
        Label orderBill = new Label("Item Photo:");

        // Adds the four labels and SplitPane to their respective columns and rows.
        this.add(orderId,0,0);
        this.add(idPane,0,1);

        this.add(orderTime,1,0);
        this.add(namePane,1,1);

        this.add(orderStatus,2,0);
        this.add(pricePane,2,1);

        this.add(orderBill,3,0);
        this.add(photoPane,3,1);

    }

}
