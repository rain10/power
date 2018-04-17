package org.arain.power.system.config.beetl;

import org.arain.power.system.utils.ShiroExt;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

    @Override
    public void initOther() {
        groupTemplate.registerFunctionPackage("shiro", new ShiroExt());
    }
}
