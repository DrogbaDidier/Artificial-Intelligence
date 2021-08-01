/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naufalfahrezi;

import java.io.File;
import kevinnaufalf.Data;
import kevinnaufalf.DataReader;
import kevinnaufalf.Individu;
import kevinnaufalf.Vertex;



public class GA_Elitism {
    public static void main(String[] args) {
        File file = new File("burma14.tsp");
        Vertex[] arrayVertex = DataReader.read(file);
        Data data = new Data(arrayVertex);
        System.out.println(data.toString());
        
        int nGenerasi = 7;
        int nPopulasi = 10;
        
        double bestFitness = 0;
        double bestTotalJarak = 0;
        Individu bestIndividu = null;
        
        for (int i = 1; i <= nGenerasi; i++) {
            System.out.println("Generasi-"+i);
            Individu[] populasi = new Individu[nPopulasi];
            for (int j = 0; j < populasi.length; j++) {
                populasi[j] = new Individu(data);
                populasi[j].generateRandomKromosom();
                populasi[j].hitungNilaiFitness();
                
                System.out.print("Individu : ");
                System.out.print(populasi[j].toString());
                System.out.print(" Jarak : "+populasi[j].getTotalJarak());
                System.out.println(" Fitness : "+populasi[j].getNilaiFitness());
                
                if (populasi[j].getNilaiFitness() > bestFitness) {
                    bestFitness = populasi[j].getNilaiFitness();
                    bestTotalJarak = populasi[j].getTotalJarak();
                    bestIndividu = populasi[j];
                }
            }
            System.out.println("Current Best Individu : ");
            System.out.print("Individu : ");
            System.out.print(bestIndividu.toString());
            System.out.print(" Jarak : "+bestIndividu.getTotalJarak());
            System.out.println(" Fitness : "+bestIndividu.getNilaiFitness());
        }
        System.out.println("Best Solution");
        System.out.print("Individu : ");
        System.out.print(bestIndividu.toString());
        System.out.print(" Jarak : "+bestIndividu.getTotalJarak());
        System.out.println(" Fitness : "+bestIndividu.getNilaiFitness());
    }
}
