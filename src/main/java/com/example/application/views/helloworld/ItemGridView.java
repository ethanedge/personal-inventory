package com.example.application.views.helloworld;

import com.example.application.data.entity.Item;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.component.grid.*;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Your Inventory")
@Route(value = "", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class ItemGridView extends VerticalLayout {

    private TextField name;
    private Button sayHello;
    Grid<Item> grid = new Grid<>(Item.class);

    HorizontalLayout header = new HorizontalLayout();
    Button addItem = new Button("Add Item");
    TextField filter = new TextField();

    public ItemGridView() {
        //name = new TextField("Your name");
       // sayHello = new Button("Say hello");
       // sayHello.addClickListener(e -> {
          //  Notification.show("Hello " + name.getValue());
        //});
       // sayHello.addClickShortcut(Key.ENTER);

        //setMargin(true);
        //setVerticalComponentAlignment(Alignment.END, name, sayHello);

       // add(name, sayHello);

        configureHeader();
        configureGrid();

        add(header, grid);
    }

    private void configureHeader() {

        // Configure the add item button

        // Configure the filter text field
        filter.setPlaceholder("Filter");

        // Configure the header itself
        header.setWidthFull();
        header.setJustifyContentMode(FlexComponent.JustifyContentMode.END);
        header.add(filter, addItem);
    }

    private void configureGrid() {
        grid.addClassName("item-grid");
        //grid.setSizeFull();
        grid.setColumns("name", "image", "category", "subCategory", "description", "location", "locationImage", "owner");
        //grid.getColumns().forEach(col -> col.setAutoWidth(true));
    }

}
