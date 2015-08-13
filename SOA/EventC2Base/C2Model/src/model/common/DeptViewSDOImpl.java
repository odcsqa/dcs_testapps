package model.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class DeptViewSDOImpl extends SDODataObject implements DeptViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 2;

   public DeptViewSDOImpl() {}

   public java.lang.Integer getDeptno() {
      return new Integer(getInt(START_PROPERTY_INDEX + 0));
   }

   public void setDeptno(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getDname() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setDname(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getLoc() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setLoc(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }


}

