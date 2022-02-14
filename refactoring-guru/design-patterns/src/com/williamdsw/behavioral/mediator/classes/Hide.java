package com.williamdsw.behavioral.mediator.classes;

public class Hide implements Runnable {

	private List list;
	private IMediator mediator;

	public Hide(List list, IMediator mediator) {
		this.list = list;
		this.mediator = mediator;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}

			mediator.hideElements(list.isSelectionEmpty());
		}
	}
}