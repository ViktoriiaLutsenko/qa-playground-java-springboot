package com.vlutsenko.qaplaygroundjavaspring.page.multileveldropdown;

import com.vlutsenko.framework.config.annotations.LazyAutowired;
import com.vlutsenko.framework.config.annotations.LazyComponentPrototypeScope;
import com.vlutsenko.framework.page.AbstractComponent;

@LazyComponentPrototypeScope
public class MultiLevelDropdownPage extends AbstractComponent {

    @LazyAutowired
    private DropdownComponent dropdownComponent;

    public DropdownComponent getDropdownComponent() {
        return dropdownComponent;
    }

    @Override
    public boolean isAt() {
        return wait.until((d) -> dropdownComponent.isAt());
    }
}
