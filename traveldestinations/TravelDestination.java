package source.assign.traveldestinations;
/**
 * Simple abstraction for all the travel destination types
 */
public abstract class TravelDestination {

    private String locationName;
    private double travelBaseCost;
    private EnumTravelDestinations locationType;
    /**
     * Method to get LocationName
     * @return String Name of the location
     */
    public String getLocationName() {
        return locationName;
    }
    /**
     * Sets Name of the location
     * @param name Name of the location
     */
    public void setLocationName(String name) {
        this.locationName = name;
    }
    /**
     * Method to get travel base cost
     * @return 
     */
    public double getTravelBaseCost() {
        return travelBaseCost;
    }
    
    /**
     *  Sets travel base cost
     * @param travelBaseCost double positive value for travel cost
     */
    public void setTravelBaseCost(double travelBaseCost) {
        this.travelBaseCost = travelBaseCost;
    }
    
    /**
     * method to get location type
     * @return selected location type which exist in the below given enum
     * @see source.assign.traveldestinations.EnumTravelDestinations
     */
    public EnumTravelDestinations getLocationType() {
        return locationType;
    }
    /**
     * Sets location type
     * @param locationType selected location type which exist in the below given enum
     * @see source.assign.traveldestinations.EnumTravelDestinations
     */
    void setLocationType(EnumTravelDestinations locationType) {
        this.locationType = locationType;
    }
    /**
     * Method to calculate the amount of the Destination
     * @return double value which is calculated after all surcharges
     */
    public abstract double calculateTotalTravelCostAgainstDestination();
}
