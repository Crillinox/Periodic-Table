import java.util.*;

class PeriodicTable {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] atomicNumber = new int[118]; //initialises 118 element array to hold 118 values
        int answer = 0;
        
        String[] names = {"Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminum", "Silicon", "Phosphorus", "Sulfur", "Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "Iron", "Cobalt", "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "Krypton", "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "Rhodium", "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "Cesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Hafnium", "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "Bismuth", "Polonium", "Astatine", "Radon", "Francium", "Radium", "Actinium", "Thorium", "Protactinium", "Uranium", "Neptunium", "Plutonium", "Americium", "Curium", "Berkelium", "Californium", "Einsteinium", "Fermium", "Mendelevium", "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium", "Seaborgium", "Bohrium", "Hassium", "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium", "Nihonium", "Flerovium", "Moscovium", "Livermorium", "Tennessine", "Oganesson"};
        
        String[] symbols = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og"};
        
        String[] electronConfigurations = {"1s1", "1s2", "1s2 2s1", "1s2 2s2", "1s2 2s2 2p1", "1s2 2s2 2p2", "1s2 2s2 2p3", "1s2 2s2 2p4", "1s2 2s2 2p5", "1s2 2s2 2p6", "1s2 2s2 2p6 3s1", "1s2 2s2 2p6 3s2", "1s2 2s2 2p6 3s2 3p1", "1s2 2s2 2p6 3s2 3p2", "1s2 2s2 2p6 3s2 3p3", "1s2 2s2 2p6 3s2 3p4", "1s2 2s2 2p6 3s2 3p5", "1s2 2s2 2p6 3s2 3p6", "1s2 2s2 2p6 3s2 3p6 4s1", "1s2 2s2 2p6 3s2 3p6 4s2", "1s2 2s2 2p6 3s2 3p6 3d1 4s2", "1s2 2s2 2p6 3s2 3p6 3d2 4s2", "1s2 2s2 2p6 3s2 3p6 3d3 4s2", "1s2 2s2 2p6 3s2 3p6 3d5 4s1", "1s2 2s2 2p6 3s2 3p6 3d5 4s2", "1s2 2s2 2p6 3s2 3p6 3d6 4s2", "1s2 2s2 2p6 3s2 3p6 3d7 4s2", "1s2 2s2 2p6 3s2 3p6 3d8 4s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p3", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p4", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p5", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 5s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 5s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d1 5s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d2 5s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d4 5s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d5 5s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d5 5s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d7 5s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d8 5s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d9 5s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p3", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p4", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p5", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 6s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 5d1 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f1 5d1 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f3 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f4 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f5 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f6 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f7 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f7 5d1 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f9 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f10 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f11 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f12 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f13 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d1 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d2 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d3 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d4 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d5 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d6 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d7 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d9 6s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p3", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p4", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p5", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 7s1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f2 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f3 6d1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f4 6d1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f5 6d1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f6 6d1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f7 6d1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f7 6d2 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f9 6d1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f10 6d1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f11 6d1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f12 6d1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f13 6d1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d1 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d2 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d3 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d4 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d5 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d6 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d7 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d8 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d9 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p1", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p2", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p3", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p4", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p5", "1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p6"};
        
        double[] atomicMass = {1.008, 4.0026, 6.94, 9.0122, 10.81, 12.011, 14.007, 15.999, 18.998, 20.18, 22.99, 24.305, 26.982, 28.085, 30.974, 32.06, 35.45, 39.948, 39.098, 40.078, 44.956, 47.867, 50.942, 51.996, 54.938, 55.845, 58.933, 58.693, 63.546, 65.38, 69.723, 72.63, 74.922, 78.971, 79.904, 83.798, 85.468, 87.62, 88.906, 91.224, 92.906, 95.95, 98.0, 101.07, 102.91, 106.42, 107.87, 112.41, 114.82, 118.71, 121.76, 127.6, 126.9, 131.29, 132.91, 137.33, 138.91, 140.12, 140.91, 144.24, 145.0, 150.36, 151.96, 157.25, 158.93, 162.5, 164.93, 167.26, 168.93, 173.05, 174.97, 178.49, 180.95, 183.84, 186.21, 190.23, 192.22, 195.08, 196.97, 200.59, 204.38, 207.2, 208.98, 209.0, 210.0, 222.0, 223.0, 226.0, 227.0, 232.04, 231.04, 238.03, 237.0, 244.0, 243.0, 247.0, 247.0, 251.0, 252.0, 257.0, 258.0, 259.0, 262.0, 267.0, 270.0, 271.0, 270.0, 277.0, 278.0, 281.0, 282.0, 285.0, 286.0, 289.0, 290.0, 293.0, 294.0, 294.0};


        
        for(int i = 0; i<atomicNumber.length; i++){
            atomicNumber[i] = i + 1;
            //for loop looping through each element of the atomicNumber array, setting each array value starting from 1 all the way to 118, then printing every value
        }
        
        while(true){
            System.out.println("What element do you want to use? [type atomic num]: "); //get user input
            
            int neutronCount = 0;
            
            if (input.hasNextInt()) {
                answer = input.nextInt();
                if (answer == 0) {
                    System.out.println("Goodbye!");
                    break;
                }
                if(answer <= 118 && answer > 0){
                    neutronCount = (int)atomicMass[answer-1] - answer;
                
                    System.out.println();
                    System.out.println("Element Name: " + names[answer-1]);
                    System.out.println("Element Symbol: " + symbols[answer-1]);
                    System.out.println("Atomic Number: " + atomicNumber[answer-1]);
                    System.out.println("Neutrons: " + neutronCount);
                    System.out.println("Electrons (neutral): " + answer);
                    System.out.println("Electron Configuration: " + electronConfigurations[answer-1]);
                    System.out.println("Atomic Mass: " + atomicMass[answer-1]);//display info
                    
                    System.out.println();System.out.println();System.out.println();    
                }
                else{
                    System.out.println(answer + " does not exist as an atomic number. \n\n");
                }
            }
            else {
                System.out.println(answer + " does not exist as an atomic number. \n\n");
                input.nextLine();
            }
        }
    }
}