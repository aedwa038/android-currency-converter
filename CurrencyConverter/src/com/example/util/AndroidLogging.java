package com.example.util;

import android.util.Log;


/**
 * The Class JenkinsLogging.
 */
public class AndroidLogging
{
	 
 	

	 /** The tag. */
 	private String TAG;

	 /**
 	 * Instantiates a new jenkins logging.
 	 *
 	 * @param tag the tag
 	 */
 	public AndroidLogging(String tag)
	 {
		  TAG = tag;
	 }

	 /**
 	 * Info.
 	 *
 	 * @param line the line
 	 */
 	public void info(String line)
	 {
		  Log.i(TAG, line);
	 }

	 /**
 	 * Warn.
 	 *
 	 * @param line the line
 	 */
 	public void warn(String line)
	 {
		  Log.w(TAG, line);
	 }

	 /**
 	 * Debug.
 	 *
 	 * @param line the line
 	 */
 	public void debug(String line)
	 {
		  Log.d(TAG,line);
	 }
	 
	 /**
 	 * Log exception.
 	 *
 	 * @param e the e
 	 */
 	public void logException (Exception e)
	 {
		  Log.e(TAG , e.getMessage()); 
	 }

	public void info(int size) {
		Log.i(TAG, String.valueOf(size));
		
	}

}
