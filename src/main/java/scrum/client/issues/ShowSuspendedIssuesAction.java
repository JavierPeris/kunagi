/*
 * Copyright 2011 Witoslaw Koczewsi <wi@koczewski.de>, Artjom Kochtchi
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package scrum.client.issues;

import ilarkesto.core.scope.Scope;
import scrum.client.common.TooltipBuilder;

public class ShowSuspendedIssuesAction extends GShowSuspendedIssuesAction {

	@Override
	public String getLabel() {
		return "Show suspended issues";
	}

	@Override
	protected void updateTooltip(TooltipBuilder tb) {
		tb.setText("Load all suspended issues into this view.");
	}

	@Override
	protected void onExecute() {
		Scope.get().getComponent(IssueManager.class).setSuspendedIssuesVisible(true);
	}

}