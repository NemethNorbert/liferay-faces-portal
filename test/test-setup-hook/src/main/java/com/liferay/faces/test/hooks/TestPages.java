/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.test.hooks;

import java.util.ArrayList;
import java.util.List;


/**
 * The purpose of this class is to isolate source code differences between different versions of Liferay Portal.
 *
 * @author  Neil Griffin
 */
public class TestPages {

	public static final List<PortalPage> BRIDGE_DEMO_PAGES;
	public static final List<PortalPage> BRIDGE_ISSUE_PAGES;
	public static final List<PortalPage> LSV_ISSUE_PAGES;
	public static final List<PortalPage> PORTAL_DEMO_PAGES;
	public static final List<PortalPage> PORTAL_ISSUE_PAGES;
	public static final List<PortalPage> GUEST_PAGES;

	static {
		BRIDGE_DEMO_PAGES = new ArrayList<PortalPage>();
		BRIDGE_DEMO_PAGES.add(new PortalPage("JSF", "1_WAR_jsf2portlet_INSTANCE_"));
		BRIDGE_DEMO_PAGES.add(new PortalPage("JSF-CDI", "1_WAR_jsf2cdiportlet_INSTANCE_"));
		BRIDGE_DEMO_PAGES.add(new PortalPage("JSF-FLOWS", "1_WAR_jsf2flowsportlet_INSTANCE_"));
		BRIDGE_DEMO_PAGES.add(new PortalPage("JSF-HTML5", "1_WAR_jsf2html5portlet_INSTANCE_"));
		BRIDGE_DEMO_PAGES.add(new PortalPage("JSF-SPRING", "1_WAR_jsf2springportlet_INSTANCE_"));
		BRIDGE_DEMO_PAGES.add(new PortalPage("JSF-JSP", "1_WAR_jsf2jspportlet_INSTANCE_"));
		BRIDGE_DEMO_PAGES.add(new PortalPage("JSF-PDF", "1_WAR_jsf2exportpdfportlet"));
		BRIDGE_DEMO_PAGES.add(new PortalPage("JSF-EVENTS",
				new String[] {
					"customers_WAR_jsf2ipceventscustomersportlet", "bookings_WAR_jsf2ipceventsbookingsportlet"
				}));
		BRIDGE_DEMO_PAGES.add(new PortalPage("JSF-PRP",
				new String[] {
					"customersPortlet_WAR_jsf2ipcpubrenderparamsportlet",
					"bookingsPortlet_WAR_jsf2ipcpubrenderparamsportlet"
				}));
		BRIDGE_DEMO_PAGES.add(new PortalPage("ICE", "1_WAR_icefaces4portlet_INSTANCE_"));
		BRIDGE_DEMO_PAGES.add(new PortalPage("ALLOY", "1_WAR_liferayfaces4portlet_INSTANCE_"));
		BRIDGE_DEMO_PAGES.add(new PortalPage("PRIME", "1_WAR_primefaces4portlet_INSTANCE_"));
		BRIDGE_DEMO_PAGES.add(new PortalPage("RICH", "1_WAR_richfaces4portlet_INSTANCE_"));
	}

	static {
		BRIDGE_ISSUE_PAGES = new ArrayList<PortalPage>();
		BRIDGE_ISSUE_PAGES.add(new PortalPage("FACES-224", "1_WAR_FACES224portlet"));
		BRIDGE_ISSUE_PAGES.add(new PortalPage("FACES-1470", "1_WAR_FACES1470portlet"));
		BRIDGE_ISSUE_PAGES.add(new PortalPage("FACES-1478", "1_WAR_FACES1478portlet"));
		BRIDGE_ISSUE_PAGES.add(new PortalPage("FACES-1618", "1_WAR_FACES1618portlet"));
		BRIDGE_ISSUE_PAGES.add(new PortalPage("FACES-1635",
				new String[] { "1_WAR_jsf2portlet_INSTANCE_", "1_WAR_primefaces4portlet_INSTANCE_" }));
		BRIDGE_ISSUE_PAGES.add(new PortalPage("FACES-1638", "1_WAR_FACES1638portlet"));
	}

	static {
		LSV_ISSUE_PAGES = new ArrayList<PortalPage>();
		LSV_ISSUE_PAGES.add(new PortalPage("LSV-5", "1_WAR_lsv5portlet"));
		LSV_ISSUE_PAGES.add(new PortalPage("LSV-71-Auto-Dispatch", "1_WAR_lsv71portlet"));
		LSV_ISSUE_PAGES.add(new PortalPage("LSV-71-Non-Dispatch", "2_WAR_lsv71portlet"));
		LSV_ISSUE_PAGES.add(new PortalPage("LSV-71-Resource-Handler", "3_WAR_lsv71portlet"));
		LSV_ISSUE_PAGES.add(new PortalPage("LSV-158-Auto-Dispatch", "1_WAR_lsv158portlet"));
		LSV_ISSUE_PAGES.add(new PortalPage("LSV-158-Non-Dispatch", "2_WAR_lsv158portlet"));
	}

	static {
		PORTAL_DEMO_PAGES = new ArrayList<PortalPage>();
	}

	static {
		PORTAL_ISSUE_PAGES = new ArrayList<PortalPage>();
		PORTAL_ISSUE_PAGES.add(new PortalPage("FACES-257", "1_WAR_FACES257portlet"));
		PORTAL_ISSUE_PAGES.add(new PortalPage("FACES-1427", "1_WAR_FACES1427portlet"));
		PORTAL_ISSUE_PAGES.add(new PortalPage("FACES-1439", "1_WAR_FACES1439portlet"));
	}

	static {
		GUEST_PAGES = new ArrayList<PortalPage>();
		GUEST_PAGES.add(new PortalPage("JSF2-SIGN-IN", "1_WAR_jsf2loginportlet"));
		GUEST_PAGES.add(new PortalPage("SHOWCASE", "1_WAR_showcaseportlet", "2_columns_iii"));
	}
}
