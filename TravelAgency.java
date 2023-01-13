package source.assign;

import java.util.List;
import source.assign.traveldestinations.TravelDestination;

public class TravelAgency {
	public double getTotalTravelCost(List<TravelDestination> travelDestinations){
            double travelTotal = 0;
            for (TravelDestination travelDestination : travelDestinations) {
                travelTotal += travelDestination.calculateTotalTravelCostAgainstDestination();
            }
            return travelTotal;
	}
}
