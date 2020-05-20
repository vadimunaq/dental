package com.gmail.vadim.ui;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.server.PWA;

import static com.gmail.vadim.ui.utils.BakeryConst.VIEWPORT;

@Viewport(VIEWPORT)
@PWA(name = "Bakery App Starter", shortName = "Dental",
		startPath = "login",
		backgroundColor = "#227aef", themeColor = "#227aef",
		offlinePath = "offline-page.html",
		offlineResources = {"images/offline-login-banner.jpg"},
		enableInstallPrompt = false)
public class AppShell implements AppShellConfigurator {
}
