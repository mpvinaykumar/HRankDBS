import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LargeResponse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\eclipseWS\\DBS\\src\\bytes_test.txt"));

			String line =null;
			String bytesRcvd =null;
			int count=0;
			long totalBytes=0;
			while( (line=br.readLine()) !=null) {
				bytesRcvd=line.substring(line.lastIndexOf(" ")+1);
				if(Integer.parseInt(bytesRcvd)>5000) {
					count++;
					totalBytes+=Integer.parseInt(bytesRcvd);
				}
			}
			bw.write(""+count);
			bw.newLine();
			bw.write(""+totalBytes);
			//System.out.println(count+":"+totalBytes);
			br.close();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
D:/eclipseWS/DBS/src/test.txt

 
 */