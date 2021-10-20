package com.mycomp.in.implementaion;

import com.mycomp.in.intities.IPerson;

public class InnerClass {
    // Anonymous inner class inside a method
    public void implementIperson(){
        IPerson person = new IPerson(){

            @Override
            public int uuid() {
                // TODO Auto-generated method stub
                return 0;
            }

            @Override
            public String name() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public String address() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public String changeAddress(String newAddress) {
                // TODO Auto-generated method stub
                return null;
            }
            
        };
    }
    // Anonymous Inner class
    IPerson person = new IPerson(){

        @Override
        public int uuid() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public String name() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public String address() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public String changeAddress(String newAddress) {
            // TODO Auto-generated method stub
            return null;
        }
        
    };
}
