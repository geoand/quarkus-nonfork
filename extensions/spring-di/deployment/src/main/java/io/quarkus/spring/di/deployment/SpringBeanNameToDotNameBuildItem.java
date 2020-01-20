package io.quarkus.spring.di.deployment;

import java.util.Map;

import org.jboss.jandex.DotName;

import io.quarkus.builder.item.SimpleBuildItem;

/**

**/
public final class SpringBeanNameToDotNameBuildItem extends SimpleBuildItem {

    private final Map<String, DotName> map;

    public SpringBeanNameToDotNameBuildItem(Map<String, DotName> map) {
        this.map = map;
    }

    public Map<String, DotName> getMap() {
        return map;
    }
}
