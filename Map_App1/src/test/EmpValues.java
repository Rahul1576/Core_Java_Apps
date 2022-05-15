package test;
public class EmpValues {
      public String eName,eDesg;
      public int bSal;
      public EmpValues(String eName,String eDesg,int bSal)
      {
    	  this.eName=eName;
    	  this.eDesg=eDesg;
    	  this.bSal=bSal;
      }
      public String toString()
      {
    	  return eName+"\t"+eDesg+"\t"+bSal;
      }
}
