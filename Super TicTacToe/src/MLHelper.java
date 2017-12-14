import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.evaluation.NominalPrediction;
import weka.classifiers.rules.DecisionTable;
import weka.classifiers.rules.PART;
import weka.classifiers.trees.DecisionStump;
import weka.classifiers.trees.J48;
import weka.core.FastVector;
import weka.core.Instances;


public class MLHelper {

		public static PrintWriter printWriter;

	public MLHelper() throws UnsupportedEncodingException, FileNotFoundException{
		printWriter = new PrintWriter("MLData.arff", "UTF-8");
		printWriter.println("@relation tictactoe\n");
		printWriter.println("@attribute space1 STRING");
		printWriter.println("@attribute space2 STRING");
		printWriter.println("@attribute space3 STRING");
		printWriter.println("@attribute space4 STRING");
		printWriter.println("@attribute space5 STRING");
		printWriter.println("@attribute space6 STRING");
		printWriter.println("@attribute space7 STRING");
		printWriter.println("@attribute space8 STRING");
		printWriter.println("@attribute space9 STRING");
		printWriter.println("@attribute space10 STRING");
		printWriter.println("@attribute space11 STRING");
		printWriter.println("@attribute space12 STRING");
		printWriter.println("@attribute space13 STRING");
		printWriter.println("@attribute space14 STRING");
		printWriter.println("@attribute space15 STRING");
		printWriter.println("@attribute space16 STRING");
		printWriter.println("@attribute space17 STRING");
		printWriter.println("@attribute space18 STRING");
		printWriter.println("@attribute space19 STRING");
		printWriter.println("@attribute space20 STRING");
		printWriter.println("@attribute space21 STRING");
		printWriter.println("@attribute space22 STRING");
		printWriter.println("@attribute space23 STRING");
		printWriter.println("@attribute space24 STRING");
		printWriter.println("@attribute space25 STRING");
		printWriter.println("@attribute space26 STRING");
		printWriter.println("@attribute space27 STRING");
		printWriter.println("@attribute space28 STRING");
		printWriter.println("@attribute space29 STRING");
		printWriter.println("@attribute space30 STRING");
		printWriter.println("@attribute space31 STRING");
		printWriter.println("@attribute space32 STRING");
		printWriter.println("@attribute space33 STRING");
		printWriter.println("@attribute space34 STRING");
		printWriter.println("@attribute space35 STRING");
		printWriter.println("@attribute space36 STRING");
		printWriter.println("@attribute space37 STRING");
		printWriter.println("@attribute space38 STRING");
		printWriter.println("@attribute space39 STRING");
		printWriter.println("@attribute space40 STRING");
		printWriter.println("@attribute space41 STRING");
		printWriter.println("@attribute space42 STRING");
		printWriter.println("@attribute space43 STRING");
		printWriter.println("@attribute space44 STRING");
		printWriter.println("@attribute space45 STRING");
		printWriter.println("@attribute space46 STRING");
		printWriter.println("@attribute space47 STRING");
		printWriter.println("@attribute space48 STRING");
		printWriter.println("@attribute space49 STRING");
		printWriter.println("@attribute space50 STRING");
		printWriter.println("@attribute space51 STRING");
		printWriter.println("@attribute space52 STRING");
		printWriter.println("@attribute space53 STRING");
		printWriter.println("@attribute space54 STRING");
		printWriter.println("@attribute space55 STRING");
		printWriter.println("@attribute space56 STRING");
		printWriter.println("@attribute space57 STRING");
		printWriter.println("@attribute space58 STRING");
		printWriter.println("@attribute space59 STRING");
		printWriter.println("@attribute space60 STRING");
		printWriter.println("@attribute space61 STRING");
		printWriter.println("@attribute space62 STRING");
		printWriter.println("@attribute space63 STRING");
		printWriter.println("@attribute space64 STRING");
		printWriter.println("@attribute space65 STRING");
		printWriter.println("@attribute space66 STRING");
		printWriter.println("@attribute space67 STRING");
		printWriter.println("@attribute space68 STRING");
		printWriter.println("@attribute space69 STRING");
		printWriter.println("@attribute space70 STRING");
		printWriter.println("@attribute space71 STRING");
		printWriter.println("@attribute space72 STRING");
		printWriter.println("@attribute space73 STRING");
		printWriter.println("@attribute space74 STRING");
		printWriter.println("@attribute space75 STRING");
		printWriter.println("@attribute space76 STRING");
		printWriter.println("@attribute space77 STRING");
		printWriter.println("@attribute space78 STRING");
		printWriter.println("@attribute space79 STRING");
		printWriter.println("@attribute space80 STRING");
		printWriter.println("@attribute space81 STRING");
		printWriter.println("@attribute success STRING\n");
		printWriter.println("@data");
		printWriter.flush();
	}
	public static void write() {
		printWriter.print(Init.board1.board[1]+","+Init.board1.board[2]+","+Init.board1.board[3]+","+Init.board1.board[4]+","+Init.board1.board[5]+","+Init.board1.board[6]+","+Init.board1.board[7]+","+Init.board1.board[8]+","+Init.board1.board[9]+",");
		printWriter.flush();
		printWriter.print(Init.board2.board[1]+","+Init.board2.board[2]+","+Init.board2.board[3]+","+Init.board2.board[4]+","+Init.board2.board[5]+","+Init.board2.board[6]+","+Init.board2.board[7]+","+Init.board2.board[8]+","+Init.board2.board[9]+",");
		printWriter.flush();
		printWriter.print(Init.board3.board[1]+","+Init.board3.board[2]+","+Init.board3.board[3]+","+Init.board3.board[4]+","+Init.board3.board[5]+","+Init.board3.board[6]+","+Init.board3.board[7]+","+Init.board3.board[8]+","+Init.board3.board[9]+",");
		printWriter.flush();
		printWriter.print(Init.board4.board[1]+","+Init.board4.board[2]+","+Init.board4.board[3]+","+Init.board4.board[4]+","+Init.board4.board[5]+","+Init.board4.board[6]+","+Init.board4.board[7]+","+Init.board3.board[8]+","+Init.board4.board[9]+",");
		printWriter.flush();
		printWriter.print(Init.board5.board[1]+","+Init.board5.board[2]+","+Init.board5.board[3]+","+Init.board5.board[4]+","+Init.board5.board[5]+","+Init.board5.board[6]+","+Init.board5.board[7]+","+Init.board5.board[8]+","+Init.board5.board[9]+",");
		printWriter.flush();
		printWriter.print(Init.board6.board[1]+","+Init.board6.board[2]+","+Init.board6.board[3]+","+Init.board6.board[4]+","+Init.board6.board[5]+","+Init.board6.board[6]+","+Init.board6.board[7]+","+Init.board6.board[8]+","+Init.board6.board[9]+",");
		printWriter.flush();
		printWriter.print(Init.board7.board[1]+","+Init.board7.board[2]+","+Init.board7.board[3]+","+Init.board7.board[4]+","+Init.board7.board[5]+","+Init.board7.board[6]+","+Init.board7.board[7]+","+Init.board7.board[8]+","+Init.board7.board[9]+",");
		printWriter.flush();
		printWriter.print(Init.board8.board[1]+","+Init.board8.board[2]+","+Init.board8.board[3]+","+Init.board8.board[4]+","+Init.board8.board[5]+","+Init.board8.board[6]+","+Init.board8.board[7]+","+Init.board8.board[8]+","+Init.board8.board[9]+",");
		printWriter.flush();
		printWriter.println(Init.board9.board[1]+","+Init.board9.board[2]+","+Init.board9.board[3]+","+Init.board9.board[4]+","+Init.board9.board[5]+","+Init.board9.board[6]+","+Init.board9.board[7]+","+Init.board9.board[8]+","+Init.board9.board[9]+",TRUE");
		printWriter.flush();
	}
	public static void performML() throws Exception {
		printWriter.close();
		BufferedReader dataFile = readDataFile("MLData1.txt");
		
		Instances data = new Instances(dataFile);
		data.setClassIndex(data.numAttributes() - 1);
		
		Instances[][] split = crossValidationSplit(data, 10);
		
		Instances[] trainingSplits = split[0];
		Instances[] testingSplits = split[1];
		
		Classifier[] models = { new J48(), new PART(), new DecisionTable(), new DecisionStump()};
		double accuracy = 0.0;
		for(int i = 0; i < models.length; i++) {
			FastVector predictions = new FastVector();
			
			for(int j = 0; j < trainingSplits.length; i++) {
				Evaluation validation = classify(models[j], trainingSplits[i], testingSplits[i]);
				
				predictions.appendElements(validation.predictions());
			}
			accuracy = calculateAccuracy(predictions);
			
			System.out.println("ML Accuracy: "+String.format("%.2f%%",  accuracy));
		}
		System.out.println("ML Accuracy: "+String.format("%.2f%%",  accuracy));
	}
	public static BufferedReader readDataFile(String fileName) {
		BufferedReader inputReader = null;
		try {
			inputReader = new BufferedReader(new FileReader(fileName));
		} catch(FileNotFoundException e) {
			System.out.println("ML FIle Not Found");
			e.printStackTrace();
		}
		return inputReader;
	}
	public static Evaluation classify(Classifier model, Instances trainingSet, Instances testingSet) throws Exception {
		Evaluation evaluation = new Evaluation(trainingSet);
		model.buildClassifier(trainingSet);
		evaluation.evaluateModel(model, testingSet);
		return evaluation;
	}
	public static double calculateAccuracy(FastVector predictions) {
		double correct = 0;
		for(int i = 0; i<predictions.size(); i++) {
			NominalPrediction np = (NominalPrediction) predictions.elementAt(i);
			if(np.predicted()==np.actual()) {
				correct++;
			}
		}
		return 100*correct/predictions.size();
	}
	public static Instances[][] crossValidationSplit(Instances data, int numberOfFolds){
		Instances[][] split = new Instances[2][numberOfFolds];
		for(int i = 0; i< numberOfFolds; i++) {
			split[0][i] = data.trainCV(numberOfFolds, i);
			split[1][i] = data.testCV(numberOfFolds, i);
		}
		return split;
	}
}
