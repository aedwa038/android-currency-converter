package com.example.reader;

import java.io.File;
import java.io.InputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import com.example.util.AndroidLogging;



/**
 * The Class AndroidXmlREader.
 */
public class AndroidXmlReader
{

	
	 /** The reader. */
 	private static SAXReader reader = null;
	 
 	/** The Constant TAG. */
 	private final static String TAG = "AndroidXmlReader";
	 
 	/** The Constant logger. */
 	final static AndroidLogging logger = new AndroidLogging(TAG);
	 /**
 	 * Read.
 	 *
 	 * @param xmlFile the xml file
 	 * @return the document
 	 */
 	public static Document Read(String xmlFile)
	 {
		  logger.info("Read");
		  
		  Document dom = null;
		  if (xmlFile != null)
		  {
			  

			  File fXmlFile = new File(xmlFile);
			   logger.info("Read(" + xmlFile.toString() + ")");

			   if (reader == null)
			   {
					reader = new SAXReader();
			   }

			   try
			   {
					dom = reader.read(fXmlFile);
			   } catch (DocumentException e)
			   {
					dom = null;
					logger.logException(e);
			   }
		  }
		  return dom;
	 }
 	
 	/**
	  * Read.
	  *
	  * @param xmlFile the xml file
	  * @return the document
	  */
	 public static Document Read(InputStream xmlFile)
	 {
		  logger.info("Read");
		  
		  Document dom = null;
		  if (xmlFile != null)
		  {
			  

			  
			   logger.info("Read(" + xmlFile.toString() + ")");

			   if (reader == null)
			   {
					reader = new SAXReader();
			   }

			   try
			   {
					dom = reader.read(xmlFile);
			   } catch (DocumentException e)
			   {
					dom = null;
					logger.logException(e);
			   }
		  }
		  return dom;
	 }
}
