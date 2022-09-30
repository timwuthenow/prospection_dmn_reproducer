package com.prospection.model;

import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "numberOfProcessors", "memory", "diskSpace", "validated", "validationMessages"})
public class Server {

    private String          ID;
    private int             numberOfProcessors;
    private int             memory;
    private int             diskSpace;
    private boolean         validated = true;
    private List<String>    validationMessages = new ArrayList<String>();

    public String getID() { 
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNumberOfProcessors() {
        return this.numberOfProcessors;
    }

    public void setNumberOfProcessors(int numberOfProcessors) {
        this.numberOfProcessors = numberOfProcessors;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDiskSpace() {
        return this.diskSpace;
    }

    public void setDiskSpace(int diskSpace) {
        this.diskSpace = diskSpace;
    }

    public boolean isValidated() {
        return this.validated;
    }

    public List<String> getValidationMessages() {
        return this.validationMessages;
    }

    public void markAsValid(String reason) {
        this.validated = true;
        this.validationMessages.add(reason);
    }

    public void markAsInvalid(String reason) {
        this.validated = false;
        this.validationMessages.add(reason);
    }
}
