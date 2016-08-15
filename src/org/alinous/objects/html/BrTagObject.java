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
package org.alinous.objects.html;

import java.io.IOException;
import java.io.Writer;

import org.alinous.exec.pages.PostContext;
import org.alinous.expections.ExecutionException;
import org.alinous.objects.IAlinousObject;
import org.alinous.objects.XMLTagBase;
import org.alinous.script.runtime.VariableRepository;

public class BrTagObject extends XMLTagBase implements IHtmlObject
{

	public IAlinousObject fork() {
		BrTagObject newObj = new BrTagObject();
		
		copyAttribute(this, newObj);
		
		return newObj;
	}

	public void renderContents(PostContext context, VariableRepository valRepo, Writer wr, int n) throws IOException, ExecutionException
	{
		if(!handleIf(context, valRepo)){
			return;
		}
		
		wr.append("<br");
		renderAttributes(context, valRepo, wr, 0);
		wr.append(" />");

	}

	public String getTagName()
	{
		return "BR";
	}

}
