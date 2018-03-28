package com.vaadin.tests.layouts.layouttester.GridLayout;

import com.vaadin.server.VaadinRequest;

/**
 *
 * @since
 * @author Vaadin Ltd
 */
public class GridComponentSizing extends GridBaseLayoutTestUI {

    @Override
    protected void setup(VaadinRequest request) {
        getLayoutForLayoutSizing("component");
        super.setup(request);
    }
}
