package test;
import java.util.*;
import java.io.*;
@SuppressWarnings("serial")
public class Register implements Serializable 
{
	public String uName,fName,lName;
	public transient String pWord;
	public Date dateTime;
	public Register(String uName,String pWord,String fName,String lName,Date dateTime)
	{
		this.uName=uName;
		this.pWord=pWord;
		this.fName=fName;
		this.lName=lName;
		this.dateTime=dateTime;
	}
	public String toString()
	{
		return "Uname:"+uName+"\n PWord:"+"\n"+"\nFName:"+fName+"\nLName:"+"\nDate&Time"+dateTime;
	}
}
