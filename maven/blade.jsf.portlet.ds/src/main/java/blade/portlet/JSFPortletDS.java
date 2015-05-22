/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package blade.portlet;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import javax.portlet.Portlet;
import javax.portlet.faces.GenericFacesPortlet;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=JSF Portlet DS",
		"javax.portlet.init-param.view-template=",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class JSFPortletDS extends GenericFacesPortlet {

	@Activate
	public void activate() {
		System.err.println("!@#$ activated " + this);
	}
}