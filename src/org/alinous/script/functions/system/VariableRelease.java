/**
 * CROSSFIRE JAPAN INCORPORATED
 * This source code is under GPL License.
 * info@crossfire.jp
 * Official web site
 * http://alinous.org
 * 
 *  Copyright (C) 2007 Tomohiro Iizuka
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.alinous.script.functions.system;

import java.util.Stack;

import org.alinous.exec.pages.PostContext;
import org.alinous.expections.ExecutionException;
import org.alinous.expections.RedirectRequestException;
import org.alinous.script.basic.type.IStatement;
import org.alinous.script.basic.type.VariableDescriptor;
import org.alinous.script.functions.ArgumentDeclare;
import org.alinous.script.runtime.IPathElement;
import org.alinous.script.runtime.IScriptVariable;
import org.alinous.script.runtime.VariableRepository;

public class VariableRelease extends AbstractSystemFunction
{
	public static String QUALIFIED_NAME = "VARIABLE.RELEASE";
	public static String RELEASE_ARG = "arg0";
	
	public VariableRelease()
	{
		ArgumentDeclare arg = new ArgumentDeclare("*", RELEASE_ARG);
		this.argmentsDeclare.addArgument(arg);
	}
	
	public IScriptVariable executeFunction(PostContext context, VariableRepository valRepo) throws ExecutionException, RedirectRequestException
	{
		Stack<IStatement> stmtStack = context.getFuncArgStack();
		
		if(stmtStack.size() != 1){
			throw new ExecutionException("Number of the function is wrong.");// i18n
		}
		
		IStatement stmt = stmtStack.get(0);
		
		if(!(stmt instanceof VariableDescriptor)){
			throw new ExecutionException("The argument must be a variable descriptor.");// i18n
		}
		
		VariableDescriptor variableDesc = (VariableDescriptor)stmt;
		
		IPathElement pathEl = variableDesc.getPath();
		
		valRepo.release(pathEl, context);
		
		return null;
	}

	public String getName()
	{
		return QUALIFIED_NAME;
	}

	@Override
	public String codeAssistString() {
		return "Variable.release($arg0)";
	}

	@Override
	public String descriptionString() {
		return "Release the variable. The $arg0 can be the ArrayVariable, @arg0.\n" +
				"If member of a Array is specified, releases just the member only";
	}

}
