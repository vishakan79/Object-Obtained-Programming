package com.vishakan.singleton;

public class singleton {

        private static  int num=10;
        private singleton()
        {

        }
        private static singleton instance;
        public static singleton getInstance()
        {
            if(instance==null)
            {
                instance = new singleton();
            }
            return instance;
        }

    }
