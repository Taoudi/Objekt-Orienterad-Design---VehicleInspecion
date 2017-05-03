/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.integration;


/**
 * This class is responsible for instantiating all registries.
 */
public class RegistryCreator {
    private RegNumberRegistry regNumberRegistry = new RegNumberRegistry();
    private InspectionCatalog inspectionCatalog = new InspectionCatalog();
     /**
     * Get the register number list
     *
     * @return regNumberRegistry
     */
    public RegNumberRegistry getNumberRegistry() {
        return regNumberRegistry;
    }
    /**
     * Get the list of results
     * @return inspectionCatalog
     */
     public InspectionCatalog getInspectionCatalog() {
        return inspectionCatalog;
    }
}
