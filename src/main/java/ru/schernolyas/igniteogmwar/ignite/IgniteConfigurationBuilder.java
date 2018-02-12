/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.schernolyas.igniteogmwar.ignite;

import org.apache.ignite.binary.BinaryBasicNameMapper;
import org.apache.ignite.configuration.BinaryConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;

/**
 *
 * @author osboxes
 */
public class IgniteConfigurationBuilder implements org.hibernate.ogm.datastore.ignite.IgniteConfigurationBuilder {
    private static final boolean BY_SIMPLE_NAME = true;

    @Override
    public IgniteConfiguration build() {
        IgniteConfiguration config = new IgniteConfiguration();
        config.setIgniteInstanceName("hibernate-ogm");
        config.setClientMode(false);
       

        BinaryConfiguration binaryConfiguration = new BinaryConfiguration();
        binaryConfiguration.setCompactFooter(false);
        binaryConfiguration.setNameMapper(new BinaryBasicNameMapper(BY_SIMPLE_NAME));
        config.setBinaryConfiguration(binaryConfiguration);       
        return config;
    }

}
