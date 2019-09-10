package common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FileUtil {
	private String separator = java.io.File.separator;

	public FileUtil() {
	}

	public void makeForder(String folderPath) {
		File fileDir = new File(folderPath);

		if (!fileDir.exists()) {
			fileDir.mkdirs();
			JOptionPane.showMessageDialog(null, "Make forder " + folderPath + " Syccess!", "Alert", 0);

		} else {
			JOptionPane.showMessageDialog(null, "The folder " + folderPath + " has already existed!", "Alert", 0);
		}
	}

	public void delFolder(String folderPath) {
		try {
			delAllFile(folderPath);
			String filePath = folderPath;
			filePath = filePath.toString();
			File myFilePath = new File(filePath);
			myFilePath.delete();
			JOptionPane.showMessageDialog(null, "Delete forder " + folderPath + " Syccess!", "Alert", 0);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public ArrayList<String> getFileNamesInForder(String forderPath) {
		ArrayList<String> filePathList = new ArrayList<String>();

		File fileObj0 = new File(forderPath);
		String[] listDir = fileObj0.list();

		for (int i = 0; i < listDir.length; i++) {
			File fileObj1 = new File(forderPath + separator + listDir[i]);

			if (!fileObj1.isDirectory()) {
				String fileNameStr = fileObj1.getName();
				int dotSt = fileNameStr.indexOf(".");
				int dotEd = fileNameStr.lastIndexOf(".");
				if (dotSt == dotEd) {
					filePathList.add(fileNameStr);
				}
			}
		}
		return filePathList;
	}

	public ArrayList<String> read(String filePath) {
		ArrayList<String> dataList = new ArrayList<String>();

		try {
			File fl = new File(filePath);
			if (!fl.exists()) {
				fl.createNewFile();
			}

			FileReader fr = new FileReader(fl);
			BufferedReader br = new BufferedReader(fr);

			String currentLine;
			while ((currentLine = br.readLine()) != null) {
				dataList.add(currentLine);
			}

			br.close();
			fr.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return dataList;
	}

	public void write(String filePath, ArrayList<?> dataList) {
		try {
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);

			String s = "";

			for (int i = 0; i < dataList.size(); i++) {
				s = dataList.get(i).toString();
				bw.write(s);
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void delFile(String fullPath) {
		try {
			File file = new File(fullPath);
			if (file.delete()) {
				System.out.println(file.getName() + " 文件已被删除！");
			} else {
				System.out.println("文件删除失败！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delAllFile(String path) {
		File file = new File(path);

		if (!file.exists()) {
			return;
		}
		if (!file.isDirectory()) {
			return;
		}
		String[] tempList = file.list();
		File temp = null;

		for (int i = 0; i < tempList.length; i++) {
			if (path.endsWith(File.separator)) {
				temp = new File(path + tempList[i]);
			} else {
				temp = new File(path + File.separator + tempList[i]);
			}
			if (temp.isFile()) {
				temp.delete();
			}
			if (temp.isDirectory()) {
				delAllFile(path + separator + tempList[i]);
			}
		}
	}
	
	public void moveFile(String pathName, String fileName, String ansPath) {
		String startPath = pathName + File.separator + fileName;
		String endPath = ansPath + File.separator;

		try {
			File startFile = new File(startPath);
			File tmpFile = new File(endPath);

			if (!tmpFile.exists()) {
				tmpFile.mkdirs();
			}

			if (startFile.renameTo(new File(endPath + startFile.getName()))) {
				System.out.println("File is moved successful!");
			} else {
				System.out.println("File is failed to move!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void moveFile(String pathName, String ansPath) {
		ArrayList<String> fileNameList=new ArrayList<String>();
		
		fileNameList=this.getFileNamesInForder(pathName);
		
		for(int i=0;i<fileNameList.size();i++) {
			String fileName = fileNameList.get(i);
			
			String startPath = pathName + File.separator + fileName;
			String endPath = ansPath + File.separator;

			try {
				File startFile = new File(startPath);
				File tmpFile = new File(endPath);

				if (!tmpFile.exists()) {
					tmpFile.mkdirs();
				}

				if (startFile.renameTo(new File(endPath + startFile.getName()))) {
					System.out.println("File is moved successful!");
				} else {
					System.out.println("File is failed to move!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
	}
}
