package com.williamdsw.behavioral.mediator.classes;

import javax.swing.ListModel;

public interface IMediator {

	public void addNewNote(Note note);

	public void deleteNote();

	public void getInfoFromList(Note note);

	public void saveChanges();

	public void markNote();

	public void clear();

	public void sendToFilter(ListModel listModel);

	public void setElementsToList(ListModel listModel);

	public void registerComponent(IComponent component);

	public void hideElements(boolean flag);

	public void createGUI();
}