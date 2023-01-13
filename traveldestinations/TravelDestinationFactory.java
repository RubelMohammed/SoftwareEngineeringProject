package source.assign.traveldestinations;
/**
 * Concrete Factory for travel destinations
 * @see source.assign.traveldestinations.EnumTravelDestinations 
 */
public class TravelDestinationFactory {
    
    /**
     * Factory method to get the object of all Travel Destination Types
     * @param enumTeavelDestinations enumeration constant of class EnumTravelDestinations
     * @see source.assign.traveldestinations.EnumTravelDestinations 
     * @return the instantiated object of the given type
     */
    public TravelDestination getTravelDestination(EnumTravelDestinations enumTeavelDestinations){
        switch(enumTeavelDestinations){
            case RELIGIOUS:{
                return new TravelDestinationReligious();
            }
            case BEACHES:{
                return new TravelDestinationBeach();
            }
            case HIKING:{
                return new TravelDestinationHiking();
            }
            case VINYARDS:{
                return new TravelDestinationVinyards();
            }
            default:{
                System.out.println("Travel Destination does not Exist");
                return null;
            }
        }
    }
}
