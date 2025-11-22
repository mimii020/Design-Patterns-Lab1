package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public interface EncodingModuleInterface {
    public void encodeWithFiles(String inputFile, String outputFile) throws IOException;
    void encodeBasedOnNetworkAndDatabase() throws IOException;
}
