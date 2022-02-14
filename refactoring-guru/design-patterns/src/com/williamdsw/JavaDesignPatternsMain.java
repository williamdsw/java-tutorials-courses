package com.williamdsw;

import com.williamdsw.behavioral.chain_of_responsibility.app.ChainOfResponsibilityDemo;
import com.williamdsw.behavioral.command.app.CommandDemo;
import com.williamdsw.behavioral.iterator.app.IteratorDemo;
import com.williamdsw.behavioral.mediator.app.MediatorDemo;
import com.williamdsw.creational.abstract_factory.app.AbstractFactoryApp;
import com.williamdsw.creational.abstract_factory.app.AbstractFactoryDemo;
import com.williamdsw.creational.builder.app.BuilderDemo;
import com.williamdsw.creational.prototype.app.PrototypeDemo;
import com.williamdsw.creational.singleton.app.NaiveSingletonDemo;
import com.williamdsw.structural.adapter.app.AdapterDemo;
import com.williamdsw.structural.bridge.app.BridgeDemo;
import com.williamdsw.structural.composite.app.CompositeDemo;
import com.williamdsw.structural.decorator.app.DecoratorDemo;
import com.williamdsw.structural.facade.app.FacadeDemo;
import com.williamdsw.structural.flyweight.app.FlyweightDemo;
import com.williamdsw.structural.proxy.app.ProxyDemo;

public class JavaDesignPatternsMain {

	public static void main(String[] args) {
		// AbstractFactoryApp abstractFactoryApp =
		// AbstractFactoryDemo.configureApplication ();
		// abstractFactoryApp.triggerEvents (true);

		// BuilderDemo.builderDemo ();

		// PrototypeDemo.prototypeDemo ();

		// NaiveSingletonDemo.naiveSingletonSingleThreadDemo ();
		// NaiveSingletonDemo.nativeSingletonMultithreadDemo ();
		// NaiveSingletonDemo.safeSingletonMultithreadDemo ();

		// AdapterDemo.adapterDemo();

		// BridgeDemo.bridgeDemo ();

		// CompositeDemo.compositeDemo ();

		// DecoratorDemo.decoratorDemo ();

		// FacadeDemo.facadeDemo();

		// FlyweightDemo.flyweightDemo ();

		// ProxyDemo.proxyDemo ();

		// ChainOfResponsibilityDemo.chainOfResponsibilityDemo ();

		// CommandDemo.commandDemo ();

		// IteratorDemo.iteratorDemo ();

		MediatorDemo.mediatorDemo();
	}

}
