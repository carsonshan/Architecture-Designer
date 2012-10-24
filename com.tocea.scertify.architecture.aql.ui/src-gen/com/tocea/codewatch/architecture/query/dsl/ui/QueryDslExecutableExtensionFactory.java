/*
 * generated by Xtext
 */
package com.tocea.codewatch.architecture.query.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.tocea.codewatch.architecture.query.dsl.ui.internal.QueryDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class QueryDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return QueryDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return QueryDslActivator.getInstance().getInjector(QueryDslActivator.COM_TOCEA_CODEWATCH_ARCHITECTURE_QUERY_DSL_QUERYDSL);
	}
	
}
