package source.assign.traveldestinations;
/**
 * Concrete Object for Destination Type RELIGIOUS
 * @see source.assign.traveldestinations.EnumTravelDestinations
 */
final class TravelDestinationReligious extends TravelDestination{
    private static final double RELEGIOUS_SURCHARGE = 0;
    private static final double BASE_SURCHARGE = 1;
    
    /**
     * Default Constructor automatically sets Location type to RELIGIOUS
     * @see source.assign.traveldestinations.EnumTravelDestinations
     */
    public TravelDestinationReligious(){
        super.setLocationType(EnumTravelDestinations.RELIGIOUS);
    }
    
    /**
     * Method to calculate Total Travel Amount for destination type RELIGIOUS
     * @return double value of Total Travel Amount after calculation for destination type RELIGIOUS
     * @see source.assign.traveldestinations.EnumTravelDestinations
     */
    @Override
    public double calculateTotalTravelCostAgainstDestination() {
        return (super.getTravelBaseCost() * BASE_SURCHARGE) + RELEGIOUS_SURCHARGE;
    }
    
}
