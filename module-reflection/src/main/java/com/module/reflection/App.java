package com.module.reflection;

import java.lang.module.ModuleDescriptor;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        Module module = App.class.getModule();
        ModuleDescriptor descriptor = module.getDescriptor();
        Set<ModuleDescriptor.Exports> exports = descriptor.exports();
        Set<ModuleDescriptor.Requires> requires = descriptor.requires();

        System.out.println("Module name: " + descriptor.name());
        System.out.println("Automatic module?: " + descriptor.isAutomatic());
        System.out.println("Open module?: " + descriptor.isOpen());

        for (ModuleDescriptor.Requires require : requires) {
            String name = require.name();
            System.out.println("Requires... " + name);
        }

        for (ModuleDescriptor.Exports export : exports) {
            String source = export.source();
            System.out.println("Exports... " + source);
        }
    }

}
