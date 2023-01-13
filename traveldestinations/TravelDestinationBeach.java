package source.assign.traveldestinations;
/**
 * Concrete Object for Destination Type BEACHES
 * @see source.assign.traveldestinations.EnumTravelDestinations
 */
final class TravelDestinationBeach extends TravelDestination{
    private static final double BEACH_SURCHARGE = 100;
    private static final double BASE_SURCHARGE = 1.08;
    
    /**
     * Default Constructor automatically sets Location type to BEACHES
     * @see source.assign.traveldestinations.EnumTravelDestinations
     */
    public TravelDestinationBeach(){
        super.setLocationType(EnumTravelDestinations.BEACHES);
    }
    
    /**
     * Method to calculate Total Travel Amount for destination type BEACHES
     * @return double value of Total Travel Amount after calculation for destination type BEACHES
     * @see source.assign.traveldestinations.EnumTravelDestinations
     */
    @Override
    public double calculateTotalTravelCostAgainstDestination() {
        return (super.getTravelBaseCost() * BASE_SURCHARGE) + BEACH_SURCHARGE;
    }
}
