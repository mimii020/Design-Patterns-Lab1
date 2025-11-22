package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    public EncodingModuleInterface module;

    public EncodingModuleClient(EncodingModuleInterface module) {
        this.module = module;
    }

    public void encodeFile(String inputFile, String outputFile) throws IOException {
        this.module.encodeWithFiles(inputFile, outputFile);
    }

    public void encodeDb() throws IOException {
        this.module.encodeBasedOnNetworkAndDatabase();
    }

    public static void main(String[] args) throws IOException
    {   
        String inputFile = "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt";
        String outputFile = "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt";

        EncodingModuleInterface encodingModule = new EncodingModule();
        EncodingModuleClient client = new EncodingModuleClient(encodingModule);
        client.encodeFile(inputFile, outputFile);
        client.encodeDb();
    }
}

