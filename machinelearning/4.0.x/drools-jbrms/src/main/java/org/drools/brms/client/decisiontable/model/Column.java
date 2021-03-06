package org.drools.brms.client.decisiontable.model;
/*
 * Copyright 2005 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



import java.util.ArrayList;
import java.util.List;

public class Column {
	private List cells = new ArrayList();
	private DecisionTable parent;
	
	Column(DecisionTable dt) {
		this.parent = dt;
	}
	void addCell(final Cell cell) {
		cells.add(cell);
	}

	public int getIndex() {
		return parent.getColumnIndex(this);
	}
	public void removeCell(Cell cell) {
		cells.remove(cell);
	}
}