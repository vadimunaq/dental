package com.gmail.vadim.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.gmail.vadim.ui.views.orderedit.OrderItemEditor;

public class DeleteEvent extends ComponentEvent<OrderItemEditor> {
	public DeleteEvent(OrderItemEditor component) {
		super(component, false);
	}
}