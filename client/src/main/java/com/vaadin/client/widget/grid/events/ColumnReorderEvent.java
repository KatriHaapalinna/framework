/*
 * Copyright 2000-2018 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.client.widget.grid.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * An event for notifying that the columns in the Grid have been reordered.
 *
 * @param <T>
 *            The row type of the grid. The row type is the POJO type from where
 *            the data is retrieved into the column cells.
 * @since 7.5.0
 * @author Vaadin Ltd
 */
public class ColumnReorderEvent<T> extends GwtEvent<ColumnReorderHandler<T>> {

    /**
     * Handler type.
     */
    private final static Type<ColumnReorderHandler<?>> TYPE = new Type<ColumnReorderHandler<?>>();

    public static final Type<ColumnReorderHandler<?>> getType() {
        return TYPE;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public Type<ColumnReorderHandler<T>> getAssociatedType() {
        return (Type) TYPE;
    }

    @Override
    protected void dispatch(ColumnReorderHandler<T> handler) {
        handler.onColumnReorder(this);
    }

}
