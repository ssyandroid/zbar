package com.zbar.lib;

/**
 * zbar调用类
 * @author SU
 *
 */
public class ZbarManager {

	static {
		System.loadLibrary("zbar");
	}

	public native String decode(byte[] data, int width, int height, boolean isCrop, int x, int y, int cwidth, int cheight);
}
