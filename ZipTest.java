/**
 * <p>Description: </p>  
 *	@author liuxiuxue  
 * @date 2019年8月9日  
 */
package star.test;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author lenovo
 *
 */
public class ZipTest {
	public static void main(String[] args) {
		// 指定要压缩的文件夹（文件）
		String path = "D:\\upload\\primary\\chinese\\PEP\\1\\12an en in un ün";
		File sourceFile = new File(path);
		if (!sourceFile.exists())
			System.err.println("file is not exists");
		// 压缩后文件的位置名称
		File zipFile = new File("D:\\upload\\primary\\chinese\\PEP\\1\\"+ "aa.zip");
		try {
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile));
			packFile(sourceFile, out, sourceFile.getName());
			if (out != null)
				out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void  packFile(File sourceFile, ZipOutputStream out, String parentName) throws IOException{
		// 如果是文件，直接进行压缩
		if (sourceFile.isFile()){
			InputStream in = new BufferedInputStream(new FileInputStream(sourceFile));
			byte[] buf = new byte[1024];
			int len;
			out.putNextEntry(new ZipEntry(parentName));
			while ((len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
			out.closeEntry();
			in.close();
			
		}
		// 如果是文件夹 
		if (sourceFile.isDirectory()){
			File[] files = sourceFile.listFiles();
			// 压缩空的文件夹
			if (files != null && files.length == 0){
				out.putNextEntry(new ZipEntry(parentName + File.separator));
				out.closeEntry();
			}else{// 递归压缩
				for (File file : files) {
					// 压缩文件的名称层级关系
					packFile(file, out, parentName + File.separator +file.getName());
				}
			}
		}
	}
}
