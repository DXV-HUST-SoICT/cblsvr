package localsearch.domainspecific.vehiclerouting.apps.minmaxvrp.experiments;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

class Result{
	double obj;
	double time_2_best;
	public Result(double obj, double time_2_best){
		this.obj = obj; this.time_2_best = time_2_best;
	}
	public Result(String fn){
		try{
			Scanner in = new Scanner(new File(fn));
			this.obj = in.nextDouble();
			this.time_2_best = in.nextDouble();
			in.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
public class ExperimentRunner {

	public static void runExperiments(){
		int nbRuns = 20;
		
		String[] fn = new String[]{
				"E-n101-k14.vrp",
				"E-n23-k3.vrp",
				"E-n33-k4.vrp",
				"E-n76-k14.vrp",
				"E-n76-k8.vrp",
				"E-n101-k8.vrp",
				"E-n30-k3.vrp",
				"E-n51-k5.vrp",
				"E-n76-k15.vrp",
				"E-n22-k4.vrp",
				"E-n30-k4.vrp",
				"E-n76-k10.vrp",
				"E-n76-k7.vrp",
			"E-n7-k2.vrp",
			"E-n13-k4.vrp",
			"E-n31-k7.vrp"
		};

		String in_dir = "data/MinMaxVRP/Christophides/std-all/";
		String out_dir = "output/MinMaxVRP/";
		int timeLimit = 300;
		
		try{
			//PrintWriter out = new PrintWriter(outFile);
			
			for(int r = 1; r <= nbRuns; r++){
				for(int i = 0; i < fn.length; i++){
					String fi = in_dir + "" + fn[i];
					
					String fo = out_dir + "MinMaxCVRPMultiNeighborhoodsWithTotalCost-ins-" + 
					fn[i] + "-run-" + r + ".txt";
					MinMaxCVRPMultiNeighborhoodsWithTotalCost.run(fi, fo, timeLimit);
					
					
					fo = out_dir + "MinMaxCVRPMultiNeighborhoods-ins-" + 
							fn[i] + "-run-" + r + ".txt";
					MinMaxCVRPMultiNeighborhoods.run(fi, fo, timeLimit);
					
					fo = out_dir + "MinMaxCVRP2Neighborhoods-ins-" + 
									fn[i] + "-run-" + r + ".txt";
					MinMaxCVRP2Neighborhoods.run(fi, fo, timeLimit);
					
					
					fo = out_dir + "MinMaxCVRP2NeighborhoodsWithTotalCost-ins-" + 
							fn[i] + "-run-" + r + ".txt";
					MinMaxCVRP2NeighborhoodsWithTotalCost.run(fi, fo, timeLimit);
			
				}
				
			}
			//out.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

	public static void runStatistics(String statisticFN){
		int nbRuns = 20;
		
		String[] fn = new String[]{
				"E-n101-k14.vrp",
				"E-n23-k3.vrp",
				"E-n33-k4.vrp",
				"E-n76-k14.vrp",
				"E-n76-k8.vrp",
				"E-n101-k8.vrp",
				"E-n30-k3.vrp",
				"E-n51-k5.vrp",
				"E-n76-k15.vrp",
				"E-n22-k4.vrp",
				"E-n30-k4.vrp",
				"E-n76-k10.vrp",
				"E-n76-k7.vrp",
			"E-n7-k2.vrp",
			"E-n13-k4.vrp",
			"E-n31-k7.vrp"
		};

		String in_dir = "data/MinMaxVRP/Christophides/std-all/";
		String out_dir = "output/MinMaxVRP/";
		int timeLimit = 300;
		
		try{
			PrintWriter out = new PrintWriter(statisticFN);
			
			String[] algo = new String[]{
					"MinMaxCVRPMultiNeighborhoodsWithTotalCost",
					"MinMaxCVRPMultiNeighborhoods",
					"MinMaxCVRP2Neighborhoods",
					"MinMaxCVRP2NeighborhoodsWithTotalCost",
			};
			for(int i = 0; i < fn.length; i++){
				
				out.print(fn[i] + "\t");
				for(int k = 0; k < algo.length; k++){
					double min_f = Integer.MAX_VALUE;
					double max_f = 1-min_f;
					double avg_f = 0;
					double avg_t = 0;
					
					for(int r = 1; r <= nbRuns; r++){
						String fo = out_dir + algo[k] + "-ins-" + 
								fn[i] + "-run-" + r + ".txt";
						Result rs = new Result(fo);
						if(min_f > rs.obj) min_f = rs.obj;
						if(max_f < rs.obj) max_f = rs.obj;
						avg_f += rs.obj;
						avg_t += rs.time_2_best;
			
					}
					
					avg_f = avg_f*1.0/nbRuns;
					avg_t = avg_t*1.0/nbRuns;
					
					out.print(min_f + "\t" + max_f + "\t" + avg_f + "\t" + avg_t + "\t");
					
				}
				out.println();
			}
			out.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExperimentRunner.runStatistics("output/MinMaxVRP");
	}

}
