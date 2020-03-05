package com.dayvar.strategy.problem;

public class ImageStorage {
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }


    public void store(String fileName){
        //Too many responsibilities within one class
        if(compressor == "jpeg")
            System.out.println("Compressing using JPEG");
        else if (compressor == "png")
            System.out.println("Compressing using PNG");

        //Hard to extend code
        if(filter == "b&w")
            System.out.println("Applying B&W filter");
        else if (filter == "high-contrast")
            System.out.println("Applying high contrast filter");


    }
}
