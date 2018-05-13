/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

    class enc{
        private int ssn;
        private String empName;
        private int empAge;
        public int getEmpSSN()
        {
            return ssn;
        }
        public String getEmpName()
        {
            return empName;
        }
        public int getEmpAge()
        {
            return empAge;
        }
        public void setEmpAge(int newValue)
        {
            empAge = newValue;
        }
         public void setEmpname(String newValue)
        {
            empName = newValue;
        }
          public void setEmpSSN(int newValue)
        {
            ssn = newValue;
        }
    }