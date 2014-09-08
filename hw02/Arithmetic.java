//// Pablo Aviles
// Homework 2
// Arithmetic

public class Arithmetic{
    public static void main(String[] args){
        int nSocks = 3; //number of pairs of socks
        double sockCost$ = 2.58;
        int nGlasses = 6; // Number of drinking glasses
        double glassCost$ = 2.29;
        int nEnvelopes = 1; // number of boxes of envelopes
        double envelopeCost$ = 3.25; // cost per box of envelopes
        double taxPercent = 0.06; // tax in PA
        double totalSockCost = 0.0; // total cost of socks
        double totalGlassCost = 0.0; // total cost of glasses
        double totalEnvelopeCost = 0.0; // total cost of envelopes
        double glassTax = 0.0; // tax for each glass
        double totalGlassTax = 0.0; // tax for all glasses
        double sockTax = 0.0; // tax for each sock
        double totalSockTax = 0.0; // total tax for socks
        double envelopeTax = 0.0; // tax for each envelope
        double totalEnvelopeTax = 0.0; // total envelope tax
        double costBeforeTax = 0.0; // total cost of purchases before tax
        double totalTax = 0.0; // total tax paid
        double totalCostWithTax = 0.0; // final cost with tax
        
        // Glass calculations
        totalGlassCost = nGlasses*glassCost$;
        glassTax = glassCost$*taxPercent;
        glassTax = (int)(glassTax*100)/100.0;
        totalGlassTax = totalGlassCost*taxPercent;
        
        // Sock calculations
        totalSockCost = nSocks*sockCost$;
        sockTax = sockCost$*taxPercent;
        sockTax = (int)(sockTax*100)/100.0;
        totalSockTax = totalSockCost*taxPercent;
        
        // Envelope calculations
        totalEnvelopeCost = nEnvelopes*envelopeCost$;
        envelopeTax = envelopeCost$*taxPercent;
        envelopeTax = (int)(envelopeTax*100)/100.0;
        totalEnvelopeTax = totalEnvelopeCost*taxPercent;
        
        // final calculations
        costBeforeTax = totalGlassCost+totalSockCost+totalEnvelopeCost;
        totalTax = totalGlassTax+totalEnvelopeTax+totalSockTax;
        totalTax = (int)(totalTax*100)/100.0;
        totalCostWithTax = costBeforeTax+totalTax;
        
        // output
        System.out.println(nSocks+ " Socks " + sockCost$ + " Tax: "+sockTax + " Total: " +totalSockCost );
        System.out.println(nGlasses+ " Glass " + glassCost$ + " Tax: "+glassTax + " Total: "+ totalGlassCost  );
        System.out.println(nEnvelopes +" Envelopes " + envelopeCost$ + " Tax: "+envelopeTax + " Total: "+ totalEnvelopeCost  );
        System.out.println("Subtotal: "+ costBeforeTax);
        System.out.println("Tax: "+ totalTax);
        System.out.println("Total "+ totalCostWithTax);
        
        
        
        
    }
}