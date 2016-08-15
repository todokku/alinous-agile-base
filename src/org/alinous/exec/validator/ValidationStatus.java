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
package org.alinous.exec.validator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ValidationStatus
{
	private boolean status;
	private List<ValidationRequest> failedRequests = new ArrayList<ValidationRequest>();
	
	public ValidationStatus()
	{
		this.status = true;
	}
	
	public boolean getStatus()
	{
		return this.status;
	}
	
	public Iterator<ValidationRequest> iterator()
	{
		return this.failedRequests.iterator();
	}
	
	public void addFailedRequest(ValidationRequest request)
	{
		this.failedRequests.add(request);
		this.status = false;
	}
}
