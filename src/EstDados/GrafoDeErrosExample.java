package EstDados;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node; 
import org.graphstream.ui.*; 
import org.graphstream.graph.implementations.SingleGraph;

public class GrafoDeErrosExample {
       public static void main(String[] args) {
         System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
         Graph graph = new SingleGraph("Tutorial 1");                                       
         graph.addNode("A");
         graph.addNode("B");
         graph.addNode("C");
         graph.addNode("D");
         graph.addEdge("AB", "A", "B");
         graph.addEdge("BC", "B", "C");
         graph.addEdge("CA", "C", "A");
         graph.addEdge("AD", "A", "D");
         graph.addEdge("BD", "B", "D");
//         graph.addAttribute("ui.stylesheet", "url('C:\Users\Vinicius\Desktop\Adriana java\GrafoDeErros\src\grafodeerros\GraphCSS.css')");
//         Node n = graph.getNode("A");
//         n.addAttribute("ui.style", "shape:circle;");
         graph.display();
      }
}    
