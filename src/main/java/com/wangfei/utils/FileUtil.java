package com.wangfei.utils;

import java.io.File;

public class FileUtil {

	/**
	 * 
	 * @Title: getExtendName
	 * @Description: 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	 * @param fileName
	 * @return
	 * @return: String
	 */
	// String str="aaa.jpg"
	public static String getExtendName(String fileName) {
		if (null != fileName && fileName.length() > 0)
			return fileName.substring(fileName.lastIndexOf("."));
		return "不是有效的文件";
	}

	/**
	 * 
	 * @Title: getTempDirectory
	 * @Description: 方法2：返回操作系统临时目录(5分)
	 * @return
	 * @return: File
	 */
	public static File getTempDirectory() {

		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}

	/**
	 * 
	 * @Title: getUserDirectory
	 * @Description: 方法3：返回操作系统用户目录(5分)
	 *               例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}>
	 * @return
	 * @return: File
	 */
	public static File getUserDirectory() {
		String path = System.getProperty("user.home");
		return new File(path);
	}

}
