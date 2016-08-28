/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module.reflection;

import java.lang.module.ModuleDescriptor;
import java.lang.reflect.Module;
import java.util.Set;

/**
 *
 * @author usta
 */
public class App {

    public static void main(String[] args) {
        
        Module module = App.class.getModule();
        ModuleDescriptor descriptor = module.getDescriptor();
        Set<ModuleDescriptor.Exports> exports = descriptor.exports();
        Set<ModuleDescriptor.Requires> requires = descriptor.requires();

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
