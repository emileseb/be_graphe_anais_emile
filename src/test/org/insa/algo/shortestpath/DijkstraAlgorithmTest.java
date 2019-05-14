package org.insa.algo.shortestpath;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.insa.algo.ArcInspector;
import org.insa.algo.ArcInspectorFactory;
import org.insa.graph.Graph;
import org.insa.graph.Node;
import org.insa.graph.io.BinaryGraphReader;
import org.insa.graph.io.GraphReader;
import org.junit.Test;

public class DijkstraAlgorithmTest {
	
	@SuppressWarnings("unused")
	private static String hotGaronne, hotNormandie, k_rey ;
	private static ArcInspector arcinsp1, arcinsp2;
	// List of nodes
    private static Node[] nodes;
    //nom  : R = routière NR = non Routière; Type de parcours (Noeud origine et dest) ; arc inspector 1 ou 3 : A1 A3; T = temps D = distance
    private static ShortestPathData R1classiqueA1T, NRclassiqueA1T, R1classiqueA2D, NRclassiqueA2D ;
    
    // Create a graph reader.
    private static GraphReader R1, R2, NR;

    // TODO: Read the graph. Fait
    private static Graph grR1, grR2, grNR;
    
    private static DijkstraAlgorithm dijAlg1, dijAlg2, dijAlg3, dijAlg4;
    
	public static void initAll() throws IOException {
		hotGaronne = "/home/emile/Documents/INSA/sem6/europe/france/haute-garonne.mapgr"; //des cartes chaudes de ta région
		hotNormandie = "/home/emile/Documents/INSA/sem6/europe/france/haute-normandie.mapgr";  //il fait quand même moins chaud qu'à Toulouse
		k_rey = "/home/emile/Documents/INSA/sem6/extras/carre-dense.mapgr";
		R1 = new BinaryGraphReader(new DataInputStream(new BufferedInputStream(new FileInputStream(hotGaronne))));
		R2 = new BinaryGraphReader(new DataInputStream(new BufferedInputStream(new FileInputStream(hotNormandie))));
		NR = new BinaryGraphReader(new DataInputStream(new BufferedInputStream(new FileInputStream(k_rey))));
		
		grR1 = R1.read();
		grR2 = R2.read();
		grNR = NR.read();
		
		arcinsp1 = ArcInspectorFactory.getAllFilters().get(0);
		arcinsp2 = ArcInspectorFactory.getAllFilters().get(2);
		
        R1classiqueA1T = new ShortestPathData(Graph, nodes[1], nodes[6], arcinsp1);
        NRclassiqueA1T = new ShortestPathData(arcinsp1);
        R1classiqueA2D = new ShortestPathData(arcinsp2);
        NRclassiqueA2D = new ShortestPathData(arcinsp2);
        
        dijAlg1 = new ;
        dijAlg2 = ;
        dijAlg3 = ;
        dijAlg4 = ;
        
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
