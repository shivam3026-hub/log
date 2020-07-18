package Area;

class CalculateInterest {

    private final double standardMaterialsCost = 1200;
    private final double mediumMaterialsCost= 1500;
    private final double highMaterialtCosr = 1800;
    private final double highMaterialsAndAutomationCost = 2500;

    public double getInterest(double area, String materialStandard, boolean automation)  {
        double Cost = checkMaterial(materialStandard,automation);

        return area*Cost;
    }

    private double checkMaterial(String materialStandard, boolean automation) {
        if(materialStandard.toLowerCase().equals(App.Standards.standardMaterials.toString().toLowerCase()))
            return standardMaterialsCost;
        else if(materialStandard.toLowerCase().equals(App.Standards.mediumStandardMaterials.toString().toLowerCase()))
            return mediumMaterialsCost;
        else {
            boolean material = materialStandard.toLowerCase().equals(App.Standards.highStandardMaterials.toString().toLowerCase());
            if(material && !automation)
                return highMaterialtCosr;
            else if(material && automation)
                return highMaterialsAndAutomationCost;
        }

return -1;
    }
}
