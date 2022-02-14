package com.williamdsw.behavioral.mediator.classes;

import javax.swing.DefaultListModel;
import javax.swing.JList;

@SuppressWarnings("unchecked")
public class List extends JList implements IComponent {

	// FIELDS

	private static final long serialVersionUID = 1L;
	private IMediator mediator;
	private final DefaultListModel DEFAULT_LIST_MODEL;

	// CONSTRUCTOR

	public List(DefaultListModel defaultListModel, IMediator mediator) {
		super(defaultListModel);
		this.DEFAULT_LIST_MODEL = defaultListModel;
		this.mediator = mediator;
		setModel(defaultListModel);
		this.setLayoutOrientation(JList.VERTICAL);
		Thread thread = new Thread(new Hide(this, mediator));
		thread.start();
	}

	// GETTERS - SETTERS

	@Override
	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public String getName() {
		return "List";
	}

	// FUNCTIONS

	public void addElement(Note note) {
		DEFAULT_LIST_MODEL.addElement(note);
		int index = (DEFAULT_LIST_MODEL.getSize() - 1);
		this.setSelectedIndex(index);
		this.ensureIndexIsVisible(index);
		mediator.sendToFilter(DEFAULT_LIST_MODEL);
	}

	public void deleteElement() {
		int index = this.getSelectedIndex();

		try {
			DEFAULT_LIST_MODEL.remove(index);
			mediator.sendToFilter(DEFAULT_LIST_MODEL);
		} catch (Exception e) {
		}
	}

	public Note getCurrentElement() {
		return (Note) this.getSelectedValue();
	}
}