package source.assign;

import java.util.ArrayList;
import java.util.List;
import source.assign.traveldestinations.EnumTravelDestinations;
import source.assign.traveldestinations.TravelDestination;
import source.assign.traveldestinations.TravelDestinationFactory;

/**
 * This code fixes the following:
 * 1) The violated SOLID Design Principle - 'Open Close principle'
 * 2) The missed Design Pattern - 'Factory Method'
 *
 * @author Dr. Macam Dattathreya
 * @date 07/18/2020
 *
 */

public class TestTravelAgency {

    String a, i, b;
    /**
      * This function takes care of the flow of the program
      * it uses the TravelDestinationFactory to get the Objects of TravelDestination child classes
      * calculates and prints its total cost and prints all destinations entered and their specific costs.
      * @param String[] args
      */
    public static void main(String[] args) {
        TravelAgency travelAgencyInfo = new TravelAgency();
        //Total Costs for various travel destinations
        TravelDestination beaches = new TravelDestinationFactory().getTravelDestination(EnumTravelDestinations.BEACHES);
        beaches.setTravelBaseCost(1000);
        TravelDestination religious = new TravelDestinationFactory().getTravelDestination(EnumTravelDestinations.RELIGIOUS);
        religious.setTravelBaseCost(500);
        TravelDestination hiking = new TravelDestinationFactory().getTravelDestination(EnumTravelDestinations.HIKING);
        hiking.setTravelBaseCost(2000);
        
        
        TravelDestination vinyard = new TravelDestinationFactory().getTravelDestination(EnumTravelDestinations.VINYARDS);
        vinyard.setTravelBaseCost(2000);

        List<TravelDestination> travelDestinations = new ArrayList<TravelDestination>();
        travelDestinations.add(beaches);
        travelDestinations.add(religious);
        travelDestinations.add(hiking);
        travelDestinations.add(vinyard);

        //Print the travel costs
        System.out.println("The total cost of this trip: $" +
                travelAgencyInfo.getTotalTravelCost(travelDestinations) +"\n");
        for (TravelDestination travelDestination : travelDestinations) {
            System.out.println("Destination: " + travelDestination.getLocationType() +
                    "\tTravel Cost: $" + travelDestination.calculateTotalTravelCostAgainstDestination());
        }

    }
}
