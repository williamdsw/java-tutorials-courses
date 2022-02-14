package com.williamdsw.behavioral.mediator.app;

import javax.swing.DefaultListModel;

import com.williamdsw.behavioral.mediator.classes.AddButton;
import com.williamdsw.behavioral.mediator.classes.DeleteButton;
import com.williamdsw.behavioral.mediator.classes.Editor;
import com.williamdsw.behavioral.mediator.classes.Filter;
import com.williamdsw.behavioral.mediator.classes.IMediator;
import com.williamdsw.behavioral.mediator.classes.List;
import com.williamdsw.behavioral.mediator.classes.SaveButton;
import com.williamdsw.behavioral.mediator.classes.TextBox;
import com.williamdsw.behavioral.mediator.classes.Title;

public class MediatorDemo {

	public static void mediatorDemo() {
		IMediator mediator = new Editor();

		mediator.registerComponent(new Title());
		mediator.registerComponent(new TextBox());
		mediator.registerComponent(new AddButton());
		mediator.registerComponent(new DeleteButton());
		mediator.registerComponent(new SaveButton());
		mediator.registerComponent(new List(new DefaultListModel(), mediator));
		mediator.registerComponent(new Filter());

		mediator.createGUI();
	}
}