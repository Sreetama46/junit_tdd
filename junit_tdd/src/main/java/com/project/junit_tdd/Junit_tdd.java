package com.project.junit_tdd;

public class Junit_tdd {
		public String check(String s)
		{
			if(s.charAt(0)=='A' && s.charAt(1)=='A')
				s=s.substring(2);
			else if(s.charAt(0)=='A')
				s=s.substring(1);
			else if(s.charAt(1)=='A')
				s=s.replace("A", "");
			return s;
		}
	
	}


