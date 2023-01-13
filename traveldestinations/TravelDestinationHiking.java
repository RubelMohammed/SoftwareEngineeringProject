package source.assign.traveldestinations;
/**
 * Concrete Object for Destination Type HIKING
 * @see source.assign.traveldestinations.EnumTravelDestinations
 */
final class TravelDestinationHiking extends TravelDestination{
    private static final double HIKING_SURCHARGE = 200;
    private static final double BASE_SURCHARGE = 1.16;
    
    /**
     * Default Constructor automatically sets Location type to HIKING
     * @see source.assign.traveldestinations.EnumTravelDestinations
     */
    public TravelDestinationHiking(){
        super.setLocationType(EnumTravelDestinations.HIKING);
    }
    
    /**
     * Method to calculate Total Travel Amount for destination type HIKING
     * @return double value of Total Travel Amount after calculation for destination type HIKING
     * @see source.assign.traveldestinations.EnumTravelDestinations
     */
    @Override
    public double calculateTotalTravelCostAgainstDestination() {
        return (super.getTravelBaseCost() * BASE_SURCHARGE) + HIKING_SURCHARGE;
    }
}
