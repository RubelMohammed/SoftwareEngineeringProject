package source.assign.traveldestinations;
/**
 * Concrete Object for Destination Type VINYARDS
 * @see source.assign.traveldestinations.EnumTravelDestinations
 */
final class TravelDestinationVinyards  extends TravelDestination{
    private static final double VINYARDS_SURCHARGE = 0;
    private static final double BASE_SURCHARGE = 1;
    
    /**
     * Default Constructor automatically sets Location type to VINYARDS
     * @see source.assign.traveldestinations.EnumTravelDestinations
     */
    public TravelDestinationVinyards(){
        super.setLocationType(EnumTravelDestinations.VINYARDS);
    }
    
    /**
     * Method to calculate Total Travel Amount for destination type VINYARDS
     * @return double value of Total Travel Amount after calculation for destination type VINYARDS
     * @see source.assign.traveldestinations.EnumTravelDestinations
     */
    @Override
    public double calculateTotalTravelCostAgainstDestination() {
        return (super.getTravelBaseCost() * BASE_SURCHARGE) + VINYARDS_SURCHARGE;
    }
}
