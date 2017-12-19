import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.evaluation.NominalPrediction;
import weka.classifiers.meta.FilteredClassifier;
import weka.classifiers.rules.DecisionTable;
import weka.classifiers.rules.PART;
import weka.classifiers.trees.DecisionStump;
import weka.classifiers.trees.J48;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;
import weka.filters.unsupervised.attribute.Remove;


public class MLHelper {

		public static PrintWriter printWriter;
		public static PrintWriter second;

	public MLHelper() throws UnsupportedEncodingException, FileNotFoundException{
		printWriter = new PrintWriter("MLData.arff", "UTF-8");
		printWriter.println("@relation tictactoe\n");
		printWriter.println("@attribute space1 {-, X, O, T}");
		printWriter.println("@attribute space2 {-, X, O, T}");
		printWriter.println("@attribute space3 {-, X, O, T}");
		printWriter.println("@attribute space4 {-, X, O, T}");
		printWriter.println("@attribute space5 {-, X, O, T}");
		printWriter.println("@attribute space6 {-, X, O, T}");
		printWriter.println("@attribute space7 {-, X, O, T}");
		printWriter.println("@attribute space8 {-, X, O, T}");
		printWriter.println("@attribute space9 {-, X, O, T}");
		printWriter.println("@attribute space10 {-, X, O, T}");
		printWriter.println("@attribute space11 {-, X, O, T}");
		printWriter.println("@attribute space12 {-, X, O, T}");
		printWriter.println("@attribute space13 {-, X, O, T}");
		printWriter.println("@attribute space14 {-, X, O, T}");
		printWriter.println("@attribute space15 {-, X, O, T}");
		printWriter.println("@attribute space16 {-, X, O, T}");
		printWriter.println("@attribute space17 {-, X, O, T}");
		printWriter.println("@attribute space18 {-, X, O, T}");
		printWriter.println("@attribute space19 {-, X, O, T}");
		printWriter.println("@attribute space20 {-, X, O, T}");
		printWriter.println("@attribute space21 {-, X, O, T}");
		printWriter.println("@attribute space22 {-, X, O, T}");
		printWriter.println("@attribute space23 {-, X, O, T}");
		printWriter.println("@attribute space24 {-, X, O, T}");
		printWriter.println("@attribute space25 {-, X, O, T}");
		printWriter.println("@attribute space26 {-, X, O, T}");
		printWriter.println("@attribute space27 {-, X, O, T}");
		printWriter.println("@attribute space28 {-, X, O, T}");
		printWriter.println("@attribute space29 {-, X, O, T}");
		printWriter.println("@attribute space30 {-, X, O, T}");
		printWriter.println("@attribute space31 {-, X, O, T}");
		printWriter.println("@attribute space32 {-, X, O, T}");
		printWriter.println("@attribute space33 {-, X, O, T}");
		printWriter.println("@attribute space34 {-, X, O, T}");
		printWriter.println("@attribute space35 {-, X, O, T}");
		printWriter.println("@attribute space36 {-, X, O, T}");
		printWriter.println("@attribute space37 {-, X, O, T}");
		printWriter.println("@attribute space38 {-, X, O, T}");
		printWriter.println("@attribute space39 {-, X, O, T}");
		printWriter.println("@attribute space40 {-, X, O, T}");
		printWriter.println("@attribute space41 {-, X, O, T}");
		printWriter.println("@attribute space42 {-, X, O, T}");
		printWriter.println("@attribute space43 {-, X, O, T}");
		printWriter.println("@attribute space44 {-, X, O, T}");
		printWriter.println("@attribute space45 {-, X, O, T}");
		printWriter.println("@attribute space46 {-, X, O, T}");
		printWriter.println("@attribute space47 {-, X, O, T}");
		printWriter.println("@attribute space48 {-, X, O, T}");
		printWriter.println("@attribute space49 {-, X, O, T}");
		printWriter.println("@attribute space50 {-, X, O, T}");
		printWriter.println("@attribute space51 {-, X, O, T}");
		printWriter.println("@attribute space52 {-, X, O, T}");
		printWriter.println("@attribute space53 {-, X, O, T}");
		printWriter.println("@attribute space54 {-, X, O, T}");
		printWriter.println("@attribute space55 {-, X, O, T}");
		printWriter.println("@attribute space56 {-, X, O, T}");
		printWriter.println("@attribute space57 {-, X, O, T}");
		printWriter.println("@attribute space58 {-, X, O, T}");
		printWriter.println("@attribute space59 {-, X, O, T}");
		printWriter.println("@attribute space60 {-, X, O, T}");
		printWriter.println("@attribute space61 {-, X, O, T}");
		printWriter.println("@attribute space62 {-, X, O, T}");
		printWriter.println("@attribute space63 {-, X, O, T}");
		printWriter.println("@attribute space64 {-, X, O, T}");
		printWriter.println("@attribute space65 {-, X, O, T}");
		printWriter.println("@attribute space66 {-, X, O, T}");
		printWriter.println("@attribute space67 {-, X, O, T}");
		printWriter.println("@attribute space68 {-, X, O, T}");
		printWriter.println("@attribute space69 {-, X, O, T}");
		printWriter.println("@attribute space70 {-, X, O, T}");
		printWriter.println("@attribute space71 {-, X, O, T}");
		printWriter.println("@attribute space72 {-, X, O, T}");
		printWriter.println("@attribute space73 {-, X, O, T}");
		printWriter.println("@attribute space74 {-, X, O, T}");
		printWriter.println("@attribute space75 {-, X, O, T}");
		printWriter.println("@attribute space76 {-, X, O, T}");
		printWriter.println("@attribute space77 {-, X, O, T}");
		printWriter.println("@attribute space78 {-, X, O, T}");
		printWriter.println("@attribute space79 {-, X, O, T}");
		printWriter.println("@attribute space80 {-, X, O, T}");
		printWriter.println("@attribute space81 {-, X, O, T}");
		printWriter.println("@attribute nextSpace {1, 2, 3, 4, 5, 6, 7, 8, 9}\n");
		printWriter.println("@data");
		printWriter.flush();
	}
	public static void write(int space) {
		printWriter.print(Init.board1.board[1]+","+Init.board1.board[2]+","+Init.board1.board[3]+","+Init.board1.board[4]+","+Init.board1.board[5]+","+Init.board1.board[6]+","+Init.board1.board[7]+","+Init.board1.board[8]+","+Init.board1.board[9]+",");
		printWriter.print(Init.board2.board[1]+","+Init.board2.board[2]+","+Init.board2.board[3]+","+Init.board2.board[4]+","+Init.board2.board[5]+","+Init.board2.board[6]+","+Init.board2.board[7]+","+Init.board2.board[8]+","+Init.board2.board[9]+",");
		printWriter.print(Init.board3.board[1]+","+Init.board3.board[2]+","+Init.board3.board[3]+","+Init.board3.board[4]+","+Init.board3.board[5]+","+Init.board3.board[6]+","+Init.board3.board[7]+","+Init.board3.board[8]+","+Init.board3.board[9]+",");
		printWriter.print(Init.board4.board[1]+","+Init.board4.board[2]+","+Init.board4.board[3]+","+Init.board4.board[4]+","+Init.board4.board[5]+","+Init.board4.board[6]+","+Init.board4.board[7]+","+Init.board3.board[8]+","+Init.board4.board[9]+",");
		printWriter.print(Init.board5.board[1]+","+Init.board5.board[2]+","+Init.board5.board[3]+","+Init.board5.board[4]+","+Init.board5.board[5]+","+Init.board5.board[6]+","+Init.board5.board[7]+","+Init.board5.board[8]+","+Init.board5.board[9]+",");
		printWriter.print(Init.board6.board[1]+","+Init.board6.board[2]+","+Init.board6.board[3]+","+Init.board6.board[4]+","+Init.board6.board[5]+","+Init.board6.board[6]+","+Init.board6.board[7]+","+Init.board6.board[8]+","+Init.board6.board[9]+",");
		printWriter.print(Init.board7.board[1]+","+Init.board7.board[2]+","+Init.board7.board[3]+","+Init.board7.board[4]+","+Init.board7.board[5]+","+Init.board7.board[6]+","+Init.board7.board[7]+","+Init.board7.board[8]+","+Init.board7.board[9]+",");
		printWriter.print(Init.board8.board[1]+","+Init.board8.board[2]+","+Init.board8.board[3]+","+Init.board8.board[4]+","+Init.board8.board[5]+","+Init.board8.board[6]+","+Init.board8.board[7]+","+Init.board8.board[8]+","+Init.board8.board[9]+",");
		printWriter.println(Init.board9.board[1]+","+Init.board9.board[2]+","+Init.board9.board[3]+","+Init.board9.board[4]+","+Init.board9.board[5]+","+Init.board9.board[6]+","+Init.board9.board[7]+","+Init.board9.board[8]+","+Init.board9.board[9]+","+space);
		printWriter.flush();
	}
	public static void writeLastMove() throws FileNotFoundException, UnsupportedEncodingException {
		second = new PrintWriter("LastMove.arff", "UTF-8");
		second.println("@relation tictactoe\n");
		second.println("@attribute space1 {-, X, O, T}");
		second.println("@attribute space2 {-, X, O, T}");
		second.println("@attribute space3 {-, X, O, T}");
		second.println("@attribute space4 {-, X, O, T}");
		second.println("@attribute space5 {-, X, O, T}");
		second.println("@attribute space6 {-, X, O, T}");
		second.println("@attribute space7 {-, X, O, T}");
		second.println("@attribute space8 {-, X, O, T}");
		second.println("@attribute space9 {-, X, O, T}");
		second.println("@attribute space10 {-, X, O, T}");
		second.println("@attribute space11 {-, X, O, T}");
		second.println("@attribute space12 {-, X, O, T}");
		second.println("@attribute space13 {-, X, O, T}");
		second.println("@attribute space14 {-, X, O, T}");
		second.println("@attribute space15 {-, X, O, T}");
		second.println("@attribute space16 {-, X, O, T}");
		second.println("@attribute space17 {-, X, O, T}");
		second.println("@attribute space18 {-, X, O, T}");
		second.println("@attribute space19 {-, X, O, T}");
		second.println("@attribute space20 {-, X, O, T}");
		second.println("@attribute space21 {-, X, O, T}");
		second.println("@attribute space22 {-, X, O, T}");
		second.println("@attribute space23 {-, X, O, T}");
		second.println("@attribute space24 {-, X, O, T}");
		second.println("@attribute space25 {-, X, O, T}");
		second.println("@attribute space26 {-, X, O, T}");
		second.println("@attribute space27 {-, X, O, T}");
		second.println("@attribute space28 {-, X, O, T}");
		second.println("@attribute space29 {-, X, O, T}");
		second.println("@attribute space30 {-, X, O, T}");
		second.println("@attribute space31 {-, X, O, T}");
		second.println("@attribute space32 {-, X, O, T}");
		second.println("@attribute space33 {-, X, O, T}");
		second.println("@attribute space34 {-, X, O, T}");
		second.println("@attribute space35 {-, X, O, T}");
		second.println("@attribute space36 {-, X, O, T}");
		second.println("@attribute space37 {-, X, O, T}");
		second.println("@attribute space38 {-, X, O, T}");
		second.println("@attribute space39 {-, X, O, T}");
		second.println("@attribute space40 {-, X, O, T}");
		second.println("@attribute space41 {-, X, O, T}");
		second.println("@attribute space42 {-, X, O, T}");
		second.println("@attribute space43 {-, X, O, T}");
		second.println("@attribute space44 {-, X, O, T}");
		second.println("@attribute space45 {-, X, O, T}");
		second.println("@attribute space46 {-, X, O, T}");
		second.println("@attribute space47 {-, X, O, T}");
		second.println("@attribute space48 {-, X, O, T}");
		second.println("@attribute space49 {-, X, O, T}");
		second.println("@attribute space50 {-, X, O, T}");
		second.println("@attribute space51 {-, X, O, T}");
		second.println("@attribute space52 {-, X, O, T}");
		second.println("@attribute space53 {-, X, O, T}");
		second.println("@attribute space54 {-, X, O, T}");
		second.println("@attribute space55 {-, X, O, T}");
		second.println("@attribute space56 {-, X, O, T}");
		second.println("@attribute space57 {-, X, O, T}");
		second.println("@attribute space58 {-, X, O, T}");
		second.println("@attribute space59 {-, X, O, T}");
		second.println("@attribute space60 {-, X, O, T}");
		second.println("@attribute space61 {-, X, O, T}");
		second.println("@attribute space62 {-, X, O, T}");
		second.println("@attribute space63 {-, X, O, T}");
		second.println("@attribute space64 {-, X, O, T}");
		second.println("@attribute space65 {-, X, O, T}");
		second.println("@attribute space66 {-, X, O, T}");
		second.println("@attribute space67 {-, X, O, T}");
		second.println("@attribute space68 {-, X, O, T}");
		second.println("@attribute space69 {-, X, O, T}");
		second.println("@attribute space70 {-, X, O, T}");
		second.println("@attribute space71 {-, X, O, T}");
		second.println("@attribute space72 {-, X, O, T}");
		second.println("@attribute space73 {-, X, O, T}");
		second.println("@attribute space74 {-, X, O, T}");
		second.println("@attribute space75 {-, X, O, T}");
		second.println("@attribute space76 {-, X, O, T}");
		second.println("@attribute space77 {-, X, O, T}");
		second.println("@attribute space78 {-, X, O, T}");
		second.println("@attribute space79 {-, X, O, T}");
		second.println("@attribute space80 {-, X, O, T}");
		second.println("@attribute space81 {-, X, O, T}");
		second.println("@attribute nextSpace {1, 2, 3, 4, 5, 6, 7, 8, 9}\n");
		second.println("@data");
		second.print(Init.board1.board[1]+","+Init.board1.board[2]+","+Init.board1.board[3]+","+Init.board1.board[4]+","+Init.board1.board[5]+","+Init.board1.board[6]+","+Init.board1.board[7]+","+Init.board1.board[8]+","+Init.board1.board[9]+",");
		second.print(Init.board2.board[1]+","+Init.board2.board[2]+","+Init.board2.board[3]+","+Init.board2.board[4]+","+Init.board2.board[5]+","+Init.board2.board[6]+","+Init.board2.board[7]+","+Init.board2.board[8]+","+Init.board2.board[9]+",");
		second.print(Init.board3.board[1]+","+Init.board3.board[2]+","+Init.board3.board[3]+","+Init.board3.board[4]+","+Init.board3.board[5]+","+Init.board3.board[6]+","+Init.board3.board[7]+","+Init.board3.board[8]+","+Init.board3.board[9]+",");
		second.print(Init.board4.board[1]+","+Init.board4.board[2]+","+Init.board4.board[3]+","+Init.board4.board[4]+","+Init.board4.board[5]+","+Init.board4.board[6]+","+Init.board4.board[7]+","+Init.board3.board[8]+","+Init.board4.board[9]+",");
		second.print(Init.board5.board[1]+","+Init.board5.board[2]+","+Init.board5.board[3]+","+Init.board5.board[4]+","+Init.board5.board[5]+","+Init.board5.board[6]+","+Init.board5.board[7]+","+Init.board5.board[8]+","+Init.board5.board[9]+",");
		second.print(Init.board6.board[1]+","+Init.board6.board[2]+","+Init.board6.board[3]+","+Init.board6.board[4]+","+Init.board6.board[5]+","+Init.board6.board[6]+","+Init.board6.board[7]+","+Init.board6.board[8]+","+Init.board6.board[9]+",");
		second.print(Init.board7.board[1]+","+Init.board7.board[2]+","+Init.board7.board[3]+","+Init.board7.board[4]+","+Init.board7.board[5]+","+Init.board7.board[6]+","+Init.board7.board[7]+","+Init.board7.board[8]+","+Init.board7.board[9]+",");
		second.print(Init.board8.board[1]+","+Init.board8.board[2]+","+Init.board8.board[3]+","+Init.board8.board[4]+","+Init.board8.board[5]+","+Init.board8.board[6]+","+Init.board8.board[7]+","+Init.board8.board[8]+","+Init.board8.board[9]+",");
		second.println(Init.board9.board[1]+","+Init.board9.board[2]+","+Init.board9.board[3]+","+Init.board9.board[4]+","+Init.board9.board[5]+","+Init.board9.board[6]+","+Init.board9.board[7]+","+Init.board9.board[8]+","+Init.board9.board[9]+",?");
		second.flush();
	}
	public static BufferedReader readDataFile(String filename) {
		BufferedReader inputReader = null;
 
		try {
			inputReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException ex) {
			System.err.println("File not found: " + filename);
		}
 
		return inputReader;
	}
 
	public static Evaluation classify(Classifier model,
			Instances trainingSet, Instances testingSet) throws Exception {
		Evaluation evaluation = new Evaluation(trainingSet);
 
		model.buildClassifier(trainingSet);
		evaluation.evaluateModel(model, testingSet);
 
		return evaluation;
	}
 
	public static double calculateAccuracy(FastVector predictions) {
		double correct = 0;
 
		for (int i = 0; i < predictions.size(); i++) {
			NominalPrediction np = (NominalPrediction) predictions.elementAt(i);
			if (np.predicted() == np.actual()) {
				correct++;
			}
		}
 
		return 100 * correct / predictions.size();
	}
 
	public static Instances[][] crossValidationSplit(Instances data, int numberOfFolds) {
		Instances[][] split = new Instances[2][numberOfFolds];
 
		for (int i = 0; i < numberOfFolds; i++) {
			split[0][i] = data.trainCV(numberOfFolds, i);
			split[1][i] = data.testCV(numberOfFolds, i);
		}
 
		return split;
	}
 
	public static void performML() throws Exception {
		BufferedReader datafile = readDataFile("MLData.arff");
 
		Instances data = new Instances(datafile);
		data.setClassIndex(data.numAttributes() - 1);
 
		Instances[][] split = crossValidationSplit(data, 10);
 
		Instances[] trainingSplits = split[0];
		Instances[] testingSplits = split[1];
 
		Classifier[] models = {new J48(), new PART(),new DecisionTable(),new DecisionStump()};
 
		// Run for each model
		for (int j = 0; j < models.length; j++) {
 
			// Collect every group of predictions for current model in a FastVector
			FastVector predictions = new FastVector();
			
 
			// For each training-testing split pair, train and test the classifier
			for (int i = 0; i < trainingSplits.length; i++) {
				Evaluation validation = classify(models[j], trainingSplits[i], testingSplits[i]);
 
				predictions.appendElements(validation.predictions());
				FilteredClassifier fc = new FilteredClassifier();
				fc.setFilter(new Remove());
				fc.setClassifier(new J48());
				fc.buildClassifier(trainingSplits[i]);
				double pred = fc.classifyInstance(testingSplits[j].instance(j));
				System.out.println("Test OUTPUT: "+testingSplits[j].classAttribute().value((int) pred));
 
				// Uncomment to see the summary for each training-testing pair.
				//System.out.println(models[j].toString());
			}
 
			// Calculate overall accuracy of current classifier on all splits
			double accuracy = calculateAccuracy(predictions);
 
			System.out.println("Accuracy of " + models[j].getClass().getSimpleName() + ": "
					+ String.format("%.2f%%", accuracy)
					+ "\n---------------------------------");
		}
		
 
	}
	public static int play() throws Exception{
		ConverterUtils.DataSource source1 = new ConverterUtils.DataSource("MLData.arff");
		Instances train = source1.getDataSet();
		
		if(train.classIndex()==-1) {
			train.setClassIndex(train.numAttributes() -1);
		}
		
		ConverterUtils.DataSource source2 = new ConverterUtils.DataSource("LastMove.arff");
		Instances test = source2.getDataSet();
		
		if(test.classIndex()==-1) {
			test.setClassIndex(train.numAttributes()-1);
		}
		
		NaiveBayes naiveBayes = new NaiveBayes();
		naiveBayes.buildClassifier(train);
		
		double label = naiveBayes.classifyInstance(test.instance(0));
		test.instance(0).setClassValue(label);
		
		return Integer.parseInt(test.instance(0).stringValue(81));
	}
}
