/*
 * generated by Xtext
 */
package com.tocea.codewatch.architecture.dsl;

import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Binder;
import com.tocea.codewatch.architecture.dsl.generator.ArchitectureDSLGenerator;
import com.tocea.codewatch.architecture.dsl.scoping.ArchitectureDSLScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ArchitectureDSLRuntimeModule extends com.tocea.codewatch.architecture.dsl.AbstractArchitectureDSLRuntimeModule {

	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return ArchitectureDSLScopeProvider.class;
	}

	@Override
	public Class<? extends IGenerator> bindIGenerator() {
		return ArchitectureDSLGenerator.class;
	}

	@Override
	public void configure(Binder binder) {
		binder.bind(IEObjectDocumentationProvider.class).to(MultiLineCommentDocumentationProvider.class);
		super.configure(binder);
	}

//	@Override
//	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
//		// TODO Auto-generated method stub
//		return super.bindIDefaultResourceDescriptionStrategy();
//	}

}
