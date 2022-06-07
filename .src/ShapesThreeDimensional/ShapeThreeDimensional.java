package ShapesThreeDimensional;

import java.util.*;

import Prices.*;

public abstract class ShapeThreeDimensional {
    private static final PriceDataRetriever retrieverWrapper = new PriceDataRetriever("Materialpreise Oberflaechen.csv", "\t");
    private static final PriceDataRetriever retrieverFill = new PriceDataRetriever("Materialpreise Fuellung.csv", ";");
    private static final HashMap<String, Double> wrapperPrices = retrieverWrapper.getRecords();
    private static final HashMap<String, Double> fillPrices = retrieverFill.getRecords();

    abstract public double calculateSurfaceArea();

    abstract public double calculateVolume();

    public double calculatePrice(String wrapperMaterial, String fillMaterial) {
        double priceFill = this.calculateVolume() * fillPrices.get(fillMaterial);
        double priceWrapper = this.calculateSurfaceArea() * wrapperPrices.get(wrapperMaterial);
        return priceFill + priceWrapper;

    }

}
