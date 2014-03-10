package com.example.util;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Vector;

import org.dom4j.Document;
import org.dom4j.Element;

import android.R;

import com.example.currencyconverter.Currency;
import com.example.reader.AndroidXmlReader;


/**
 * The Class CurrecnyParser.
 */
public class CurrecnyParser {

	/** The Constant TAG. */
	private final static String TAG = "CurrecnyParser";

	/** The Constant logger. */
	final static AndroidLogging logger = new AndroidLogging(TAG);

	/**
	 * Parses the.
	 *
	 * @param in the in
	 * @return the vector
	 */
	public Vector<Currency> parse(InputStream in) {
		logger.info("parse");
		Vector<Currency> list = new Vector<Currency>();
		Document dom = AndroidXmlReader.Read(in);
		 Element root = dom.getRootElement();
		for (Element item : (List<Element>) root.elements("Item"))
		  {
			list.add(new Currency(item.elementText("Country"), Double.valueOf(item.elementText("Rate")), item.elementText("Currency")));
		  }
		
		return list;
	}
}
